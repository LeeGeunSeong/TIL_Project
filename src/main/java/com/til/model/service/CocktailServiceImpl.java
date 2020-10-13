package com.til.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.til.model.dao.CocktailDao;
import com.til.model.dto.Cocktail;
import com.til.model.dto.CocktailException;
import com.til.model.dto.CocktailPageBean;

@Service
public class CocktailServiceImpl implements CocktailService {
	
	@Autowired
	private CocktailDao cocktailDao;
	
	@Override
	public List<Cocktail> searchAll(CocktailPageBean bean) {
		try {
			cocktailDao.searchAll(bean);
		} catch (CocktailException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Cocktail search(int cid) {
		try {
			System.out.println(1);
			return cocktailDao.search(cid);
		} catch (CocktailException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void insertCocktail(Cocktail cock) {
		try {
			cocktailDao.insertCocktail(cock);
		} catch (CocktailException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateCocktail(Cocktail cock) {
		try {
			cocktailDao.updateCocktail(cock);
		} catch (CocktailException e) {
			e.printStackTrace();
		}
	}
}
