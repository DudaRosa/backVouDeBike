package br.com.fmu.repository;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.fmu.model.Clima;

@Repository
public interface ClimaRepository extends CrudRepository<Clima, Integer>{
	
		
	  @Transactional
	  @Procedure(procedureName = "SELECIONA_CLIMA")
	  List<Clima> findAll();
	  
	  @Transactional
	  @Procedure(procedureName = "SELECIONA_CLIMA")
	  Clima findById(@Param("id") int id);
	
	/*
	 * @Query(value = "EXEC [dbo].[SELECIONA_CLIMA]", nativeQuery = true)
	 * List<Clima> findAll();
	 * 
	 * @Query(value = "EXEC [dbo].[SELECIONA_CLIMA] :id", nativeQuery = true) Clima
	 * findById(int id);
	 */
	  
	  Clima deleteById(int id);
	 
}
