<img width="884" height="852" alt="image" src="https://github.com/user-attachments/assets/bb8e2dfb-d2a7-48b3-89e9-9e06789a224a" />
**🌦 Weather Data Analytics API**

A Spring Boot REST API that imports weather data from a CSV file into MongoDB and provides powerful filtering and analytics features such as monthly temperature statistics.

This project demonstrates clean architecture, exception handling, data processing, and REST API design using Spring Boot and MongoDB.


**🚀 Tech Stack**

Java 21

Spring Boot

Spring Data MongoDB

MongoDB

OpenCSV

**📌 Project Overview**

Imports weather data from a CSV file into MongoDB on startup

Provides APIs to filter weather data by year, month, and day

Generates monthly temperature analytics (Max, Min, Median)

Implements global exception handling

Follows clean layered architecture (Controller → Service → Repository)

**⚙️ Configuration**
**application.properties**
spring.data.mongodb.uri=mongodb://localhost:27017/weatherdb
server.port=8090

Make sure MongoDB is running on:

localhost:27017

**📥 Automatic CSV Import**

On application startup:

If the database is empty

The file testset.csv inside the resources folder

Automatically gets imported into MongoDB
**
🔗 API Endpoints**
Base URL

http://localhost:8090/api/weather



**Search Weather Records**

GET /api/weather/search

Description

Returns weather records with optional filtering.

Query Parameters (Optional)

year → Filter by year

month → Filter by month (1–12)

day → Filter by day (1–31)

Example Requests

GET http://localhost:8080/api/weather/search

GET http://localhost:8080/api/weather/search?year=2023

GET http://localhost:8080/api/weather/search?year=2023&month=1

GET http://localhost:8080/api/weather/search?year=2023&month=1&day=15
<img width="884" height="852" alt="image" src="https://github.com/user-attachments/assets/a933eeb5-9c4f-4590-aa69-6ff08b447131" />
<img width="901" height="866" alt="image" src="https://github.com/user-attachments/assets/fdf9671e-1c9e-4ff1-8b2b-571f7632a4b1" /><img width="899" height="868" alt="image" src="https://github.com/user-attachments/assets/39e5a3a5-ae05-4693-a547-af35e1193166" />
<img width="953" height="996" alt="image" src="https://github.com/user-attachments/assets/c512dfea-2cbb-4b55-90f1-b6ba61ea359d" />
<img width="848" height="880" alt="image" src="https://github.com/user-attachments/assets/020b7aa1-c330-4f63-a0d3-022c693b3af0" />
<img width="356" height="746" alt="image" src="https://github.com/user-attachments/assets/faf48b93-ef1a-45fe-bffc-6d3a2894f50a" />

**📊 Key Concepts Demonstrated**

REST API Design

MongoDB Integration

CSV Data Processing

Java Stream API

Custom Exception Handling

Clean Architecture Principles

**📌 Future Enhancements**

Pagination & Sorting

Swagger Documentation

JWT Authentication

Docker Deployment

Cloud Deployment




