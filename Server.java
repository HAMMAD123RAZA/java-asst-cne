// import java.io.*;
// import java.net.*;

// public class Server {
//     public static void main(String[] args) {
//         int port = 8080;

//         try {
//             // Create server socket
//             ServerSocket serverSocket = new ServerSocket(port);
//             System.out.println("Server is waiting for a connection on port " + port);

//             // Accept a client connection
//             Socket clientSocket = serverSocket.accept();
//             System.out.println("Client connected from: " + clientSocket.getInetAddress());

//             // Create input stream to read data from client
//             BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//             String clientMessage;

//             // Read messages from the client and display them
//             while ((clientMessage = input.readLine()) != null) {
//                 System.out.println("Client: " + clientMessage);
//             }

//             // Close the connections
//             input.close();
//             clientSocket.close();
//             serverSocket.close();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }
 


//old code//

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        int port = 8080;

        try {
            // Create server socket
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server is waiting for a connection...");

            // Accept a client connection
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            // Create input stream to read data from client
            BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String clientMessage;

            // Read message from client and display it
            while ((clientMessage = input.readLine()) != null) {
                System.out.println("Client: " + clientMessage);
            }

            // Close the connections
            input.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
