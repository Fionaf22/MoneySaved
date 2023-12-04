package com.two.webapp.moneysaved.mapper.model_dto;

import org.springframework.beans.factory.annotation.Autowired;

import com.two.webapp.moneysaved.dto.BudgetTagDTO;
import com.two.webapp.moneysaved.model.BudgetTag;

public class BudgetTagMapperMD {

	@Autowired
	BudgetMapperMD budgetMapper;

	@Autowired
	TagMapperMD tagMapper;

	public BudgetTag dtoToModel(BudgetTagDTO dto) {
		if (dto != null) {
			BudgetTag model = new BudgetTag();
			model.setId(dto.getId());
			model.setDepenseMax(dto.getDepenseMax());
			model.setComment(dto.getComment());
			model.setBudget(budgetMapper.dtoToModel(dto.getBudget()));
			model.setTag(tagMapper.dtoToModel(dto.getTag()));
			return model;
		}
		return null;
	}

	public BudgetTagDTO modelToDTO(BudgetTag model) {
		if (model != null) {
			BudgetTagDTO dto = new BudgetTagDTO();
			dto.setId(model.getId());
			dto.setDepenseMax(model.getDepenseMax());
			dto.setComment(model.getComment());
			dto.setBudget(budgetMapper.modelToDTO(model.getBudget()));
			dto.setTag(tagMapper.modelToDTO(model.getTag()));
			return dto;
		}
		return null;
	}
}
