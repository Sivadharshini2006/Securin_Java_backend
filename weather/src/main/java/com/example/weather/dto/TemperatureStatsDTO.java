package com.example.weather.dto;
import lombok.Builder;

@Builder
public class TemperatureStatsDTO {
    private String month;
    private Double maxTemp;
    private Double minTemp;
    private Double medianTemp;
    
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public Double getMaxTemp() {
		return maxTemp;
	}
	public void setMaxTemp(Double maxTemp) {
		this.maxTemp = maxTemp;
	}
	public Double getMinTemp() {
		return minTemp;
	}
	public void setMinTemp(Double minTemp) {
		this.minTemp = minTemp;
	}
	public Double getMedianTemp() {
		return medianTemp;
	}
	public void setMedianTemp(Double medianTemp) {
		this.medianTemp = medianTemp;
	}
    
    
}