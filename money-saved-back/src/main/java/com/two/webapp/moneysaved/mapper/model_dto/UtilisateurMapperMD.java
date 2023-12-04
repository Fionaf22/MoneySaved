package com.two.webapp.moneysaved.mapper.model_dto;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.two.webapp.moneysaved.dto.UtilisateurDTO;
import com.two.webapp.moneysaved.model.Utilisateur;

public class UtilisateurMapperMD {

	@Autowired
	BudgetMapperMD budgetMapper;

	@Autowired
	DepenseMapperMD depenseMapper;

	public Utilisateur dtoToModel(UtilisateurDTO dto) {
		if (dto != null) {
			Utilisateur model = new Utilisateur();
			model.setEmail(dto.getEmail());
			model.setId(dto.getId());
			model.setNom(dto.getNom());
			model.setPassword(dto.getPassword());
			model.setPrenom(dto.getPrenom());
			model.setUsername(dto.getUsername());
			model.setListBudget(dto.getListBudget().stream().map(budgetMapper::dtoToModel)
					.collect(Collectors.toCollection(ArrayList::new)));
			model.setListDepense(dto.getListDepense().stream().map(depenseMapper::dtoToModel)
					.collect(Collectors.toCollection(ArrayList::new)));
			return model;

		}
		return null;
	}

	public UtilisateurDTO modelToDTO(Utilisateur model) {
		if (model != null) {
			UtilisateurDTO dto = new UtilisateurDTO();
			dto.setEmail(model.getEmail());
			dto.setId(model.getId());
			dto.setNom(model.getNom());
			dto.setPassword(model.getPassword());
			dto.setPrenom(model.getPrenom());
			dto.setUsername(model.getUsername());
			dto.setListBudget(model.getListBudget().stream().map(budgetMapper::modelToDTO)
					.collect(Collectors.toCollection(ArrayList::new)));
			dto.setListDepense(model.getListDepense().stream().map(depenseMapper::modelToDTO)
					.collect(Collectors.toCollection(ArrayList::new)));
			return dto;
		}
		return null;
	}

}
