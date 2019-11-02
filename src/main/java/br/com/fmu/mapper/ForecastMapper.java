/*
 * package br.com.fmu.mapper;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import br.com.fmu.dto.ForecastDto; import br.com.fmu.model.Forecast;
 * 
 * public class ForecastMapper {
 * 
 * 
 * public static Forecast convertFromDto(ForecastDto from) { if(from == null) {
 * return null; } Forecast model = new Forecast();
 * 
 * model.setCondition(from.getCondition()); model.setDate(from.getDate());
 * model.setDescription(from.getDescription()); model.setMax(from.getMax());
 * model.setMin(from.getMin()); model.setWeekday(from.getWeekday());
 * 
 * return model; }
 * 
 * 
 * public static ForecastDto convertToDto(Forecast from) { if(from == null) {
 * return null; } ForecastDto model = new ForecastDto();
 * 
 * model.setId(from.getId());
 * 
 * model.setCondition(from.getCondition());
 * model.setDescription(from.getDescription()); model.setMax(from.getMax());
 * model.setMin(from.getMin()); model.setWeekday(from.getWeekday());
 * model.setDate(from.getDate());
 * 
 * 
 * SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd"); Date dataFormatada
 * = new Date();
 * 
 * try { dataFormatada = fmt.parse(from.getDate().toString()); model.setDate(new
 * SimpleDateFormat("dd/MM/yyyy").format(dataFormatada)); } catch
 * (ParseException e) { e.printStackTrace(); }
 * 
 * 
 * return model; }
 * 
 * 
 * public static List<Forecast> convertToListEntity(List<ForecastDto> lstDto) {
 * List<Forecast> lstSaida = new ArrayList<Forecast>(); if(lstDto != null) {
 * for(int i = 0; i < lstDto.size(); i++) {
 * lstSaida.add(convertFromDto(lstDto.get(i))); } }
 * 
 * return lstSaida; }
 * 
 * 
 * public static List<ForecastDto> convertToListDto(List<Forecast> lstEntity) {
 * List<ForecastDto> lstSaida = new ArrayList<ForecastDto>(); if(lstEntity !=
 * null) { for(int i = 0; i < lstEntity.size(); i++) {
 * lstSaida.add(convertToDto(lstEntity.get(i))); } }
 * 
 * return lstSaida; }
 * 
 * }
 */