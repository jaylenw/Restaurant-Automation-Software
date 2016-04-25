import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;


public class FloorServer {

    /*
    *The port that the server will listen on
    */

    private static final int PORT = 8888;

    public static void main(String[] args) throws IOException{

      ServerSocket server = new ServerSocket(PORT);

      System.out.println("Waiting for clients to connect...");

      while(true){

        Socket s = server.accept();
        System.out.println("A client connected.");

      }

    }


}
