# Eureka Delivery Service API

## Overview

Eureka Delivery Service API is a Spring Boot application designed to manage delivery services. It provides a RESTful interface for creating, retrieving, updating, and deleting delivery information. This project is structured using MVC architecture, focusing on separation of concerns and making the codebase easy to manage and scale.

## Features

- **Create Delivery**: Add new delivery records.
- **Get Deliveries**: Retrieve a list of all deliveries.
- **Get Delivery by ID**: Retrieve a specific delivery by its ID.
- **Update Delivery**: Update the details of an existing delivery.
- **Delete Delivery**: Remove a delivery record from the system.

## Requirements

- Java 11 or later
- Maven 3.6.3 or later
- Spring Boot 2.3.1.RELEASE or later
- An IDE (Eclipse, IntelliJ IDEA, or Visual Studio Code recommended)
The application will start running on http://localhost:8080.

API Endpoints
All requests and responses are formatted as JSON.

POST /api/v1/deliveries - Create a new delivery
GET /api/v1/deliveries - Retrieve all deliveries
GET /api/v1/deliveries/{id} - Retrieve a delivery by ID
PUT /api/v1/deliveries/{id} - Update a delivery
DELETE /api/v1/deliveries/{id} - Delete a delivery

