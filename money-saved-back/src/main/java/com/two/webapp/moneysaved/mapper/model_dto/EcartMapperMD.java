package com.two.webapp.moneysaved.mapper.model_dto;

import com.two.webapp.moneysaved.dto.EcartDTO;
import com.two.webapp.moneysaved.model.Ecart;

public class EcartMapperMD {

	public EcartDTO modelToDTO(Ecart model) {
		if (model != null) {
			EcartDTO dto = null;
			switch (model) {
			case NEGATIVE:
				dto = EcartDTO.NEGATIVE;
				break;
			case POSITIVE:
				dto = EcartDTO.POSITIVE;
				break;
			case ZERO:
				dto = EcartDTO.ZERO;
				break;
			default:
				throw new IllegalArgumentException("Valeur impossible: " + model);
			}
			return dto;
		} else {
			return null;
		}
	}

	public Ecart dtoToModel(EcartDTO dto) {
		if (dto != null) {
			Ecart model = null;
			switch (dto) {
			case NEGATIVE:
				model = Ecart.NEGATIVE;
				break;
			case POSITIVE:
				model = Ecart.POSITIVE;
				break;
			case ZERO:
				model = Ecart.ZERO;
				break;
			default:
				throw new IllegalArgumentException("Valeur impossible" + dto);
			}
			return model;
		} else {
			return null;
		}
	}
}
