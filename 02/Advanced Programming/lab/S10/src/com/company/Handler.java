package com.company;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *********************************************************************
 *
 * connect a client to server
 *
 * server IP : 127.0.0.1:8080
 *
 *********************************************************************
 */
public class Handler implements Runnable {

    @Override
    public void run() {
        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }
        try(Socket client = new Socket("127.0.0.1" , 8080)) {
            System.out.println("client connected to server");
            OutputStream out = client.getOutputStream();
            out.write("this is a massage from client".getBytes());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
