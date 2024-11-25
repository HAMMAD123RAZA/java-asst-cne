// import java.io.*;
// import java.net.*;
// import java.util.Scanner;

// public class Client {
//     public static void main(String[] args) {
//         String serverAddress = "192.168.1.2"; // Example IP
//         int port = 8080;

//         try {
//             // Create socket to connect to the server
//             Socket socket = new Socket(serverAddress, port);

//             // Create output stream to send data to the server
//             PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

//             // Use Scanner for user input
//             Scanner scanner = new Scanner(System.in);
//             System.out.println("Connected to server at " + serverAddress + ":" + port);
//             System.out.println("Enter your message (type 'exit' to quit):");

//             String userMessage;
//             while (true) {
//                 // Read user input
//                 userMessage = scanner.nextLine();

//                 // Exit loop if user types 'exit'
//                 if (userMessage.equalsIgnoreCase("exit")) {
//                     break;
//                 }

//                 // Send the message to the server
//                 output.println(userMessage);
//             }

//             // Close the connections
//             scanner.close();
//             output.close();
//             socket.close();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }

// old code

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String serverAddress = "127.0.0.1";
        int port = 8080;

        try {
            // Create socket to connect to the server
            Socket socket = new Socket(serverAddress, port);

            // Create output stream to send data to server
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Use Scanner for user input
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your message (type 'exit' to quit):");

            String userMessage;
            while (true) {
                // Read user input
                userMessage = scanner.nextLine();

                // Exit loop if user types 'exit'
                if (userMessage.equalsIgnoreCase("exit")) {
                    break;
                }

                // Send the message to the server
                output.println(userMessage);
            }

            // Close the connections
            scanner.close();
            output.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
