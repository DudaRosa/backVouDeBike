package br.com.fmu.wrapper;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

import br.com.fmu.dto.MapaDto;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RotaWrapper {
	
	@SerializedName("legs")
	@JsonProperty("legs")
	private List<MapaDto> legs;

	public List<MapaDto> getLegs() {
		return legs;
	}

	public void setLegs(List<MapaDto> legs) {
		this.legs = legs;
	}

}
