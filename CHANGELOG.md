### Version 4.0.0 - Badge feature implementation
- Created `Badge` entity class with necessary JPA annotations and fields.
- Updated `pom.xml` to include dependencies for Spring Boot Web, JPA, H2, jaxb-api, and org.javassist.
- Configured H2 database in `application.properties`.
- Added `data.sql` with predefined data for the `Badge` entity.
- Created `BadgeRepository` that extends `JpaRepository`.
- Created `BadgeService` to interact with `BadgeRepository`.
- Created `BadgeController` with a GET endpoint to fetch all badges.
