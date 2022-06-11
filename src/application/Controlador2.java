package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Controlador2 implements Initializable {
	
	//Este controlador maneja las categorias que tendra el juego
	
	// activamos botones de la ventana
	
	@FXML
	private Button ExitButton;
	private Button Animals;
	private Button Fruits;
	private Button Numbers;
	
	
		
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	// metodo exit para salir del juego
	@FXML
	public void Exit (ActionEvent event) {
		System.exit(0);
		
	}
	// metodo que nos carga el menu animals
	@FXML
	public void MenuAnimals (ActionEvent event) {
		
		try {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vistas/Animals.fxml"));
		
		Parent root = loader.load();
		
		ControladorAnimals controlador = loader.getController();
		
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.setScene(scene);
		stage.getIcons().add(new Image("Imagenes juego/logo 2.png"));
		stage.showAndWait();
		
		
		
		
		
		
	} catch (IOException ex) {
		Logger.getLogger(Controlador1.class.getName()).log(Level.SEVERE, null, ex);
		
		}
	
	}
	
	// metodo que nos carga el menu Fruits
	@FXML
	public void MenuFruits (ActionEvent event) {
		
		try {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vistas/Fruits.fxml"));
		
		Parent root = loader.load();
		
		ControladorFruits controlador = loader.getController();
		
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.setScene(scene);
		stage.getIcons().add(new Image("Imagenes juego/logo 2.png"));
		stage.showAndWait();
		
		
		
		
		
		
	} catch (IOException ex) {
		Logger.getLogger(Controlador1.class.getName()).log(Level.SEVERE, null, ex);
		
		}
	
	}
	
	// metodo que nos carga el menu Numbers
	
	@FXML
	public void MenuNumbers (ActionEvent event) {
		
		try {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vistas/Numbers.fxml"));
		
		Parent root = loader.load();
		
		ControladorNumbers controlador = loader.getController();
		
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.setScene(scene);
		stage.getIcons().add(new Image("Imagenes juego/logo 2.png"));
		stage.showAndWait();
		
		
		
		
		
		
	} catch (IOException ex) {
		Logger.getLogger(Controlador1.class.getName()).log(Level.SEVERE, null, ex);
		
		}
	
	}
}

