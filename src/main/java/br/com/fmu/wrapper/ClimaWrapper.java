package br.com.fmu.wrapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import br.com.fmu.dto.ClimaDto;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimaWrapper {
	
	@SerializedName("results")
	@JsonProperty("results")
	private ClimaDto results;

	public ClimaDto getResults() {
		return results;
	}

	public void setResults(ClimaDto results) {
		this.results = results;
	}

}
