package br.com.fmu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fmu.model.Cupom;
import br.com.fmu.service.CupomService;

@RestController
@RequestMapping("/cupom")
public class CupomController {
	
	@Autowired
	private CupomService cupomService;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Cupom>> findAll() {
		List<Cupom> lista = cupomService.findAll();
		return new ResponseEntity<List<Cupom>>(lista, HttpStatus.OK);
	}

	@GetMapping("/selecionar/{id}")
	public ResponseEntity<Cupom> findById(@PathVariable("id") int id) {
		Cupom cupom = cupomService.findById(id);
		return new ResponseEntity<Cupom>(cupom, HttpStatus.OK);
	}

	@PostMapping("/inserir")
	public ResponseEntity<Cupom> save(@RequestBody Cupom cupom) {
		cupomService.save(cupom);
		return new ResponseEntity<Cupom>(cupom, HttpStatus.CREATED);
	}

	@PutMapping("/atualizar")
	public ResponseEntity<Cupom> update(@RequestBody Cupom cupom) {
		cupomService.update(cupom);
		return new ResponseEntity<Cupom>(cupom, HttpStatus.OK);
	}

	@DeleteMapping("/deletar/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable("id") int id) {
		cupomService.deleteById(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
