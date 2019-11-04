package br.com.fmu.wrapper;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MapaWrapper {
	
	@SerializedName("routes")
	@JsonProperty("routes")
	private List<RotaWrapper> routes;


	public List<RotaWrapper> getRoutes() {
		return routes;
	}

	public void setRoutes(List<RotaWrapper> routes) {
		this.routes = routes;
	}

}
