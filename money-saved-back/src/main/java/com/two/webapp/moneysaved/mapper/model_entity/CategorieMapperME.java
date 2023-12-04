package com.two.webapp.moneysaved.mapper.model_entity;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.two.webapp.moneysaved.entity.CategorieEntity;
import com.two.webapp.moneysaved.model.Categorie;

public class CategorieMapperME {

	@Autowired
	BudgetCategorieMapperME budgetCategorieMapper;

	public Categorie entityToModel(CategorieEntity entity) {
		if (entity != null) {
			Categorie model = new Categorie();
			model.setId(entity.getId());
			model.setName(entity.getName());
			model.setDescription(entity.getDescription());
			model.setBudgetCategories(entity.getBudgetCategories().stream().map(budgetCategorieMapper::entityToModel)
					.collect(Collectors.toSet()));
			return model;
		}
		return null;
	}

	public CategorieEntity modelToEntity(Categorie model) {
		if (model != null) {
			CategorieEntity entity = new CategorieEntity();
			entity.setId(model.getId());
			entity.setName(model.getName());
			entity.setDescription(model.getDescription());
			entity.setBudgetCategories(model.getBudgetCategories().stream().map(budgetCategorieMapper::modelToEntity)
					.collect(Collectors.toSet()));
			return entity;
		}
		return null;
	}

}
