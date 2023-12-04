package com.two.webapp.moneysaved.mapper.model_entity;

import org.springframework.beans.factory.annotation.Autowired;

import com.two.webapp.moneysaved.entity.DetailDepenseEntity;
import com.two.webapp.moneysaved.model.DetailDepense;

public class DetailDepenseMapperME {
	
	@Autowired
	DepenseMapperME depenseMapper;
	
	public DetailDepense entityToModel(DetailDepenseEntity entity) {
		if (entity != null) {
			DetailDepense model = new DetailDepense();
			model.setArticle(entity.getArticle());
			model.setDepense(depenseMapper.entityToModel(entity.getDepense()));
			model.setId(entity.getId());
			model.setMontant(entity.getMontant());
			model.setUtile(entity.getUtile());
			return model;
		}
		return null;

	}

	public DetailDepenseEntity modelToEntity(DetailDepense model) {
		if (model != null) {
			DetailDepenseEntity entity = new DetailDepenseEntity();
			entity.setArticle(model.getArticle());
			entity.setDepense(depenseMapper.modelToEntity(model.getDepense()));
			entity.setId(model.getId());
			entity.setMontant(model.getMontant());
			entity.setUtile(model.getUtile());
			return entity;
		}
		return null;

	}
}
