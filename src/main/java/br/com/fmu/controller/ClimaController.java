package br.com.fmu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fmu.dto.ClimaDto;
import br.com.fmu.service.ClimaService;

@RestController
@RequestMapping("/clima")
public class ClimaController {

	@Autowired
	private ClimaService climaService;

	
	@GetMapping("/listar")
	public ResponseEntity<ClimaDto> findAll() {
		ClimaDto clima = climaService.find();
		return new ResponseEntity<ClimaDto>(clima, HttpStatus.OK);
	}
	
}