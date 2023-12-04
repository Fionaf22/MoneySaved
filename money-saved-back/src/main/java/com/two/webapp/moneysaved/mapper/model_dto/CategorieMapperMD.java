package com.two.webapp.moneysaved.mapper.model_dto;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.two.webapp.moneysaved.dto.CategorieDTO;
import com.two.webapp.moneysaved.model.Categorie;

public class CategorieMapperMD {


	@Autowired
	BudgetCategorieMapperMD budgetCategorieMapper;

	public Categorie dtoToModel(CategorieDTO dto) {
		if (dto != null) {
			Categorie model = new Categorie();
			model.setId(dto.getId());
			model.setName(dto.getName());
			model.setDescription(dto.getDescription());
			model.setBudgetCategories(dto.getBudgetCategories().stream().map(budgetCategorieMapper::dtoToModel)
					.collect(Collectors.toSet()));
			return model;
		}
		return null;
	}

	public CategorieDTO modelToDTO(Categorie model) {
		if (model != null) {
			CategorieDTO dto = new CategorieDTO();
			dto.setId(model.getId());
			dto.setName(model.getName());
			dto.setDescription(model.getDescription());
			dto.setBudgetCategories(model.getBudgetCategories().stream().map(budgetCategorieMapper::modelToDTO)
					.collect(Collectors.toSet()));
			return dto;
		}
		return null;
	}

}
