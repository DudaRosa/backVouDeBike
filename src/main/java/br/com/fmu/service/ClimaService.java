package br.com.fmu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fmu.model.Clima;
import br.com.fmu.repository.ClimaRepository;
import br.com.fmu.service.interfaces.CrudService;

@Service
public class ClimaService implements CrudService<Clima> {

	@Autowired
	private ClimaRepository climaRepository;

	@Autowired
	private ForecastService forecastService;
	

	@Override
	public List<Clima> findAll() {
		List<Clima> climas = new ArrayList<>();
		climaRepository.findAll().forEach(clima -> climas.add(clima));
		return climas;
	}

	public List<Clima> findByDia(int dia) {
		List<Clima> climas = new ArrayList<>();
		climas.addAll(climaRepository.findByDia(dia));
		for (Clima clima : climas) {
			clima.setForecast(forecastService.findAllById(clima.getId()));
		}
		return climas;
	}

	@Override
	public Clima findById(int id) {
		Clima clima = climaRepository.findById(id);
		clima.setForecast(forecastService.findAllById(clima.getId()));
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
