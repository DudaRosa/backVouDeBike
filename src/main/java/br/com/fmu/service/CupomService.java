package br.com.fmu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fmu.model.Cupom;
import br.com.fmu.repository.CupomRepository;
import br.com.fmu.service.interfaces.CrudService;

@Service
public class CupomService implements CrudService<Cupom>{
	
	@Autowired
	private CupomRepository cupomRepository;
	

	@Override
	public List<Cupom> findAll() {
		List<Cupom> cupons = new ArrayList<>();
		cupomRepository.findAll().forEach(cupom -> cupons.add(cupom));
		return cupons;
	}

	@Override
	public Cupom findById(int id) {
		Cupom cupom = cupomRepository.findById(id);
		return cupom;
	}

	@Override
	public boolean save(Cupom objeto) {
		cupomRepository.save(objeto);
		return false;
	}

	@Override
	public void update(Cupom objeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int id) {
		cupomRepository.deleteById(id);
	}

}
