package br.com.fmu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fmu.model.Clima;
import br.com.fmu.service.ClimaService;

@Controller
@RequestMapping("/clima")
public class ClimaController {

	@Autowired
	private ClimaService climaService;

	@GetMapping("/listar")
	public ResponseEntity<List<Clima>> listar() {
		List<Clima> lista = climaService.listar();
		return new ResponseEntity<List<Clima>>(lista, HttpStatus.OK);
	}

	@GetMapping("/selecionar/{id}")
	public ResponseEntity<Clima> selecionar(@PathVariable("id") int id) {
		Clima clima = climaService.selecionar(id);
		return new ResponseEntity<Clima>(clima, HttpStatus.OK);
	}

	@PostMapping("/inserir")
	public ResponseEntity<Clima> inserir(@RequestBody Clima clima) {
		climaService.atualizar(clima);
		return new ResponseEntity<Clima>(clima, HttpStatus.CREATED);
	}

	@PutMapping("/atualizar")
	public ResponseEntity<Clima> atualizar(@RequestBody Clima clima) {
		climaService.atualizar(clima);
		return new ResponseEntity<Clima>(clima, HttpStatus.OK);
	}

	@DeleteMapping("/deletar/{id}")
	public ResponseEntity<Void> deletar(@PathVariable("id") int id) {
		climaService.deletar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	
}