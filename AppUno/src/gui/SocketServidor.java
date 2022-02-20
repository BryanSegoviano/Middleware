package gui;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServidor {

    public static void main(String[] args) {
        ServerSocket serverSocket;
        Socket socket;
        DataOutputStream dos;
        DataInputStream dis;
        try {
            int PUERTO = 2888;
            serverSocket = new ServerSocket(PUERTO);
            System.out.println("Aplicación Uno iniciada, esperando Aplicación Dos para abrir UI.");
            socket = serverSocket.accept();
            System.out.println("Se unio un socket (AppDos)");
            dos = new DataOutputStream(socket.getOutputStream());
            dis = new DataInputStream(socket.getInputStream());
            FrmAppUno frmAppUno = new FrmAppUno(dos, dis);
            frmAppUno.setVisible(true);
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

}
