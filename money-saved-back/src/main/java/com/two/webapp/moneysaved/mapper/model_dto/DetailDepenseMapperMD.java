package com.two.webapp.moneysaved.mapper.model_dto;

import org.springframework.beans.factory.annotation.Autowired;

import com.two.webapp.moneysaved.dto.DetailDepenseDTO;
import com.two.webapp.moneysaved.model.DetailDepense;

public class DetailDepenseMapperMD {
	
	@Autowired
	DepenseMapperMD depenseMapper;
	
	public DetailDepense dtoToModel(DetailDepenseDTO dto) {
		if (dto != null) {
			DetailDepense model = new DetailDepense();
			model.setArticle(dto.getArticle());
			model.setDepense(depenseMapper.dtoToModel(dto.getDepense()));
			model.setId(dto.getId());
			model.setMontant(dto.getMontant());
			model.setUtile(dto.getUtile());
			return model;
		}
		return null;

	}

	public DetailDepenseDTO modelToDTO(DetailDepense model) {
		if (model != null) {
			DetailDepenseDTO dto = new DetailDepenseDTO();
			dto.setArticle(model.getArticle());
			dto.setDepense(depenseMapper.modelToDTO(model.getDepense()));
			dto.setId(model.getId());
			dto.setMontant(model.getMontant());
			dto.setUtile(model.getUtile());
			return dto;
		}
		return null;

	}
}
