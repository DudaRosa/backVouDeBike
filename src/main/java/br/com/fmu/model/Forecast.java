package br.com.fmu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@Entity
@Table(name = "forecast")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(insertable = false, updatable = false)
	int id;
	@Column
	private String date;
	@Column
	private String weekday;
	@Column
	private int max;
	@Column
	private int min;
	@Column
	private String description;
	@Column
	private String condition;
	
	public Forecast(){};
		
	public Forecast(int id, String date, String weekday, int max, int min, String description, String condition) {
		this.id = id;
		this.date = date;
		this.weekday = weekday;
		this.max = max;
		this.min = min;
		this.description = description;
		this.condition = condition;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
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
