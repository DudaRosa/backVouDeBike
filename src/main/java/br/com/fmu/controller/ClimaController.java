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

import br.com.fmu.model.Clima;
import br.com.fmu.service.ClimaService;

@RestController
@RequestMapping("/clima")
public class ClimaController {

	@Autowired
	private ClimaService climaService;

	@GetMapping("/listar")
	public ResponseEntity<List<Clima>> findAll() {
		List<Clima> lista = climaService.findAll();
		return new ResponseEntity<List<Clima>>(lista, HttpStatus.OK);
	}

	@GetMapping("/selecionar/{id}")
	public ResponseEntity<Clima> findById(@PathVariable("id") int id) {
		Clima clima = climaService.findById(id);
		return new ResponseEntity<Clima>(clima, HttpStatus.OK);
	}

	@PostMapping("/inserir")
	public ResponseEntity<Clima> save(@RequestBody Clima clima) {
		climaService.save(clima);
		return new ResponseEntity<Clima>(clima, HttpStatus.CREATED);
	}

	@PutMapping("/atualizar")
	public ResponseEntity<Clima> update(@RequestBody Clima clima) {
		climaService.update(clima);
		return new ResponseEntity<Clima>(clima, HttpStatus.OK);
	}

	@DeleteMapping("/deletar/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable("id") int id) {
		climaService.deleteById(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	
}