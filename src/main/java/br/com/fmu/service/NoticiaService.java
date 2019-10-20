
package br.com.fmu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fmu.model.Noticia;
import br.com.fmu.repository.NoticiaRepository;
import br.com.fmu.service.interfaces.CrudService;

@Service
public class NoticiaService implements CrudService<Noticia> {

	@Autowired
	private NoticiaRepository noticiaRepository;

	@Override
	public List<Noticia> findAll() {
		List<Noticia> noticias = new ArrayList<>();
		noticiaRepository.findAll().forEach(noticia -> noticias.add(noticia));
		return noticias;
	}
	
	public List<Noticia> findByDia(String dia) {
		List<Noticia> noticias = noticiaRepository.findbyDia(dia);
		return noticias;
	}
	

	@Override
	public Noticia findById(int id) {
		Noticia noticia = noticiaRepository.findById(id);
		return noticia;
	}

	@Override
	public boolean save(Noticia objeto) {
		noticiaRepository.save(objeto);
		return true;
	}

	@Override
	public void update(Noticia objeto) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteById(int id) {
		noticiaRepository.deleteById(id);
	}

}
