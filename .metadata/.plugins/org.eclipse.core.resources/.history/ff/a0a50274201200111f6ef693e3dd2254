package com.example.weather.util;

import com.example.weather.repository.WeatherRepository;
import com.example.weather.service.WeatherService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataImportRunner implements CommandLineRunner {

    private static final Logger log =
            LoggerFactory.getLogger(DataImportRunner.class);

    private final WeatherService weatherService;
    private final WeatherRepository repository;

    // ✅ Manual constructor (VERY IMPORTANT)
    public DataImportRunner(WeatherService weatherService,
                            WeatherRepository repository) {
        this.weatherService = weatherService;
        this.repository = repository;
    }

    @Override
    public void run(String... args) {

        if (repository.count() == 0) {

            log.info("Database empty. Importing CSV...");

            String filePath = "src/main/resources/testset.csv";

            weatherService.importCsvData(filePath);

            log.info("Import finished");

        } else {
            log.info("Database already contains data. Skipping import.");
        }
    }
}