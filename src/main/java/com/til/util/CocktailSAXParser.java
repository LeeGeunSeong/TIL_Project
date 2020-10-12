package com.til.util;

import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import com.til.model.dto.Cocktail;

public class CocktailSAXParser {
	private String cockFilePath = "res/cocktail.xml";
	private List<Cocktail> cocks;
 	public CocktailSAXParser() {
		loadData();
	}
 	
	private void loadData() {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try{
			SAXParser parser = factory.newSAXParser();
			CocktailSAXHandler handler = new CocktailSAXHandler();
			parser.parse(cockFilePath,handler);
			setCocktails(handler.getCocktails());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public List<Cocktail> getCocktails() {
		return cocks;
	}
	public void setCocktails(List<Cocktail> cocks) {
		this.cocks = cocks;
	}
}
