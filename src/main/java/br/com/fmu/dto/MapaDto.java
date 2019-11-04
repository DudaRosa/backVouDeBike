package br.com.fmu.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MapaDto {

	@SerializedName("distance")
	@JsonProperty("distance")
	private DistanciaDto distance;

	@SerializedName("duration")
	@JsonProperty("duration")
	private DuracaoDto duration;

	@SerializedName("end_address")
	@JsonProperty("end_address")
	private String end_address;

	@SerializedName("end_location")
	@JsonProperty("end_location")
	private DestinoDto end_location;

	@SerializedName("start_address")
	@JsonProperty("start_address")
	private String start_address;

	@SerializedName("start_location")
	@JsonProperty("start_location")
	private PartidaDto start_location;

	@SerializedName("steps")
	@JsonProperty("steps")
	private List<PassosDto> steps;

	public DistanciaDto getDistance() {
		return distance;
	}

	public void setDistance(DistanciaDto distance) {
		this.distance = distance;
	}

	public DuracaoDto getDuration() {
		return duration;
	}

	public void setDuration(DuracaoDto duration) {
		this.duration = duration;
	}

	public String getEnd_address() {
		return end_address;
	}

	public void setEnd_address(String end_address) {
		this.end_address = end_address;
	}

	public DestinoDto getEnd_location() {
		return end_location;
	}

	public void setEnd_location(DestinoDto end_location) {
		this.end_location = end_location;
	}

	public String getStart_address() {
		return start_address;
	}

	public void setStart_address(String start_address) {
		this.start_address = start_address;
	}

	public PartidaDto getStart_location() {
		return start_location;
	}

	public void setStart_location(PartidaDto start_location) {
		this.start_location = start_location;
	}

	public List<PassosDto> getSteps() {
		return steps;
	}

	public void setSteps(List<PassosDto> steps) {
		this.steps = steps;
	}

}
