package com.til.model.dao;

import java.util.List;

import com.til.model.dto.Cocktail;
import com.til.model.dto.CocktailPageBean;


public interface CocktailDao {
	public void insertCocktail(Cocktail c);
	public List<Cocktail> searchAll(CocktailPageBean bean);
	public Cocktail search(int cid);
	public int cocktailCount(CocktailPageBean bean);
	public void updateCocktail(Cocktail cock);
	public void updateCoctailCnt(Cocktail cock);
	public void deleteCoctail(int idx); 
	
}
