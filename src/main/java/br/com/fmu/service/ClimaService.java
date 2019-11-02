package br.com.fmu.service;

import java.io.IOException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.fmu.dto.ClimaDto;
import br.com.fmu.wrapper.ClimaWrapper;

@Service
public class ClimaService {
	
	private final String climaUri = "http://api.hgbrasil.com/weather?woeid=455827";
	
	
	public ClimaDto find() {
		
		HttpHeaders headers = new HttpHeaders();
		
		
		headers.add("Accept", "application/json");
		headers.add("Content-Type", "application/json");
		headers.add("Cache-Control", "no-cache");
		 
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<String> response = restTemplate
				.exchange(climaUri, 
						HttpMethod.GET, 
						entity,
						String.class);
		
		
		ClimaWrapper clima = null;
		String toJson = response.getBody();
		ClimaDto dto = null;
		
		try {
			clima = new ObjectMapper().readValue(toJson, ClimaWrapper.class);
			dto = clima.getResults();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dto;
	}

}
