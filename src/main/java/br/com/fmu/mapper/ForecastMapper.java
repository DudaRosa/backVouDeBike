package br.com.fmu.mapper;

import java.util.ArrayList;
import java.util.List;

import br.com.fmu.dto.ForecastDto;
import br.com.fmu.model.Forecast;

public class ForecastMapper {
	
	public static Forecast convertFromDto(ForecastDto from) {
		if(from == null) {
			return null;
		}
		Forecast model = new Forecast();
		
		model.setCondition(from.getCondition());
		model.setDate(from.getDate());
		model.setDescription(from.getDescription());
		model.setMax(from.getMax());
		model.setMin(from.getMin());
		model.setWeekday(from.getWeekday());

		return model;
	}
	
	public static ForecastDto convertToDto(Forecast from) {
		if(from == null) {
			return null;
		}
		ForecastDto conf = new ForecastDto();
		
		conf.setCondition(from.getCondition());
		conf.setDate(from.getDate());
		conf.setDescription(from.getDescription());
		conf.setMax(from.getMax());
		conf.setMin(from.getMin());
		conf.setWeekday(from.getWeekday());

		return conf;
	}
	
	public static List<Forecast> convertToListEntity(List<ForecastDto> lstDto) {
		List<Forecast> lstSaida = new ArrayList<Forecast>(); 
		if(lstDto != null) {
			for(int i = 0; i < lstDto.size(); i++) {
				lstSaida.add(convertFromDto(lstDto.get(i)));
			}
		}
		
		return lstSaida;
	}
	
	public static List<ForecastDto> convertToListDto(List<Forecast> lstEntity) {
		List<ForecastDto> lstSaida = new ArrayList<ForecastDto>(); 
		if(lstEntity != null) {
			for(int i = 0; i < lstEntity.size(); i++) {
				lstSaida.add(convertToDto(lstEntity.get(i)));
			}
		}
		
		return lstSaida;
	}

}
