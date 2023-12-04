package com.two.webapp.moneysaved.mapper.model_dto;

import java.util.HashSet;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.two.webapp.moneysaved.dto.BudgetDTO;
import com.two.webapp.moneysaved.model.Budget;

public class BudgetMapperMD {

	@Autowired
	private UtilisateurMapperMD utilisateurMapper;

	@Autowired
	private AnalyseBudgetaireMapperMD analyseMapper;

	@Autowired
	private BudgetCategorieMapperMD budgetCategorieMapper;

	@Autowired
	private BudgetTagMapperMD budgetTagMapper;

	public Budget dtoToModel(BudgetDTO dto) {
		if (dto != null) {
			Budget model = new Budget();
			model.setId(dto.getId());
			model.setMontant(dto.getMontant());
			model.setMonth(dto.getMonth());
			model.setComment(dto.getComment());
			model.setUtilisateur(utilisateurMapper.dtoToModel(dto.getUtilisateur()));
			model.setAnalyse(analyseMapper.dtoToModel(dto.getAnalyse()));
			// model.setBudgetCategories(budgetCategorieMapper.setDTOToSetModel(dto.getBudgetCategories()));
			model.setBudgetCategories(dto.getBudgetCategories().stream()
					.map(a -> budgetCategorieMapper.dtoToModel(a)).collect(Collectors.toCollection(HashSet::new)));
			model.setBudgetTags(dto.getBudgetTags().stream().map(budgetTagMapper::dtoToModel)
					.collect(Collectors.toCollection(HashSet::new)));
			return model;
		}
		return null;
	}

	public BudgetDTO modelToDTO(Budget model) {
		if (model != null) {
			BudgetDTO dto = new BudgetDTO();
			dto.setId(model.getId());
			dto.setMontant(model.getMontant());
			dto.setMonth(model.getMonth());
			dto.setComment(model.getComment());
			dto.setUtilisateur(utilisateurMapper.modelToDTO(model.getUtilisateur()));
			dto.setAnalyse(analyseMapper.modelToDTO(model.getAnalyse()));
			dto.setBudgetCategories(model.getBudgetCategories().stream()
					.map(a -> budgetCategorieMapper.modelToDTO(a)).collect(Collectors.toCollection(HashSet::new)));
			dto.setBudgetTags(model.getBudgetTags().stream().map(budgetTagMapper::modelToDTO)
					.collect(Collectors.toCollection(HashSet::new)));
			return dto;
		}
		return null;
	}

}
