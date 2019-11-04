package br.com.fmu.service;

import java.io.IOException;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.fmu.dto.MapaDto;
import br.com.fmu.wrapper.MapaWrapper;
import br.com.fmu.wrapper.RotaWrapper;

@Service
public class MapaService {
	
private final String mapaUri = "https://maps.googleapis.com/maps/api/directions/json?origin=Toronto&destination=Montreal&key=AIzaSyCpj2qNzlBwvWbYFnUBHoxXg6sacPkgOWk";
	
	
	public List<MapaDto> find() {
		
		HttpHeaders headers = new HttpHeaders();
		
		headers.add("Accept", "application/json");
		headers.add("Content-Type", "application/json");
		headers.add("Cache-Control", "no-cache");
		 
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<String> response = restTemplate
				.exchange(mapaUri, 
						HttpMethod.GET, 
						entity,
						String.class);
		
		String toJson = response.getBody();
		MapaWrapper mapa = null;
		List<RotaWrapper> rota = null;
		List<MapaDto> dto = null;
		
		try {			
			mapa = new ObjectMapper().readValue(toJson, MapaWrapper.class);
			rota = mapa.getRoutes();
			for(RotaWrapper wrapper : rota) {
				dto = wrapper.getLegs();
			}

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dto;
	}

}
