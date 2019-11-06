package br.com.fmu.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ComponenteEnderecoDto {
	
	@JsonProperty("long_name")
	@SerializedName("long_name")
	private String long_name;
	
	@JsonProperty("short_name")
	@SerializedName("short_name")
	private String short_name;
	
	@JsonProperty("types")
	@SerializedName("types")
	private List<String> types;
	

	public String getLong_name() {
		return long_name;
	}

	public void setLong_name(String long_name) {
		this.long_name = long_name;
	}

	public String getShort_name() {
		return short_name;
	}

	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}

	public List<String> getTypes() {
		return types;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}

}
