package com.two.webapp.moneysaved.mapper.model_entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.two.webapp.moneysaved.entity.AnalyseBudgetaireEntity;
import com.two.webapp.moneysaved.model.AnalyseBudgetaire;

@Component
public class AnalyseBudgetaireMapperME {

	@Autowired
	private BudgetMapperME budgetMapper;

	public AnalyseBudgetaire entityToModel(AnalyseBudgetaireEntity entity) {
		if (entity != null) {
			AnalyseBudgetaire model = new AnalyseBudgetaire();
			model.setId(entity.getId());
			model.setEcart(entity.getEcart());
			model.setClos(entity.getClos());
			model.setComment(entity.getComment());
			model.setBudget(budgetMapper.entityToModel(entity.getBudget()));
			return model;
		}
		return null;
	}

	public AnalyseBudgetaireEntity modelToEntity(AnalyseBudgetaire model) {
		if (model != null) {
			AnalyseBudgetaireEntity entity = new AnalyseBudgetaireEntity();
			entity.setId(model.getId());
			entity.setEcart(model.getEcart());
			entity.setClos(model.getClos());
			entity.setComment(model.getComment());
			entity.setBudget(budgetMapper.modelToEntity(model.getBudget()));
			return entity;
		}
		return null;
	}
}
