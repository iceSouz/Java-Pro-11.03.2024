package org.example;

public class Application {
    public static void main(String[] args) {
        Server server = new Server(8081);
        server.start();
    }
}
