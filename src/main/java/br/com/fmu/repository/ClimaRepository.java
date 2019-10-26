package br.com.fmu.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.fmu.model.Clima;

@Repository
public interface ClimaRepository extends CrudRepository<Clima, Integer> {

	@Query(value = "SELECT * FROM dbo.clima", nativeQuery = true)
	List<Clima> findAll();
	
	@Query(value = "SELECT * FROM dbo.clima WHERE DAY([date]) = :dia", nativeQuery = true)
	List<Clima> findByDia(int dia);

	
	/*
	 * @Transactional
	 * 
	 * @Procedure(procedureName = "SELECIONA_CLIMA") List<Clima> findAll();
	 */
	  
	@Transactional
	@Procedure(procedureName = "SELECIONA_CLIMA")
	Clima findById(@Param("id") int id);
	 

	Clima deleteById(int id);

}
