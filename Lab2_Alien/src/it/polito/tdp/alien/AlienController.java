/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */

package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {

	AlienDictionary ad = new AlienDictionary();
	String listaTrad="";
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtField"
    private TextField txtField; // Value injected by FXMLLoader

    @FXML // fx:id="btnTranslate"
    private Button btnTranslate; // Value injected by FXMLLoader

    @FXML // fx:id="txtArea"
    private TextArea txtArea; // Value injected by FXMLLoader

    @FXML // fx:id="btnClearText"
    private Button btnClearText; // Value injected by FXMLLoader

    @FXML
    void doClearText(ActionEvent event) {
    	txtArea.clear();

    }

    @FXML
    void doTranslate(ActionEvent event) {
    	String a = txtField.getText();
    	if(a.contains(" ")){
    		String array[]=a.split(" ");
    		String alienW = array[0].trim().toLowerCase();
    		String transl= array[1].trim().toLowerCase();
    		ad.addWord(alienW, transl);
    		
    		//txtArea.setText(alienW+" "+transl);
    		
    	}else{
    		String alien = txtField.getText();
    		 
    		listaTrad += ad.translateWord(alien)+"\n";
    		txtArea.setText(listaTrad.trim());
    	}

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtField != null : "fx:id=\"txtField\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
        assert txtArea != null : "fx:id=\"txtArea\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnClearText != null : "fx:id=\"btnClearText\" was not injected: check your FXML file 'Alien.fxml'.";

    }
}

