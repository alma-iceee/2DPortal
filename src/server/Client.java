package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8000);

        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeUTF("Hello Server");

        DataInputStream dis = new DataInputStream(socket.getInputStream());
        System.out.println(dis.readUTF());

        socket.close();
    }
}
