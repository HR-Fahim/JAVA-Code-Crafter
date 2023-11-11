

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class Server {
	public static ServerSocket server = null;
	private static Socket socket = null;
	private static final int port = 8086;

	public static void main(String[] args) {

		// Create IO Objects
		BufferedReader in = null;
		PrintWriter out = null;
		Scanner consoleInput = new Scanner(System.in);

		// Start Server
		try {
			System.out.println("Server is startings...");
			server = new ServerSocket(port);
			System.out.println("Server has started");
		} catch (IOException e) {
			System.out.println("can not listen to port:" + port);
			System.exit(-1);
		}
		while (true) {
			// Create Socket
			try {
				socket = server.accept();
				System.out.println("Client has been connected\n");
			} catch (IOException e) {
				System.out.println("Communication Error with client");
				System.exit(-1);
			}

			try {
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream(), true);

				out.println("NSU CSE438 LAB Server");
				System.out.println(in.readLine());

				while (socket.isConnected()) {
					System.out.print("Server:");
					out.println(consoleInput.nextLine());
					System.out.print("Client:");
					System.out.println(in.readLine());
				}
			} catch (IOException e) {
				System.out.print("Clent left");
				consoleInput.close();
			}
		}
	}
}
