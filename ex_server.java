import java.io.*;
import java.net.*;

class TCPServer{
	public static void main(String argv[]) throws Exception{
		String clientSentence;
		String capitializedSentence;
		ServerSocket welcomeSocket = new ServerSocket(6789);

		while(true){
		
			Socket connectionSocket = welcomeSocket.accept();

			BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));

		

		DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
		clientSentence = inFromClient.readLine();

		capitializedSentence = clientSentence.toUpperCase() + '\n';

		outToClient.writeBytes(capitializedSentence);
		}
	}
}
