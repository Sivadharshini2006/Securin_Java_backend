package com.example.weather.service;

import com.example.weather.dto.MonthlyStatsDTO;
import com.example.weather.entity.WeatherRecord;

import java.util.List;

public interface WeatherService {

    List<WeatherRecord> getWeatherData(Integer year, Integer month, Integer day);

    List<MonthlyStatsDTO> getTemperatureAnalytics(int year);

    void importCsvData(String filePath);
}