
package br.com.fmu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.fmu.model.Evento;

@Repository
public interface EventoRepository extends CrudRepository<Evento, Integer> {
	
	@Query(value = "SELECT * FROM dbo.evento", nativeQuery = true)
	List<Evento> findAll();
	
	@Query(value = "SELECT * FROM dbo.evento WHERE DAY(data) = :dia", nativeQuery = true)
	List<Evento> findbyDia(int dia);

	Evento findById(int id);

	Evento deleteById(int id);

}
