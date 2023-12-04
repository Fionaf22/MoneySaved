package com.two.webapp.moneysaved.mapper.model_dto;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.two.webapp.moneysaved.dto.DepenseDTO;
import com.two.webapp.moneysaved.model.Depense;

public class DepenseMapperMD {

	@Autowired
	CategorieMapperMD categorieMapper;
	@Autowired
	TagMapperMD tagMapper;
	@Autowired
	UtilisateurMapperMD utilisateurMapper;
	@Autowired
	DetailDepenseMapperMD detailDepenseMapper;
	@Autowired
	TypeMapperMD typeMapper;

	public Depense dtoToModel(DepenseDTO dto) {
		if (dto != null) {
			Depense model = new Depense();
			model.setId(dto.getId());
			model.setDate(dto.getDate());
			model.setMontant(dto.getMontant());
			model.setTitle(dto.getTitle());
			model.setCategory(categorieMapper.dtoToModel(dto.getCategory()));
			model.setUtilisateur(utilisateurMapper.dtoToModel(dto.getUtilisateur()));
			model.setListDetail(dto.getListDetail().stream().map(detailDepenseMapper::dtoToModel)
					.collect(Collectors.toCollection(ArrayList::new)));
			model.setTags(dto.getTags().stream().map(a -> tagMapper.dtoToModel(a))
					.collect(Collectors.toCollection(ArrayList::new)));
			model.setType(typeMapper.dtoToModel(dto.getType()));
			return model;
		}
		return null;
	}

	public DepenseDTO modelToDTO(Depense model) {
		if (model != null) {
			DepenseDTO dto = new DepenseDTO();

			dto.setCategory(categorieMapper.modelToDTO(model.getCategory()));
			dto.setDate(model.getDate());
			dto.setId(model.getId());
			dto.setListDetail(model.getListDetail().stream().map(detailDepenseMapper::modelToDTO)
					.collect(Collectors.toCollection(ArrayList::new)));
			dto.setMontant(model.getMontant());
			dto.setTags(null);
			dto.setTitle(model.getTitle());
			dto.setType(typeMapper.modelToDto(model.getType()));
			dto.setUtilisateur(utilisateurMapper.modelToDTO(model.getUtilisateur()));
			return dto;
		}
		return null;
	}
}
