package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class WordEnhanced {
	
	private String alienWord;
	private List<String> translations;
	
	public WordEnhanced(String alien, List<String> translations) {
		this.alienWord=alien;
		this.translations= translations;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		WordEnhanced other= (WordEnhanced) obj;
		if(other.alienWord.compareTo(this.alienWord)==0) {
			return true;
		}else {
			return false;
		}
	}



	public String getAlienWord() {
		return alienWord;
	}

	public List<String> getTraslation() {
		return translations;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

	public void setTraslation(String traslation) {
		this.translations.add(traslation); 
	}
	
	
	

}
