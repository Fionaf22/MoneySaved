package com.two.webapp.moneysaved.mapper.model_entity;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.two.webapp.moneysaved.entity.DepenseEntity;
import com.two.webapp.moneysaved.model.Depense;

public class DepenseMapperME {

	@Autowired
	CategorieMapperME categorieMapper;
	@Autowired
	TagMapperME tagMapper;
	@Autowired
	UtilisateurMapperME utilisateurMapper;
	@Autowired
	DetailDepenseMapperME detailDepenseMapper;

	public Depense entityToModel(DepenseEntity entity) {
		if (entity != null) {
			Depense model = new Depense();
			model.setId(entity.getId());
			model.setDate(entity.getDate());
			model.setMontant(entity.getMontant());
			model.setTitle(entity.getTitle());
			model.setCategory(categorieMapper.entityToModel(entity.getCategory()));
			model.setUtilisateur(utilisateurMapper.entityToModel(entity.getUtilisateur()));
			model.setListDetail(entity.getListDetail().stream().map(detailDepenseMapper::entityToModel)
					.collect(Collectors.toCollection(ArrayList::new)));
			model.setTags(entity.getTags().stream().map(a -> tagMapper.entityToModel(a))
					.collect(Collectors.toCollection(ArrayList::new)));
			model.setType(entity.getType());
			model.setStoreName(entity.getStoreName());
			return model;
		}
		return null;
	}

	public DepenseEntity modelToEntity(Depense model) {
		if (model != null) {
			DepenseEntity entity = new DepenseEntity();

			entity.setCategory(categorieMapper.modelToEntity(model.getCategory()));
			entity.setDate(model.getDate());
			entity.setId(model.getId());
			entity.setListDetail(model.getListDetail().stream().map(detailDepenseMapper::modelToEntity)
					.collect(Collectors.toCollection(ArrayList::new)));
			entity.setMontant(model.getMontant());
			entity.setTags(model.getTags().stream().map(a-> tagMapper.modelToEntity(a)).collect(Collectors.toCollection(ArrayList:: new)));
			entity.setTitle(model.getTitle());
			entity.setType(model.getType());
			entity.setUtilisateur(utilisateurMapper.modelToEntity(model.getUtilisateur()));
			entity.setStoreName(model.getStoreName());
			return entity;
		}
		return null;
	}
}
