package com.example.weather.repository;

import com.example.weather.entity.WeatherRecord;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface WeatherRepository extends MongoRepository<WeatherRecord, String> {

    List<WeatherRecord> findByTimestampBetween(LocalDateTime start,
                                               LocalDateTime end);
}