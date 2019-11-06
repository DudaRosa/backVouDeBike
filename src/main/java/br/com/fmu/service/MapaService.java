package br.com.fmu.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.CacheControl;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.fmu.dto.LocalDto;
import br.com.fmu.dto.MapaDto;
import br.com.fmu.wrapper.LocalWrapper;
import br.com.fmu.wrapper.MapaWrapper;
import br.com.fmu.wrapper.RotaWrapper;

@Service
public class MapaService {
	
	public List<MapaDto> traceRoute(String origem, String destino) {
		
		String mapaUri = "https://maps.googleapis.com/maps/api/directions/json?origin=".concat(origem).concat("&destination=").concat(destino).concat("&key=AIzaSyCpj2qNzlBwvWbYFnUBHoxXg6sacPkgOWk");
		
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
			e.printStackTrace();
			dto = null;
		}
		
		return dto;
	}
	
	public List<LocalDto> findPlace(String origem) {
		
		String localUri = "https://maps.googleapis.com/maps/api/geocode/json?address=".concat(origem).concat("&key=AIzaSyCpj2qNzlBwvWbYFnUBHoxXg6sacPkgOWk");
		
		HttpHeaders headers = new HttpHeaders();
		
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setCacheControl(CacheControl.noCache());
		
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<String> response = restTemplate
				.exchange(localUri, 
						HttpMethod.GET, 
						entity, 
						String.class);
		
		String toJson = response.getBody();
		LocalWrapper local = null;
		List<LocalDto> dto = null;
		
		try {
			local = new ObjectMapper().readValue(toJson, LocalWrapper.class);

			dto = local.getResults();

		} catch (IOException e) {
			e.printStackTrace();
			dto = null;
		}

		return dto;
	}

}
