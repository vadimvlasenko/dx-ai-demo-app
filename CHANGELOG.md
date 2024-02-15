# Changelog

All notable changes to this project will be documented in this file.

## [Unreleased]

### Added
- `Badge` entity class in `src/main/java/com/epam/edp/demo/entity/Badge.java` with all required JPA annotations and fields.
- Dependencies for Spring Boot Web, JPA, H2 database, jaxb-api, and org.javassist version '3.23.1-GA' in `pom.xml`.
- H2 database configurations in `src/main/resources/application.properties`.
- Initial data for the `Badge` entity in `src/main/resources/data.sql`.
- `BadgeRepository` interface in `src/main/java/com/epam/edp/demo/repository/BadgeRepository.java`.
- `BadgeService` class in `src/main/java/com/epam/edp/demo/service/BadgeService.java`.
- `BadgeController` class in `src/main/java/com/epam/edp/demo/controller/BadgeController.java` with a GET endpoint to fetch all badges.
