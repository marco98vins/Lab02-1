/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.alien.model.Aliena;
import it.polito.tdp.alien.model.Dizionario;
import it.polito.tdp.alien.model.Tradotta;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnClear;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextField txtInput;

    @FXML
    private TextArea txtOutput;

    @FXML
    void doClearText(ActionEvent event) {
    	txtInput.clear();
    	txtOutput.clear();	
    }
    // Aliena aliena;
    // Tradotta tradotta;
    String[] testo;
    Dizionario dizionario;
    
    @FXML
    void doTranslate(ActionEvent event) {
    	testo = txtInput.getText().toLowerCase().split(" ");
    	
    	if(testo.length==2) {
    		
    		if(testo[0].matches("[A-Z][a-z]*") == false && testo[1].matches("[A-Z][a-z]*") == false){
    		
    		System.out.println(testo[0] +", "+ testo[1]);
    		
    		this.dizionario.nuovaParola(testo[0], testo[1]);
    		
    	}
    	else {
    		txtOutput.setText("Inserire solo lettere, no numeri o caratteri speciali");
    	}
    	
    	}
    	else {
    		txtOutput.setText(dizionario.cercaParola(testo[0]));
    		
    	}
    	
    }
    //(^.*[0-9].*$)

    
    public void setModel(Dizionario model) {
    	this.dizionario = model;
    }
    @FXML
    void initialize() {
        assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtInput != null : "fx:id=\"txtInput\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtOutput != null : "fx:id=\"txtOutput\" was not injected: check your FXML file 'Scene.fxml'.";

    }

}
