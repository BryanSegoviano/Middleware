package gui;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class SocketCliente {

    public static void main(String[] args) {
        int PUERTO = 2888;
        DataOutputStream dos;
        DataInputStream dis;
        try {
            System.out.println("Esperando conexión con el servidor");
            Socket socket = new Socket("localhost", PUERTO);
            System.out.println("Se conecto el socket con puerto: " + PUERTO);
            dos = new DataOutputStream(socket.getOutputStream());
            dis = new DataInputStream(socket.getInputStream());
            FrmAppDos frmAppDos = new FrmAppDos(dos, dis);
            frmAppDos.setVisible(true);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}
