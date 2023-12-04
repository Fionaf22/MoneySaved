package com.two.webapp.moneysaved.mapper.model_dto;

import java.util.HashSet;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.two.webapp.moneysaved.dto.TagDTO;
import com.two.webapp.moneysaved.model.Tag;

public class TagMapperMD {


	@Autowired
	BudgetTagMapperMD budgetTagMapper;

	public Tag dtoToModel(TagDTO dto) {
		if (dto != null) {
			Tag model = new Tag();
			model.setId(dto.getId());
			model.setName(dto.getName());
			model.setDescription(dto.getDescription());
			model.setBudgetTags(dto.getBudgetTags().stream().map(budgetTagMapper::dtoToModel)
					.collect(Collectors.toCollection(HashSet::new)));
			return model;
		}
		return null;
	}

	public TagDTO modelToDTO(Tag model) {
		if (model != null) {
			TagDTO dto = new TagDTO();
			dto.setId(model.getId());
			dto.setName(model.getName());
			dto.setDescription(model.getDescription());
			dto.setBudgetTags(model.getBudgetTags().stream().map(budgetTagMapper::modelToDTO)
					.collect(Collectors.toCollection(HashSet::new)));
			return dto;
		}
		return null;
	}

}
