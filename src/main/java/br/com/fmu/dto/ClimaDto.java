package br.com.fmu.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClimaDto {

	@SerializedName("temp")
	@JsonProperty("temp")
	private int temp;

	@SerializedName("date")
	@JsonProperty("date")
	private String date;

	@SerializedName("time")
	@JsonProperty("time")
	private String time;

	@SerializedName("description")
	@JsonProperty("description")
	private String description;

	@SerializedName("currently")
	@JsonProperty("currently")
	private String currently;

	@SerializedName("humidity")
	@JsonProperty("humidity")
	private int humidity;

	@SerializedName("wind_speedy")
	@JsonProperty("wind_speedy")
	private String wind_speedy;

	@SerializedName("sunrise")
	@JsonProperty("sunrise")
	private String sunrise;

	@SerializedName("sunset")
	@JsonProperty("sunset")
	private String sunset;
	
	@SerializedName("condition_slug")
	@JsonProperty("condition_slug")
	private String condition_slug;

	@SerializedName("city_name")
	@JsonProperty("city_name")
	private String city_name;

	@SerializedName("forecast")
	@JsonProperty("forecast")
	private List<ForecastDto> forecast;

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCurrently() {
		return currently;
	}

	public void setCurrently(String currently) {
		this.currently = currently;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public String getWind_speedy() {
		return wind_speedy;
	}

	public void setWind_speedy(String wind_speedy) {
		this.wind_speedy = wind_speedy;
	}

	public String getSunrise() {
		return sunrise;
	}

	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}

	public String getSunset() {
		return sunset;
	}

	public void setSunset(String sunset) {
		this.sunset = sunset;
	}

	public String getCondition_slug() {
		return condition_slug;
	}

	public void setCondition_slug(String condition_slug) {
		this.condition_slug = condition_slug;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public List<ForecastDto> getForecast() {
		return forecast;
	}

	public void setForecast(List<ForecastDto> forecast) {
		this.forecast = forecast;
	}

}
