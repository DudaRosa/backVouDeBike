package br.com.fmu.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GeometriaDto {
	
	@JsonProperty("location")
	@SerializedName("location")
	private CoordenadasDto location;

	public CoordenadasDto getLocation() {
		return location;
	}

	public void setLocation(CoordenadasDto location) {
		this.location = location;
	}

}
