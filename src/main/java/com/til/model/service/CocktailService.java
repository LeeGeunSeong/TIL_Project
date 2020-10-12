package com.til.model.service;

import java.util.List;

import com.til.model.dto.Cocktail;
import com.til.model.dto.CocktailPageBean;

public interface CocktailService {
	public List<Cocktail> searchAll(CocktailPageBean bean);
	public Cocktail search(int cid);
	public List<Cocktail> searchBest();
	public List<Cocktail> searchBestIndex();
}
