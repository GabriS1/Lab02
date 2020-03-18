package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	private List<Word> words = new LinkedList<Word>();
	
	
	public void addWord(String alienWord, String translation) {
		
		Word w = new Word(alienWord, translation);
		
		for(Word wi: words) {
			if(wi.equals(w)) {
				wi.setTraslation(translation);
			}
		}
		
		words.add(w);
		
	}
	
	public String translateWord(String alienWord) {
		for(Word w : words) {
			if(w.getAlienWord().compareTo(alienWord)==0) {
				return w.getTraslation();
				//return "ciao";
			}
		}
		return null;
		//return "ciao1";
	}


}
