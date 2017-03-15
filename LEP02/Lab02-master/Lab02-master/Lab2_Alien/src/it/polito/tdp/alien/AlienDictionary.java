package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {

	//il dizionario e' una lista di oggetti di classe Word
	
	List<Word> listaDizionario = new LinkedList<Word>();
	TreeMap<String, Word> mappaDizionario = new TreeMap<String, Word>();
	
	public void addWord(String alienWord, String translation){
		Word w = new Word(alienWord, translation);
		if(mappaDizionario.containsKey(alienWord)){
			w.setTranslation(translation);
		}
		listaDizionario.add(w);
		mappaDizionario.put(w.getAlienWord(), w);
	}
	
	
}

