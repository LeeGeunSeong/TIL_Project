package com.til.model.dao;

import java.util.List;

import com.til.model.dto.Cocktail;
import com.til.model.dto.CocktailPageBean;


public interface CocktailDao {
	public void loadData();
	public List<Cocktail> searchAll(CocktailPageBean bean);
	public Cocktail search(int cid);
	public int cocktailCount(CocktailPageBean bean);
}
