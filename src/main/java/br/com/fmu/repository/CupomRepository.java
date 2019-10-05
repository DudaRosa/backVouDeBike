package br.com.fmu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.fmu.model.Cupom;

@Repository
public interface CupomRepository extends CrudRepository<Cupom, Integer>{
	
	@Query(value = "SELECT * FROM dbo.cupom", nativeQuery = true)
	List<Cupom> findAll();

	@Query(value = "SELECT * FROM dbo.cupom WHERE id = :id", nativeQuery = true)
	Cupom findById(int id);

	void deleteById(int id);

}
