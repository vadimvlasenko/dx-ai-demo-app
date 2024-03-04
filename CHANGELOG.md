# Changelog

All notable changes to this project will be documented in this file.

## [Unreleased]

### Added
- Created `application.properties` for H2 database configuration.
- Created `data.sql` with predefined data for badges.
- Created `Badge` entity class with necessary JPA annotations.
- Created `BadgeRepository` extending JpaRepository for CRUD operations on `Badge` entity.
- Created `BadgeService` with method to retrieve all badges.
- Created `BadgeController` with GET endpoint to fetch all badges and `@CrossOrigin` annotation.
- Updated `pom.xml` with dependencies for Spring Boot Web, JPA, H2 database, JAXB API, and Javaassist.
