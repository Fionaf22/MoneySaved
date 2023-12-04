package com.two.webapp.moneysaved.mapper.model_entity;

import java.util.HashSet;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.two.webapp.moneysaved.entity.TagEntity;
import com.two.webapp.moneysaved.model.Tag;

public class TagMapperME {

	@Autowired
	BudgetTagMapperME budgetTagMapper;

	public Tag entityToModel(TagEntity entity) {
		if (entity != null) {
			Tag model = new Tag();
			model.setId(entity.getId());
			model.setName(entity.getName());
			model.setDescription(entity.getDescription());
			model.setBudgetTags(entity.getBudgetTags().stream().map(budgetTagMapper::entityToModel)
					.collect(Collectors.toCollection(HashSet::new)));
			return model;
		}
		return null;
	}

	public TagEntity modelToEntity(Tag model) {
		if (model != null) {
			TagEntity entity = new TagEntity();
			entity.setId(model.getId());
			entity.setName(model.getName());
			entity.setDescription(model.getDescription());
			entity.setBudgetTags(model.getBudgetTags().stream().map(budgetTagMapper::modelToEntity)
					.collect(Collectors.toCollection(HashSet::new)));
			return entity;
		}
		return null;
	}

}
