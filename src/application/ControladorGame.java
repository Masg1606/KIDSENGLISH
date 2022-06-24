package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
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
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 * Este controlador es para el juego en cualquier categoria
 */
public class ControladorGame implements Initializable {
	
	
	public static final int CATEGORIA_ANIMALES = 0;
	public static final int CATEGORIA_FRUTAS = 1;
	public static final int CATEGORIA_NUMEROS = 2;
	private static String COMMON_IMAGE_URL = "ImagenesJuego/";
	
	@FXML
	private Button ExitButton;
	@FXML
	private Button opt1;
	@FXML 
	private Button opt2;
	@FXML 
	private Button opt3;
	@FXML
	private ImageView iv;
	
	private int currentCategory = 0;
	
	private int currentScore = 0;

	private String currentImgUrl = "";
	
	private ArrayList<StageObject> currentList;
	
	private StageObject currentObject;
	
	/**
	 * Inicializa el controlador de la clase.
	 */
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
	
	public void checkAnswer(ActionEvent event) {
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

	public void setCategory(int categoryNum) throws Exception {
		if(categoryNum == CATEGORIA_ANIMALES) {
			currentCategory = CATEGORIA_ANIMALES;
			currentImgUrl = COMMON_IMAGE_URL + "animals/";
		} else if (categoryNum == CATEGORIA_FRUTAS) {
			currentCategory = CATEGORIA_FRUTAS;
			currentImgUrl = COMMON_IMAGE_URL + "fruits/";
		} else {
			currentCategory = CATEGORIA_NUMEROS;
			currentImgUrl = COMMON_IMAGE_URL + "numbers/";
		}
		loadItems();
		if (currentList != null) {
			currentObject = currentList.remove(0);
			opt1.setText(currentObject.getOptions().get(0));
			opt2.setText(currentObject.getOptions().get(1));
			opt3.setText(currentObject.getOptions().get(2));
			setNewImage();
		} else {
			throw new Exception("items could not be loaded");
		}
		
	}

	
	private void setNewImage() {
		Image image = new Image(currentImgUrl + currentObject.getImgUrl());
		iv.setImage(image);
	}
	
	private void loadItems() {
		BufferedReader reader;
		currentList = new ArrayList<StageObject>();
		try {
			reader = new BufferedReader(new FileReader(
					new File("src/" + currentImgUrl + "index.kel")));
			String line = reader.readLine();
			while (line != null) {
				String[] values = line.split(",");
				currentList.add(new StageObject(values[0],values[1],values[2],values[3]));
				line = reader.readLine();
			}
			reader.close();
			Collections.shuffle(currentList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

