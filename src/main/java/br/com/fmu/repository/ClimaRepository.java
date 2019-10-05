package br.com.fmu.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.fmu.model.Clima;

@Repository
public interface ClimaRepository extends CrudRepository<Clima, Integer>{
	
	
	  @Query(value = "EXEC [dbo].[SELECIONA_CLIMA]", nativeQuery = true)
	  List<Clima> findAll();
	  
	  @Query(value = "EXEC [dbo].[SELECIONA_CLIMA] :id", nativeQuery = true)
	  Clima findById(int id);
	  
	  Clima deleteById(int id);
	 
}
