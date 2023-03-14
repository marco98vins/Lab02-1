package it.polito.tdp.alien.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Dizionario {
	
	
	TreeMap<String,String> parole;
	
	public Dizionario() {
		this.parole = new TreeMap<>();
	}
	
	public void nuovaParola(String a, String t) {
		parole.put(a,t);
	}
	
	public String cercaParola(String a) {
		String c=parole.get(a);
		return c;
	}

}
