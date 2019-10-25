
package br.com.fmu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.fmu.model.Noticia;

@Repository
public interface NoticiaRepository extends CrudRepository<Noticia, Integer> {

	@Query(value = "SELECT * FROM dbo.noticia", nativeQuery = true)
	List<Noticia> findAll();
	
	@Query(value = "SELECT * FROM dbo.noticia WHERE DAY(data) = :dia", nativeQuery = true)
	List<Noticia> findbyDia(String dia);
	

	@Query(value = "SELECT * FROM dbo.noticia WHERE id = :id", nativeQuery = true)
	Noticia findById(int id);

	void deleteById(int id);

}
