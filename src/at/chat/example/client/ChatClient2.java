package at.chat.example.client;

import java.io.IOException;
import java.net.Socket;

/**
 * Client to connect to ChatServer
 * Start the server first
 *
 * @author Chris Bailey-Kellogg, Dartmouth CS 10, Fall 2012; revised Winter 2014 to separate out ChatClientCommunicator
 */
public class ChatClient2 extends ChatClient{

    public ChatClient2(Socket sock) throws IOException {
        super(sock);
    }

    public static void main(String[] args) throws IOException {
        new ChatClient2(new Socket("localhost", 4242)).handleUser();
    }
}
