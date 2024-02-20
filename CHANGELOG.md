# Changelog

## [Unreleased]

### Added
- Badge entity class in `src/main/java/com/epam/edp/demo/entity/Badge.java` with required fields, annotations, and getter/setter methods.
- Repository interface `BadgeRepository` in `src/main/java/com/epam/edp/demo/repository/BadgeRepository.java` that extends JpaRepository for the Badge entity.
- Service class `BadgeService` in `src/main/java/com/epam/edp/demo/service/BadgeService.java` to fetch all badges from the database.
- REST controller `BadgeController` in `src/main/java/com/epam/edp/demo/controller/BadgeController.java` with a GET endpoint to fetch all badges.

### Changed
- Updated `pom.xml` to include dependencies for Spring Boot Web, JPA, H2 database, JAXB API, and org.javassist version '3.23.1-GA'.
- Configured H2 in-memory database in `src/main/resources/application.properties`.

### Added
- `data.sql` file in `src/main/resources/` to populate the database with 5 hardcoded badge entities.
