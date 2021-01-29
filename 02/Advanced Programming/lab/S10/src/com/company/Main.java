package com.company;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author BARDIA ARDAKANIAN 9831072
 * @version 0.0
 */
public class Main {

    public static void main(String[] args) {
        // create a server with 8080 port
        int serverPort = 8080;
        // try-with-resource
        try (ServerSocket welcomeServer = new ServerSocket(serverPort)){
            System.out.println("Server started on " + serverPort + " port\nwaiting for clients...");
            // connect a client to the server
            Thread t = new Thread(new Handler(), "Thread Handler");
            t.start();
            // accept a client
            Socket connectionSocket = welcomeServer.accept();

            DataInputStream inFromClient = new DataInputStream(new BufferedInputStream(connectionSocket.getInputStream()));
            // read received data from socket
            String line = inFromClient.readLine();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done");
    }
}
