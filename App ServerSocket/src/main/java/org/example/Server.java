package org.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private int port = 8081;

    public Server(int port) {
        this.port = port;
    }

    public void start() {
        try(ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println(Message.START_SERVER.toString() + port);


            Socket clientSocket = serverSocket.accept();
            System.out.println(Message.SUCCESS_CONNECTION);

            ClientHandler clientHandler = new ClientHandler(clientSocket);
            clientHandler.exchangeMessages();

            clientSocket.close();
        } catch (IOException ex) {
            System.out.println(Message.SERVER_EXCEPTION + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
