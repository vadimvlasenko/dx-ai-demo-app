# Changelog
All notable changes to this project will be documented in this file.

## [Unreleased]

### Added
- Badge entity class with JPA annotations and getter/setter methods.
- Updated pom.xml with dependencies for Spring Boot Web, JPA, H2 database, jaxb-api, and org.javassist version '3.23.1-GA'.
- H2 database configuration in application.properties.
- Data.sql file with hardcoded data for 5 badges.
- BadgeRepository interface extending JpaRepository for the Badge entity.
- BadgeService class to fetch all badges from the database.
- BadgeController class with a GET endpoint to fetch all badges.
