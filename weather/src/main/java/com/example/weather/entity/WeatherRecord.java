package com.example.weather.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "weather_data")
public class WeatherRecord {

    @Id
    private String id;

    private LocalDateTime timestamp;   

    private String condition;
    private Double temperature;
    private Double humidity;
    private Double pressure;
    private Double heatIndex;
    

   

    private LocalDateTime dateTime;
  
    private Double dewPoint;
    private Integer fog;
    private Integer hail;
   
    private Double precipitation;
   
    private Integer rain;
    private Integer snow;
   
    private Integer thunder;
    private Integer tornado;
    private Double visibility;
    private Integer windDirectionDegrees;
    private String windDirection;
    private Double windGust;
    private Double windChill;
    private Double windSpeed;
    
    public WeatherRecord() {}

    public WeatherRecord(String id, LocalDateTime timestamp, String condition,
                         Double temperature, Double humidity,
                         Double pressure, Double heatIndex) {
        this.id = id;
        this.timestamp = timestamp;
        this.condition = condition;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.heatIndex = heatIndex;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }

    public String getCondition() { return condition; }
    public void setCondition(String condition) { this.condition = condition; }

    public Double getTemperature() { return temperature; }
    public void setTemperature(Double temperature) { this.temperature = temperature; }

    public Double getHumidity() { return humidity; }
    public void setHumidity(Double humidity) { this.humidity = humidity; }

    public Double getPressure() { return pressure; }
    public void setPressure(Double pressure) { this.pressure = pressure; }

    public Double getHeatIndex() { return heatIndex; }
    public void setHeatIndex(Double heatIndex) { this.heatIndex = heatIndex; }

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public Double getDewPoint() {
		return dewPoint;
	}

	public void setDewPoint(Double dewPoint) {
		this.dewPoint = dewPoint;
	}

	public Integer getFog() {
		return fog;
	}

	public void setFog(Integer fog) {
		this.fog = fog;
	}

	public Integer getHail() {
		return hail;
	}

	public void setHail(Integer hail) {
		this.hail = hail;
	}

	public Double getPrecipitation() {
		return precipitation;
	}

	public void setPrecipitation(Double precipitation) {
		this.precipitation = precipitation;
	}

	public Integer getRain() {
		return rain;
	}

	public void setRain(Integer rain) {
		this.rain = rain;
	}

	public Integer getSnow() {
		return snow;
	}

	public void setSnow(Integer snow) {
		this.snow = snow;
	}

	public Integer getThunder() {
		return thunder;
	}

	public void setThunder(Integer thunder) {
		this.thunder = thunder;
	}

	public Integer getTornado() {
		return tornado;
	}

	public void setTornado(Integer tornado) {
		this.tornado = tornado;
	}

	public Double getVisibility() {
		return visibility;
	}

	public void setVisibility(Double visibility) {
		this.visibility = visibility;
	}

	public Integer getWindDirectionDegrees() {
		return windDirectionDegrees;
	}

	public void setWindDirectionDegrees(Integer windDirectionDegrees) {
		this.windDirectionDegrees = windDirectionDegrees;
	}

	public String getWindDirection() {
		return windDirection;
	}

	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}

	public Double getWindGust() {
		return windGust;
	}

	public void setWindGust(Double windGust) {
		this.windGust = windGust;
	}

	public Double getWindChill() {
		return windChill;
	}

	public void setWindChill(Double windChill) {
		this.windChill = windChill;
	}

	public Double getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(Double windSpeed) {
		this.windSpeed = windSpeed;
	}
    
}