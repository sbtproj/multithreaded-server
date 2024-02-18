package at.chat.example.client;

import java.io.IOException;
import java.net.Socket;

public class ChatClient1 extends ChatClient{

    public ChatClient1(Socket sock) throws IOException {
        super(sock);
    }

    public static void main(String[] args) throws IOException {
        new ChatClient1(new Socket("localhost", 4242)).handleUser();
    }
}
