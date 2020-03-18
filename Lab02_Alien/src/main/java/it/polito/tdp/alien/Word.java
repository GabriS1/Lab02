package it.polito.tdp.alien;

public class Word {
	
	private String alienWord;
	private String traslation;
	
	public Word(String alien, String traslation) {
		this.alienWord=alien;
		this.traslation=traslation;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		Word other= (Word) obj;
		if(other.alienWord.compareTo(this.alienWord)==0) {
			return true;
		}else {
			return false;
		}
	}



	public String getAlienWord() {
		return alienWord;
	}

	public String getTraslation() {
		return traslation;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

	public void setTraslation(String traslation) {
		this.traslation = traslation;
	}
	
	
	

}
