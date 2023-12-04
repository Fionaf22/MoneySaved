package com.two.webapp.moneysaved.mapper.model_entity;

import java.util.HashSet;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.two.webapp.moneysaved.entity.BudgetEntity;
import com.two.webapp.moneysaved.model.Budget;

@Component
public class BudgetMapperME {
	@Autowired
	private UtilisateurMapperME utilisateurMapper;

	@Autowired
	private AnalyseBudgetaireMapperME analyseMapper;

	@Autowired
	private BudgetCategorieMapperME budgetCategorieMapper;

	@Autowired
	private BudgetTagMapperME budgetTagMapper;

	public Budget entityToModel(BudgetEntity entity) {
		if (entity != null) {
			Budget model = new Budget();
			model.setId(entity.getId());
			model.setMontant(entity.getMontant());
			model.setMonth(entity.getMonth());
			model.setComment(entity.getComment());
			model.setUtilisateur(utilisateurMapper.entityToModel(entity.getUtilisateur()));
			model.setAnalyse(analyseMapper.entityToModel(entity.getAnalyse()));
			// model.setBudgetCategories(budgetCategorieMapper.setEntityToSetModel(entity.getBudgetCategories()));
			model.setBudgetCategories(entity.getBudgetCategories().stream()
					.map(a -> budgetCategorieMapper.entityToModel(a)).collect(Collectors.toCollection(HashSet::new)));
			model.setBudgetTags(entity.getBudgetTags().stream().map(budgetTagMapper::entityToModel)
					.collect(Collectors.toCollection(HashSet::new)));
			return model;
		}
		return null;
	}

	public BudgetEntity modelToEntity(Budget model) {
		if (model != null) {
			BudgetEntity entity = new BudgetEntity();
			entity.setId(model.getId());
			entity.setMontant(model.getMontant());
			entity.setMonth(model.getMonth());
			entity.setComment(model.getComment());
			entity.setUtilisateur(utilisateurMapper.modelToEntity(model.getUtilisateur()));
			entity.setAnalyse(analyseMapper.modelToEntity(model.getAnalyse()));
			entity.setBudgetCategories(model.getBudgetCategories().stream()
					.map(a -> budgetCategorieMapper.modelToEntity(a)).collect(Collectors.toCollection(HashSet::new)));
			entity.setBudgetTags(model.getBudgetTags().stream().map(budgetTagMapper::modelToEntity)
					.collect(Collectors.toCollection(HashSet::new)));
			return entity;
		}
		return null;
	}

}
