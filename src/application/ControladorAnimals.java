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
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 * Este controlador es para el juego en la categoria animales
 */
public class ControladorAnimals implements Initializable {
	
	@FXML
	private Button ExitButton;
	
	/**
	 * Inicializa el controlador de la clase.
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Este metodo es para el boton Exit, este cierra la aplicacion
	 * @param event evento del boton del componente del fxml
	 */
	@FXML
	public void Exit (ActionEvent event) {
		System.exit(0);
	}
	
	
}

