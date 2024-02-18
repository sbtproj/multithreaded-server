package at.chat.example.client;

import java.io.IOException;
import java.net.Socket;

public class ChatClient3 extends ChatClient{

    public ChatClient3(Socket sock) throws IOException {
        super(sock);
    }

    public static void main(String[] args) throws IOException {
        new ChatClient3(new Socket("localhost", 4242)).handleUser();
    }
}
