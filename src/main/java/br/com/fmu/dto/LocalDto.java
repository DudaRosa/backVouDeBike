package br.com.fmu.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocalDto {
	
	@JsonProperty("address_components")
	@SerializedName("address_components")
	private List<ComponenteEnderecoDto> address_components;
	
	@JsonProperty("formatted_address")
	@SerializedName("formatted_address")
	private String formatted_address;
	
	@JsonProperty("geometry")
	@SerializedName("geometry")
	private GeometriaDto geometry;

	public List<ComponenteEnderecoDto> getAddress_components() {
		return address_components;
	}

	public void setAddress_components(List<ComponenteEnderecoDto> address_components) {
		this.address_components = address_components;
	}

	public String getFormatted_address() {
		return formatted_address;
	}

	public void setFormatted_address(String formatted_address) {
		this.formatted_address = formatted_address;
	}

	public GeometriaDto getGeometry() {
		return geometry;
	}

	public void setGeometry(GeometriaDto geometry) {
		this.geometry = geometry;
	}

}
