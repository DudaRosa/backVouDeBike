package br.com.fmu.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PassosDto {
	
	@SerializedName("distance")
	@JsonProperty("distance")
	private DistanciaDto distance;
	
	@SerializedName("duration")
	@JsonProperty("duration")
	private DuracaoDto duration;
	
	@SerializedName("end_location")
	@JsonProperty("end_location")
	private DestinoDto end_location;
	
	@SerializedName("html_instructions")
	@JsonProperty("html_instructions")
	private String html_instructions;
	
	@SerializedName("polyline")
	@JsonProperty("polyline")
	private PolylineDto polyline;
	
	@SerializedName("start_location")
	@JsonProperty("start_location")
	private PartidaDto start_location;
	
	@SerializedName("travel_mode")
	@JsonProperty("travel_mode")
	private String travel_mode;
	

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

	public DestinoDto getEnd_location() {
		return end_location;
	}

	public void setEnd_location(DestinoDto end_location) {
		this.end_location = end_location;
	}

	public String getHtml_instructions() {
		return html_instructions;
	}

	public void setHtml_instructions(String html_instructions) {
		this.html_instructions = html_instructions;
	}

	public PolylineDto getPolyline() {
		return polyline;
	}

	public void setPolyline(PolylineDto polyline) {
		this.polyline = polyline;
	}

	public PartidaDto getStart_location() {
		return start_location;
	}

	public void setStart_location(PartidaDto start_location) {
		this.start_location = start_location;
	}

	public String getTravel_mode() {
		return travel_mode;
	}

	public void setTravel_mode(String travel_mode) {
		this.travel_mode = travel_mode;
	}
	
}
