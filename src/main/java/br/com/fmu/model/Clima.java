package br.com.fmu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@Entity
@Table(name = "clima")
@JsonIgnoreProperties(ignoreUnknown = true, value = {"hibernateLazyInitializer", "handler"})
public class Clima {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(insertable = false, updatable = false)
	private int id;
	@Column
	private int temp;
	@Column
	private String date;
	@Column
	private String time;
	@Column
	private String description;
	@Column
	private String currently;
	@Column
	private int humidity;
	@Column(name = "wind_speedy")
	private String windSpeedy;
	@Column
	private String sunrise;
	@Column
	private String sunset;
	@Column(name = "city_name")
	private String cityName;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "forecast_id", unique = true, nullable = false)
	private Forecast forecast;
	
	public Clima() {};
	
	
	public Clima(int id, int temp, String date, String time, String description, String currently, int humidity,
			String windSpeedy, String sunrise, String sunset, String cityName, Forecast forecast) {
		super();
		this.id = id;
		this.temp = temp;
		this.date = date;
		this.time = time;
		this.description = description;
		this.currently = currently;
		this.humidity = humidity;
		this.windSpeedy = windSpeedy;
		this.sunrise = sunrise;
		this.sunset = sunset;
		this.cityName = cityName;
		this.forecast = forecast;
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getWindSpeedy() {
		return windSpeedy;
	}
	public void setWindSpeedy(String windSpeedy) {
		this.windSpeedy = windSpeedy;
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
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Forecast getForecast() {
		return forecast;
	}
	public void setForecast(Forecast forecast) {
		this.forecast = forecast;
	}

/*public class Clima {
	
	private int id;
	private int temp;
	private String date;
	private String time;
	private String description;
	private String currently;
	private int humidity;
	private String windSpeedy;
	private String sunrise;
	private String sunset;
	private String cityName;
	private String forecast;
	
	public Clima() {};
	
	
	public Clima(int id, int temp, String date, String time, String description, String currently, int humidity,
			String windSpeedy, String sunrise, String sunset, String cityName, String forecast) {
		super();
		this.id = id;
		this.temp = temp;
		this.date = date;
		this.time = time;
		this.description = description;
		this.currently = currently;
		this.humidity = humidity;
		this.windSpeedy = windSpeedy;
		this.sunrise = sunrise;
		this.sunset = sunset;
		this.cityName = cityName;
		this.forecast = forecast;
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getWindSpeedy() {
		return windSpeedy;
	}
	public void setWindSpeedy(String windSpeedy) {
		this.windSpeedy = windSpeedy;
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
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getForecast() {
		return forecast;
	}
	public void setForecast(String forecast) {
		this.forecast = forecast;
	}*/
}