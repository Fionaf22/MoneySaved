package com.two.webapp.moneysaved.mapper.model_entity;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.two.webapp.moneysaved.entity.UtilisateurEntity;
import com.two.webapp.moneysaved.model.Utilisateur;

public class UtilisateurMapperME {

	@Autowired
	BudgetMapperME budgetMapper;

	@Autowired
	DepenseMapperME depenseMapper;

	public Utilisateur entityToModel(UtilisateurEntity entity) {
		if (entity != null) {
			Utilisateur model = new Utilisateur();
			model.setEmail(entity.getEmail());
			model.setId(entity.getId());
			model.setNom(entity.getNom());
			model.setPassword(entity.getPassword());
			model.setPrenom(entity.getPrenom());
			model.setUsername(entity.getUsername());
			model.setListBudget(entity.getListBudget().stream().map(budgetMapper::entityToModel)
					.collect(Collectors.toCollection(ArrayList::new)));
			model.setListDepense(entity.getListDepense().stream().map(depenseMapper::entityToModel)
					.collect(Collectors.toCollection(ArrayList::new)));
			return model;

		}
		return null;
	}

	public UtilisateurEntity modelToEntity(Utilisateur model) {
		if (model != null) {
			UtilisateurEntity entity = new UtilisateurEntity();
			entity.setEmail(model.getEmail());
			entity.setId(model.getId());
			entity.setNom(model.getNom());
			entity.setPassword(model.getPassword());
			entity.setPrenom(model.getPrenom());
			entity.setUsername(model.getUsername());
			entity.setListBudget(model.getListBudget().stream().map(budgetMapper::modelToEntity)
					.collect(Collectors.toCollection(ArrayList::new)));
			entity.setListDepense(model.getListDepense().stream().map(depenseMapper::modelToEntity)
					.collect(Collectors.toCollection(ArrayList::new)));
			return entity;
		}
		return null;
	}

}
