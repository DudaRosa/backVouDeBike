package br.com.fmu.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.fmu.dto.CupomDto;
import br.com.fmu.model.Cupom;

public class CupomMapper {
	
	public static Cupom convertFromDto(CupomDto from) {
		if(from == null) {
			return null;
		}
		Cupom model = new Cupom();
		
		model.setId(from.getId());
		
		model.setCupom(from.getCupom());
		model.setDescricao(from.getDescricao());
		model.setParceiro(from.getParceiro());
		model.setValidade(from.getValidade());
		
		return model;
	}
	
	public static CupomDto convertToDto(Cupom from) {
		if(from == null) {
			return null;
		}
		CupomDto model = new CupomDto();
		
		model.setId(from.getId());
		
		model.setCupom(from.getCupom());
		model.setDescricao(from.getDescricao());
		model.setParceiro(from.getParceiro());
		model.setValidade(from.getValidade());
		
		return model;
	}
	public static List<Cupom> convertToListEntity(List<CupomDto> lstDto) {
		List<Cupom> lstSaida = new ArrayList<Cupom>(); 
		if(lstDto != null) {
			for(int i = 0; i < lstDto.size(); i++) {
				lstSaida.add(convertFromDto(lstDto.get(i)));
			}
		}
		
		return lstSaida;
	}
	
	public static List<CupomDto> convertToListDto(List<Cupom> lstEntity) {
		List<CupomDto> lstSaida = new ArrayList<CupomDto>(); 
		if(lstEntity != null) {
			for(int i = 0; i < lstEntity.size(); i++) {
				lstSaida.add(convertToDto(lstEntity.get(i)));
			}
		}
		
		return lstSaida;
	}


}
