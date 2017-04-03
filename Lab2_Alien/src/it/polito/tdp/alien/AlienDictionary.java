package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {

	//private List<Word> listaDizionario= new LinkedList<Word>();
	private TreeMap<String, Word> mappaDizionario= new TreeMap<String,Word>();
	
	public void addWord(String alienWord, String translation){
		Word w = new Word(alienWord, translation);
		     if(mappaDizionario.containsKey(alienWord)){
		    	 w.setTranslation(translation);
		    	 mappaDizionario.put(alienWord, w);
		     }else{
		    	 mappaDizionario.put(alienWord, w);
		     }
		     
		     
		}
	
	
	public String translateWord(String alienWord){
		Word w = mappaDizionario.get(alienWord);
		if(w==null)
			return null;
		return w.getTranslation();
		
	}
	
}
