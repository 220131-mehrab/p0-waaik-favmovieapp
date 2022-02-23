package favmovieapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MovieServer {
    //Field. Allows other classes to use.
    public static ServerSocket server;

    public MovieServer(int port) {

        try {
            server = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run(MovieService) {
        while (server.isBound())
            //incoming client
        {
            try {
                Socket socket = server.accept();
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                for (String movieJson : movieJson.movieRay)
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
