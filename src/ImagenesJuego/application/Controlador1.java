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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 * este controlador es para la pagina principal, activamos los dos botones "Exit" y "Start".
 * aqui nombramos los botones de la ventana los nombres deben coincidir con los archivos fxml
 */
public class Controlador1 implements Initializable {
	
	@FXML
	private Button ExitButton;
	private Button Start;
	
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
	
	/**
	 * Metodo start para iniciar el juego
	 * @param event evento del boton start
	 */
	@FXML
	public void Empezar (ActionEvent event) {	
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/Vistas/MenuCategorias.fxml"));
			Scene scene = new Scene(root);
			Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();	
		} catch (IOException ex) {
			Logger.getLogger(Controlador1.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}

