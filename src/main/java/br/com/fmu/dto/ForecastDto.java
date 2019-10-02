package br.com.fmu.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class ForecastDto {
	
	@SerializedName("date")
	@JsonProperty("date")
	private String date;
	
	@SerializedName("weekday")
	@JsonProperty("weekday")
	private String weekday;
	
	@SerializedName("max")
	@JsonProperty("max")
	private int max;
	
	@SerializedName("min")
	@JsonProperty("min")
	private int min;
	
	@SerializedName("description")
	@JsonProperty("description")
	private String description;
	
	@SerializedName("condition")
	@JsonProperty("condition")
	private String condition;
	
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getWeekday() {
		return weekday;
	}
	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}

}
