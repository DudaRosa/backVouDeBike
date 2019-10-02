package br.com.fmu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fmu.model.Clima;
import br.com.fmu.repository.ClimaRepository;
import br.com.fmu.service.interfaces.CrudService;

@Service
public class ClimaService implements CrudService<Clima>{
	
	@Autowired
	private ClimaRepository climaRepository;

	@Override
	public List<Clima> findAll() {
		List<Clima> climas = new ArrayList<>();
		climaRepository.findAll().forEach(clima -> climas.add(clima));
		return climas;
	}

	
	@Override
	public Clima findById(int id) { 
		Clima clima = climaRepository.findById(id);
		return clima; 
	}
	 

	@Override
	public boolean save(Clima objeto) {
        climaRepository.save(objeto);
        return true;
	}
	
	@Override
	public void update(Clima objeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int id) {
		climaRepository.deleteById(id);
	}
}
