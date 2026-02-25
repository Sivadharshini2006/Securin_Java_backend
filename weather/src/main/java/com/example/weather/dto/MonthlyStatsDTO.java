package com.example.weather.dto;

public class MonthlyStatsDTO {

    private String monthName;
    private Double maxTemp;
    private Double minTemp;
    private Double medianTemp;

    // ✅ Default Constructor
    public MonthlyStatsDTO() {
    }

    // ✅ Getters and Setters

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
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