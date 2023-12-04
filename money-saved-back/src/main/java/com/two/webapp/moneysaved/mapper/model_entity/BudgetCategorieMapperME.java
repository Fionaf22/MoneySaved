package com.two.webapp.moneysaved.mapper.model_entity;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.two.webapp.moneysaved.entity.BudgetCategorieEntity;
import com.two.webapp.moneysaved.model.BudgetCategorie;
import java.util.Collections;

public class BudgetCategorieMapperME {

	@Autowired
	private BudgetMapperME budgetMapper;

	@Autowired
	private CategorieMapperME categorieMapper;

	public Set<BudgetCategorie> setEntityToSetModel(Set<BudgetCategorieEntity> setEntity) {
		Set<BudgetCategorie> setModel = new HashSet<>();
		if (!setEntity.isEmpty() && setEntity != null) {
			setEntity.forEach(y -> {
				BudgetCategorie model = new BudgetCategorie();
				model.setComment(y.getComment());
				model.setDepenseMax(y.getDepenseMax());
				model.setId(y.getId());
				model.setBudget(budgetMapper.entityToModel(y.getBudget()));
				model.setCategorie(categorieMapper.entityToModel(y.getCategorie()));
				setModel.add(model);
			});
			return setModel;
		}
		return Collections.emptySet();
	}

	public BudgetCategorie entityToModel(BudgetCategorieEntity entity) {
		if (entity != null) {
			BudgetCategorie model = new BudgetCategorie();
			model.setComment(entity.getComment());
			model.setDepenseMax(entity.getDepenseMax());
			model.setId(entity.getId());
			model.setBudget(budgetMapper.entityToModel(entity.getBudget()));
			model.setCategorie(categorieMapper.entityToModel(entity.getCategorie()));
			return model;
		}
		return null;
	}

	public Set<BudgetCategorieEntity> setModelToSetEntity(Set<BudgetCategorie> setModel) {
		Set<BudgetCategorieEntity> setEntity = new HashSet<>();
		if (!setModel.isEmpty() && setModel != null) {
			setModel.forEach(model -> {
				BudgetCategorieEntity entity = new BudgetCategorieEntity();
				entity.setComment(model.getComment());
				entity.setDepenseMax(model.getDepenseMax());
				entity.setId(model.getId());
				entity.setBudget(budgetMapper.modelToEntity(model.getBudget()));
				entity.setCategorie(categorieMapper.modelToEntity(model.getCategorie()));
				setEntity.add(entity);
			});
			return setEntity;
		}
		return Collections.emptySet();
	}

	public BudgetCategorieEntity modelToEntity(BudgetCategorie model) {
		if (model != null) {
			BudgetCategorieEntity entity = new BudgetCategorieEntity();
			entity.setComment(model.getComment());
			entity.setDepenseMax(model.getDepenseMax());
			entity.setId(model.getId());
			entity.setBudget(budgetMapper.modelToEntity(model.getBudget()));
			entity.setCategorie(categorieMapper.modelToEntity(model.getCategorie()));
			return entity;
		}
		return null;
	}

}
