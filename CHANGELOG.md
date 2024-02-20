# Changelog

All notable changes to this project will be documented in this file.

## [Unreleased]

- Created `Badge` entity class with attributes, getters, and setters.
- Updated `pom.xml` with dependencies for Spring Boot Web, JPA, H2 database, JAXB API, and org.javassist.
- Configured H2 database in `application.properties`.
- Added hardcoded data for 5 badges in `data.sql`.
- Created `BadgeRepository` interface extending JpaRepository.
- Created `BadgeService` to fetch all badges from the database.
- Created `BadgeController` with a GET endpoint to fetch all badges and added `@CrossOrigin` annotation.
