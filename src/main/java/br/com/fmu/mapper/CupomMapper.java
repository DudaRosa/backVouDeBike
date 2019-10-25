package br.com.fmu.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.fmu.dto.CupomDto;
import br.com.fmu.model.Cupom;

public class CupomMapper {

	/*
	 * public static Cupom convertFromDto(CupomDto from) { if(from == null) { return
	 * null; } Cupom model = new Cupom();
	 * 
	 * model.setId(from.getId());
	 * 
	 * model.setCupom(from.getCupom()); model.setDescricao(from.getDescricao());
	 * model.setParceiro(from.getParceiro()); model.setValidade(from.getValidade());
	 * 
	 * return model; }
	 */

	public static CupomDto convertToDto(Cupom from) {
		if (from == null) {
			return null;
		}
		CupomDto model = new CupomDto();

		model.setId(from.getId());

		model.setCupom(from.getCupom());
		model.setDescricao(from.getDescricao());
		model.setParceiro(from.getParceiro());

		if (from.getValidade() != null) {
			SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
			Date dataFormatada = new Date();

			try {
				dataFormatada = fmt.parse(from.getValidade().toString());
				model.setValidade(new SimpleDateFormat("dd/MM/yyyy").format(dataFormatada));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
		} else {
			model.setValidade("Prazo de validade indeterminado");
		}

		return model;
	}

	/*
	 * public static List<Cupom> convertToListEntity(List<CupomDto> lstDto) {
	 * List<Cupom> lstSaida = new ArrayList<Cupom>(); if(lstDto != null) { for(int i
	 * = 0; i < lstDto.size(); i++) { lstSaida.add(convertFromDto(lstDto.get(i))); }
	 * }
	 * 
	 * return lstSaida; }
	 */

	public static List<CupomDto> convertToListDto(List<Cupom> lstEntity) {
		List<CupomDto> lstSaida = new ArrayList<CupomDto>();
		if (lstEntity != null) {
			for (int i = 0; i < lstEntity.size(); i++) {
				lstSaida.add(convertToDto(lstEntity.get(i)));
			}
		}

		return lstSaida;
	}

}
