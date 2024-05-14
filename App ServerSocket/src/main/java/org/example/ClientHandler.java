package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientHandler {
    private static final Logger LOGGER = Logger.getLogger(ClientHandler.class.getName());
    private Socket clientSocket;
    private BufferedReader input;
    private PrintWriter output;
    private String regexPattern = ".*[а-яА-Я].*";

    public ClientHandler(Socket clientSocket) throws IOException {
        this.clientSocket = clientSocket;
        input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        output = new PrintWriter(clientSocket.getOutputStream());
    }

    public void exchangeMessages() throws IOException {
        output.println(Message.GREETING);
        output.flush();

        String clientMessage = input.readLine();
        LOGGER.log(Level.INFO, "Client message: " + clientMessage);

        if (clientMessage != null && clientMessage.matches(regexPattern)) {
            output.println(Message.QUESTION);
            output.flush();
            String answer = input.readLine();
            LOGGER.log(Level.INFO, "Client answer: " + answer);

            if (answer != null && answer.equalsIgnoreCase(String.valueOf(Message.ANSWER))) {
                output.println(Message.CURRENT_DATE_AND_TIME.toString() + LocalDateTime.now());
                output.flush();
                LOGGER.log(Level.INFO, "Sent current date and time to client.");
            } else {
                output.println(Message.WRONG_ANSWER);
                output.flush();
                clientSocket.close();
                LOGGER.log(Level.WARNING, "Client provided incorrect answer. Connection closed.");
            }
        }
    }
}
