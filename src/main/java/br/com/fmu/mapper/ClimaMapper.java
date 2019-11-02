/*
 * package br.com.fmu.mapper;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import br.com.fmu.dto.ClimaDto; import br.com.fmu.model.Clima;
 * 
 * public class ClimaMapper {
 * 
 * 
 * public static Clima convertFromDto(ClimaDto from) { if(from == null) { return
 * null; } Clima model = new Clima();
 * 
 * 
 * model.setCityName(from.getCity_name());
 * model.setCurrently(from.getCurrently()); model.setDate(from.getDate());
 * model.setDescription(from.getDescription());
 * model.setHumidity(from.getHumidity()); model.setSunrise(from.getSunrise());
 * model.setSunset(from.getSunset()); model.setTemp(from.getTemp());
 * model.setTime(from.getTime()); model.setWindSpeedy(from.getWind_speedy());
 * model.setForecast(ForecastMapper.convertFromDto(from.getForecast()));
 * 
 * return model; }
 * 
 * 
 * public static ClimaDto convertToDto(Clima from) { if(from == null) { return
 * null; } ClimaDto model = new ClimaDto();
 * 
 * model.setCity_name(from.getCityName());
 * model.setCurrently(from.getCurrently());
 * model.setDescription(from.getDescription());
 * model.setHumidity(from.getHumidity()); model.setSunrise(from.getSunrise());
 * model.setSunset(from.getSunset()); model.setTemp(from.getTemp());
 * model.setTime(from.getTime()); model.setWind_speedy(from.getWindSpeedy());
 * 
 * SimpleDateFormat
 * 
 * SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd"); Date dataFormatada
 * = fmt.parse(from.getDate().toString()); model.setDate(new
 * SimpleDateFormat("dd/MM/yyyy").format(dataFormatada));
 * 
 * 
 * 
 * DateTimeFormatter
 * 
 * 
 * 
 * DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
 * LocalDate data = LocalDate.parse(from.getDate().toString()); String
 * dataFormatada = data.format(fmt);
 * 
 * 
 * model.setForecast(ForecastMapper.convertToListDto(from.getForecast()));
 * 
 * return model; }
 * 
 * 
 * public static List<Clima> convertToListEntity(List<ClimaDto> lstDto) {
 * List<Clima> lstSaida = new ArrayList<Clima>(); if(lstDto != null) { for(int i
 * = 0; i < lstDto.size(); i++) { lstSaida.add(convertFromDto(lstDto.get(i))); }
 * }
 * 
 * return lstSaida; }
 * 
 * 
 * public static List<ClimaDto> convertToListDto(List<Clima> lstEntity) {
 * List<ClimaDto> lstSaida = new ArrayList<ClimaDto>(); if(lstEntity != null) {
 * for(int i = 0; i < lstEntity.size(); i++) {
 * lstSaida.add(convertToDto(lstEntity.get(i))); } }
 * 
 * return lstSaida; }
 * 
 * 
 * }
 */