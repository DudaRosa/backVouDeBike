package br.com.fmu.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.fmu.dto.EventoDto;
import br.com.fmu.model.Evento;

public class EventoMapper {

	/*
	 * public static Evento convertFromDto(EventoDto from) { if (from == null) {
	 * return null; } Evento model = new Evento();
	 * 
	 * model.setId(from.getId());
	 * 
	 * model.setData(from.getData()); model.setNome(from.getNome());
	 * model.setDescricao(from.getDescricao());
	 * 
	 * return model; }
	 */

	public static EventoDto convertToDto(Evento from) {
		if (from == null) {
			return null;
		}
		EventoDto model = new EventoDto();

		model.setId(from.getId());
		model.setNome(from.getNome());
		model.setDescricao(from.getDescricao());

		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		Date dataFormatada = new Date();

		try {
			dataFormatada = fmt.parse(from.getData().toString());
			model.setData(new SimpleDateFormat("dd/MM/yyyy").format(dataFormatada));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return model;
	}

	/*
	 * public static List<Evento> convertToListEntity(List<EventoDto> lstDto) {
	 * List<Evento> lstSaida = new ArrayList<Evento>(); if (lstDto != null) { for
	 * (int i = 0; i < lstDto.size(); i++) {
	 * lstSaida.add(convertFromDto(lstDto.get(i))); } }
	 * 
	 * return lstSaida; }
	 */

	public static List<EventoDto> convertToListDto(List<Evento> lstEntity) {
		List<EventoDto> lstSaida = new ArrayList<EventoDto>();
		if (lstEntity != null) {
			for (int i = 0; i < lstEntity.size(); i++) {
				lstSaida.add(convertToDto(lstEntity.get(i)));
			}
		}

		return lstSaida;
	}

}
