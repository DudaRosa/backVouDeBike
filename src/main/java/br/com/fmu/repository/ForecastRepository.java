/*
 * package br.com.fmu.repository;
 * 
 * import java.util.List;
 * 
 * import org.springframework.data.jpa.repository.Query; import
 * org.springframework.data.repository.CrudRepository;
 * 
 * import br.com.fmu.model.Forecast;
 * 
 * public interface ForecastRepository extends CrudRepository<Forecast,
 * Integer>{
 * 
 * @Query(value = "SELECT * FROM dbo.forecast WHERE clima_id = :id", nativeQuery
 * = true) List<Forecast> findAllByClimaId(int id);
 * 
 * }
 */