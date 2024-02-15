# Changelog
All notable changes to this project will be documented in this file.

## [Unreleased]
### Added
- Created Badge entity class with JPA annotations and basic attributes as per user requirements.
- Added new dependencies in pom.xml for Spring Boot Web, JPA, H2 database, JAXB API, and org.javassist.
- Configured H2 database settings in application.properties.
- Created data.sql file in resources to preload Badge data.
- Created BadgeRepository interface extending JpaRepository.
- Created BadgeService class to interact with BadgeRepository.
- Created BadgeController class with a GET endpoint to retrieve all badges.
