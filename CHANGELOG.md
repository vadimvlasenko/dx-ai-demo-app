```
# Changelog

## [Unreleased]

### Added
- New entity `Badge` with attributes and annotations.
- Updated `pom.xml` with dependencies for Spring Boot Web, JPA, H2, jaxb-api, and org.javassist.
- Configuration for H2 database in `application.properties`.
- Hardcoded data for 5 badges in `data.sql`.
- Repository interface `BadgeRepository` that extends JpaRepository for the Badge entity.
- Service class `BadgeService` to fetch all badges from the database.
- REST controller `BadgeController` with GET endpoint `/badges`.
```
