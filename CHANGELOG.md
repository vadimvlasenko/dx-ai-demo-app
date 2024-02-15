# Changelog
All notable changes to this project will be documented in this file.

## [Unreleased]

### Added
- `Badge` entity class with JPA annotations and attributes.
- Repository interface `BadgeRepository` extending `JpaRepository` for `Badge` entity.
- Service class `BadgeService` with methods to fetch all badges, create a new badge, and get a badge by ID.
- REST controller `BadgeController` with endpoints for creating a badge, retrieving all badges, and getting a badge by ID.
- `data.sql` file in the resources directory with predefined badges data.
- H2 database configuration in `application.properties`.
- Dependencies for Spring Boot Web, JPA, H2, jaxb-api, and org.javassist (version '3.23.1-GA') in `pom.xml`.
