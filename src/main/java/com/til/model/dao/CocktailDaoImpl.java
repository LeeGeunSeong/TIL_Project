package com.til.model.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.til.model.dto.Cocktail;
import com.til.model.dto.CocktailPageBean;

@Repository
public class CocktailDaoImpl implements CocktailDao{
	
	private String ns = "cocktail.";
	
	@Autowired
	private SqlSession session;
	
	public void insertCocktail(Cocktail c) {
		session.insert(ns +"insert", c);
	}
	public List<Cocktail> searchAll(CocktailPageBean bean){
		return session.selectList(ns + "searchAll");
	}
	
	public Cocktail search(int cid) {
		return session.selectOne(ns+"search",cid);
	}
	public int cocktailCount(CocktailPageBean bean){
		return 0;
	}
	
	public void updateCocktail(Cocktail cock) {
		session.update(ns+"update",cock);
	}
	public void updateCoctailCnt(Cocktail cock) {
		session.update(ns+"updateCnt",cock);
	}
	public void deleteCoctail(int idx) {
		session.delete(ns+"delete",idx);
	}
}
