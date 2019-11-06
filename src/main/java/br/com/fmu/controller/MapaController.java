package br.com.fmu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fmu.dto.LocalDto;
import br.com.fmu.dto.MapaDto;
import br.com.fmu.service.MapaService;

@RestController
@RequestMapping("/mapa")
public class MapaController {
	
	@Autowired
	private MapaService mapaService;
	
	@GetMapping("/rota/{origem}/{destino}")
	public ResponseEntity<List<MapaDto>> traceRoute(@PathVariable("origem") String origem, @PathVariable("destino") String destino) {
		List<MapaDto> mapa = mapaService.traceRoute(origem, destino);
		return new ResponseEntity<List<MapaDto>>(mapa, HttpStatus.OK);
	}
	
	@GetMapping("/local/{origem}")
	public ResponseEntity<List<LocalDto>> findPlace(@PathVariable("origem") String origem) {
		List<LocalDto> local = mapaService.findPlace(origem);
		return new ResponseEntity<List<LocalDto>>(local, HttpStatus.OK);
	}

}
