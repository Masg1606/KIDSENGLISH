package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
		
		@Override
		public void start(Stage primaryStage) {
			
			try {
				
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(Main.class.getResource("/Vistas/PantallaPrincipal.fxml"));
				
				Pane ventana = (Pane) loader.load();
				
				Scene scene = new Scene(ventana);
				
				primaryStage.setScene(scene);
				primaryStage.getIcons().add(new Image("Imagenes juego/logo 2.png"));
				primaryStage.show();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		
			
		}
		
		public static void main (String[] args) {
			launch(args);
		}
		
	}