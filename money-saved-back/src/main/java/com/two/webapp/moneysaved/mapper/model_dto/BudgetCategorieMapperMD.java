package com.two.webapp.moneysaved.mapper.model_dto;

import com.two.webapp.moneysaved.dto.BudgetCategorieDTO;
import com.two.webapp.moneysaved.model.BudgetCategorie;

public class BudgetCategorieMapperMD {
	
	private BudgetMapperMD budgetMapper;
	private CategorieMapperMD categorieMapper;

	public BudgetCategorie dtoToModel(BudgetCategorieDTO dto) {
		if (dto != null) {
			BudgetCategorie model = new BudgetCategorie();
			model.setComment(dto.getComment());
			model.setDepenseMax(dto.getDepenseMax());
			model.setId(dto.getId());
			model.setBudget(budgetMapper.dtoToModel(dto.getBudget()));
			model.setCategorie(categorieMapper.dtoToModel(dto.getCategorie()));
			return model;
		}
		return null;
	}

	public BudgetCategorieDTO modelToDTO(BudgetCategorie model) {
		if (model != null) {
			BudgetCategorieDTO dto = new BudgetCategorieDTO();
			dto.setComment(model.getComment());
			dto.setDepenseMax(model.getDepenseMax());
			dto.setId(model.getId());
			dto.setBudget(budgetMapper.modelToDTO(model.getBudget()));
			dto.setCategorie(categorieMapper.modelToDTO(model.getCategorie()));
			return dto;
		}
		return null;
	}

}
