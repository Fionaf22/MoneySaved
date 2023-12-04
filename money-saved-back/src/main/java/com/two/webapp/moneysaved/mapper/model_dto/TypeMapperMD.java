package com.two.webapp.moneysaved.mapper.model_dto;

import com.two.webapp.moneysaved.dto.TypeDTO;
import com.two.webapp.moneysaved.model.Type;

public class TypeMapperMD {
	public TypeDTO modelToDto(Type model) {
		if (model != null) {
			switch (model) {
			case COURANTE:
				return TypeDTO.COURANTE;
			case FIXE:
				return TypeDTO.FIXE;
			case OCCASIONNELLE:
				return TypeDTO.OCCASIONNELLE;
			default:
				throw new IllegalArgumentException("Type inconnu " + model);
			}
		}
		return null;
	}
	
	public Type dtoToModel(TypeDTO dto) {
		if (dto != null) {
			switch (dto) {
			case COURANTE:
				return Type.COURANTE;
			case FIXE:
				return Type.FIXE;
			case OCCASIONNELLE:
				return Type.OCCASIONNELLE;
			default:
				throw new IllegalArgumentException("Type inconnu " + dto);
			}
		}
		return null;
	}
}
