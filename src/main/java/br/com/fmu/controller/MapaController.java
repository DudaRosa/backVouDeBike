package br.com.fmu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fmu.dto.MapaDto;
import br.com.fmu.service.MapaService;

@RestController
@RequestMapping("/mapa")
public class MapaController {
	
	@Autowired
	private MapaService mapaService;
	
	@GetMapping("/listar")
	public ResponseEntity<List<MapaDto>> findAll() {
		List<MapaDto> mapa = mapaService.find();
		return new ResponseEntity<List<MapaDto>>(mapa, HttpStatus.OK);
	}

}
