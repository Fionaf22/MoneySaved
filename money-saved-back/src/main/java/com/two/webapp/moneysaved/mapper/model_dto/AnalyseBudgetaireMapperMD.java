package com.two.webapp.moneysaved.mapper.model_dto;

import org.springframework.beans.factory.annotation.Autowired;

import com.two.webapp.moneysaved.dto.AnalyseBudgetaireDTO;
import com.two.webapp.moneysaved.model.AnalyseBudgetaire;

public class AnalyseBudgetaireMapperMD {

	@Autowired
	private BudgetMapperMD budgetMapper;

	@Autowired
	private EcartMapperMD ecartMapper;
	
	public AnalyseBudgetaire dtoToModel(AnalyseBudgetaireDTO dto) {
		if (dto != null) {
			AnalyseBudgetaire model = new AnalyseBudgetaire();
			model.setId(dto.getId());
			model.setEcart(ecartMapper.dtoToModel(dto.getEcart()));
			model.setClos(dto.getClos());
			model.setComment(dto.getComment());
			model.setBudget(budgetMapper.dtoToModel(dto.getBudget()));
			return model;
		}
		return null;
	}

	public AnalyseBudgetaireDTO modelToDTO(AnalyseBudgetaire model) {
		if (model != null) {
			AnalyseBudgetaireDTO dto = new AnalyseBudgetaireDTO();
			dto.setId(model.getId());
			dto.setEcart(ecartMapper.modelToDTO(model.getEcart()));
			dto.setClos(model.getClos());
			dto.setComment(model.getComment());
			dto.setBudget(budgetMapper.modelToDTO(model.getBudget()));
			return dto;
		}
		return null;
	}

}
