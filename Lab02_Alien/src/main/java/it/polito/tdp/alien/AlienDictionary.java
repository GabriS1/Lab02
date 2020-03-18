package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {

	private List<WordEnhanced> words = new LinkedList<WordEnhanced>();

	public void addWord(String alienWord, String translation) {

		LinkedList<String> l = new LinkedList<String>();
		l.add(translation);
		WordEnhanced w = new WordEnhanced(alienWord, l);

		for (WordEnhanced wi : words) {
			if (wi.equals(w)) {
				wi.setTraslation(translation);
			}
		}

		words.add(w);

	}

	public String translateWord(String alienWord) {

		boolean b = false;

		for (int i = 0; i < alienWord.length(); i++) {
			if (alienWord.charAt(i) == '?') {
				b = true;
			}
		}

		if (b == false) {
			for (WordEnhanced w : words) {
				if (w.getAlienWord().compareTo(alienWord) == 0) {
					String s = "";
					LinkedList<String> l = new LinkedList<String>(w.getTraslation());
					for (int i = 0; i < l.size(); i++) {
						s += l.get(i) + "; ";
					}
					return s;
				}
			}
		}

		if (b == true) {
			String s1 = "";
			String s2 = "";
			s1 = alienWord.substring(0, alienWord.indexOf("?"));
			s2 = alienWord.substring(alienWord.indexOf("?") + 1);
			int pos = alienWord.indexOf("?");

			for (WordEnhanced w : words) {
				String a1 = w.getAlienWord().substring(0, pos);
				String a2 = w.getAlienWord().substring(pos + 1);
				if (a1.compareTo(s1) == 0 && a2.compareTo(s2) == 0) {
					String s = "";
					LinkedList<String> l = new LinkedList<String>(w.getTraslation());
					for (int i = 0; i < l.size(); i++) {
						s += l.get(i) + "; ";
					}
					return s;
				}

			}
		}
		return null;

	}

}
