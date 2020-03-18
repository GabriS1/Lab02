package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;

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
	private TextField txtParola;

	@FXML
	private Button btnTraslate;

	@FXML
	private TextArea txtResult;

	@FXML
	private Button btnClear;

	AlienDictionary dizionario = new AlienDictionary();
	

	@FXML
	void doReset(ActionEvent event) {
		txtResult.clear();
		txtParola.clear();
		txtResult.appendText("Benvenuto nel dizionario alieno"+"\n");
	}

	@FXML
	void doTraslate(ActionEvent event) {
		

		String s1 = "";
		
		s1 = txtParola.getText();
		for(int i=0; i<s1.length(); i++) {
			if(!Character.isAlphabetic(s1.charAt(i)) && !(s1.charAt(i)==' ')) {
				txtResult.setText("Devi inserire delle lettere!!\n");
				return;
			}
		}
		
		String s= s1.toLowerCase();
		
		if (s.contains(" ")) { //caso in cui memorizzo nel dizionario
			String aliena;
			String traduzione;
			aliena = s.substring(0, s.indexOf(" "));
			traduzione = s.substring(s.indexOf(" ") + 1);

			dizionario.addWord(aliena, traduzione);
			
			txtParola.clear();
			txtResult.appendText("Aggiunta la parola al dizionario \n");
			
		}else {  //caso in cui devo solo tradurre
			String risultato = dizionario.translateWord(s);
			txtResult.appendText("La traduzione è: "+risultato+"\n");
			txtParola.clear();
		}
	}

	@FXML
	void initialize() {
		assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'lab22.fxml'.";
		assert btnTraslate != null : "fx:id=\"btnTraslate\" was not injected: check your FXML file 'lab22.fxml'.";
		assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'lab22.fxml'.";
		assert btnClear != null : "fx:id=\"btnClear\" was not injected: check your FXML file 'lab22.fxml'.";

	}
	
	
}