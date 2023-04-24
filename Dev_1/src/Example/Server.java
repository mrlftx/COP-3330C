package Example;

import java.io.*;
import java.net.*;
import java.util.Date;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class Server extends Application {
	boolean prime;

	@Override 
	public void start(Stage primaryStage) {

		TextArea ta = new TextArea();

		Scene scene = new Scene(new ScrollPane(ta), 450, 200);
		primaryStage.setTitle("Server"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 

		new Thread( () -> {
			try {

				ServerSocket serverSocket = new ServerSocket(8000);
				Platform.runLater(() ->
				ta.appendText("Server started at " + new Date() + '\n'));

				Socket socket = serverSocket.accept();

				DataInputStream inputFromClient = new DataInputStream(
						socket.getInputStream());
				DataOutputStream outputToClient = new DataOutputStream(
						socket.getOutputStream());

				while (true) {

					int num = inputFromClient.readInt();

					prime = true;
					if(num <=1) {
						prime = false;
					}
					else {
						for (int i = 2; i <= num / 2; ++i) {
							if (num % i == 0) {
								prime = false;
								break;
							}
						}
					}

					outputToClient.writeBoolean(prime);

					Platform.runLater(() -> {
						/*if(prime) {
							ta.appendText(num + " is prime.\n");
						}
						else{
							ta.appendText(num + " is not prime\n");
						}*/
						ta.appendText("Number recieved is: " + num + "\n");
					});
				}
			}
			catch(IOException ex) {
				ex.printStackTrace();
			}
		}).start();
	}

	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
}