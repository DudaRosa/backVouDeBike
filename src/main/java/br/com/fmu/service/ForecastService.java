/*
 * package br.com.fmu.service;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import br.com.fmu.model.Forecast; import
 * br.com.fmu.repository.ForecastRepository; import
 * br.com.fmu.service.interfaces.CrudService;
 * 
 * @Service public class ForecastService implements CrudService<Forecast>{
 * 
 * @Autowired private ForecastRepository forecastRepository;
 * 
 * public List<Forecast> findAllById(int id) { List<Forecast> forecast = new
 * ArrayList<>(); forecast = forecastRepository.findAllByClimaId(id); return
 * forecast; }
 * 
 * 
 * @Override public List<Forecast> findAll() { // TODO Auto-generated method
 * stub return null; }
 * 
 * @Override public Forecast findById(int id) { // TODO Auto-generated method
 * stub return null; }
 * 
 * @Override public boolean save(Forecast objeto) { // TODO Auto-generated
 * method stub return false; }
 * 
 * @Override public void update(Forecast objeto) { // TODO Auto-generated method
 * stub
 * 
 * }
 * 
 * @Override public void deleteById(int id) { // TODO Auto-generated method stub
 * 
 * }
 * 
 * }
 */