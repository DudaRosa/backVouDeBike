package br.com.fmu.wrapper;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import br.com.fmu.dto.LocalDto;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocalWrapper {
	
	@SerializedName("results")
	@JsonProperty("results")
	private List<LocalDto> results;

	public List<LocalDto> getResults() {
		return results;
	}

	public void setResults(List<LocalDto> results) {
		this.results = results;
	}

}
