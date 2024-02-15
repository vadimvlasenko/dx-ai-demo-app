# Changelog

## [Unreleased]

### Added
- New entity class `Badge` with corresponding repository, service, and controller.
- CRUD endpoints for `Badge` entity.
- H2 database configuration in `application.properties`.
- Dependencies for Spring Boot Web, JPA, H2, jaxb-api, and org.javassist in `pom.xml`.
- Initial data for `Badge` entity in `data.sql`.

### Changed
- Updated `application.properties` with H2 database configurations.

### Fixed
- Corrected the setter for `badgeName` in `Badge` entity.
