
package br.com.fmu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fmu.model.Evento;
import br.com.fmu.repository.EventoRepository;
import br.com.fmu.service.interfaces.CrudService;

@Service
public class EventoService implements CrudService<Evento> {

	@Autowired
	private EventoRepository eventoRepository;

	@Override
	public List<Evento> findAll() {
		List<Evento> eventos = new ArrayList<>();
		eventoRepository.findAll().forEach(evento -> eventos.add(evento));
		return eventos;
	}
	
	public List<Evento> findByParceiro(int dia) {
		List <Evento> eventos = new ArrayList<>();
		eventos.addAll(eventoRepository.findbyDia(dia));
		return eventos;
	}

	@Override
	public Evento findById(int id) {
		Evento evento = eventoRepository.findById(id);
		return evento;
	}

	@Override
	public boolean save(Evento objeto) {
		eventoRepository.save(objeto);
		return true;
	}

	@Override
	public void update(Evento objeto) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteById(int id) {
		eventoRepository.deleteById(id);
	}

}
