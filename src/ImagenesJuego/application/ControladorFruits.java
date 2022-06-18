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
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ControladorFruits implements Initializable {
	
	@FXML
	private Button ExitButton;
	
	
		
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Este metodo es para el boton Go back, este retorna a la pantalla principal
	 * @param event evento del boton del componente del fxml
	 */
	@FXML
	public void goBack(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/Vistas/PantallaPrincipal.fxml"));
			Scene scene = new Scene(root);
			Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		} catch (IOException ex) {
			Logger.getLogger(Controlador1.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
}
