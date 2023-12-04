package com.two.webapp.moneysaved.mapper.model_entity;

import org.springframework.beans.factory.annotation.Autowired;

import com.two.webapp.moneysaved.entity.BudgetTagEntity;
import com.two.webapp.moneysaved.model.BudgetTag;

public class BudgetTagMapperME {

	@Autowired
	BudgetMapperME budgetMapper;

	@Autowired
	TagMapperME tagMapper;

	public BudgetTag entityToModel(BudgetTagEntity entity) {
		if (entity != null) {
			BudgetTag model = new BudgetTag();
			model.setId(entity.getId());
			model.setDepenseMax(entity.getDepenseMax());
			model.setComment(entity.getComment());
			model.setBudget(budgetMapper.entityToModel(entity.getBudget()));
			model.setTag(tagMapper.entityToModel(entity.getTag()));
			return model;
		}
		return null;
	}

	public BudgetTagEntity modelToEntity(BudgetTag model) {
		if (model != null) {
			BudgetTagEntity entity = new BudgetTagEntity();
			entity.setId(model.getId());
			entity.setDepenseMax(model.getDepenseMax());
			entity.setComment(model.getComment());
			entity.setBudget(budgetMapper.modelToEntity(model.getBudget()));
			entity.setTag(tagMapper.modelToEntity(model.getTag()));
			return entity;
		}
		return null;
	}
}
