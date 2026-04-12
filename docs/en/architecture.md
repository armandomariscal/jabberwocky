# Architecture Overview: Jabberwocky

## Components
* **Web API (Spring Boot 3.2):** Embedded application server (Tomcat). Manages business logic, dependency injection, and REST resource mapping.
* **Persistence Layer (Spring Data JPA):** Abstraction over Hibernate for ORM management and database communication.
* **Database (PostgreSQL 16):** Relational engine for the persistence of the Movement entity and audit logs.
* **Async Executor (Spring TaskExecutor):** Framework-managed thread pool for non-blocking process execution.

## Deployment Strategy
* **Containerization:** Packaged via Docker using OpenJDK 21-slim base images to optimize image size.
* **Build Automation:** Lifecycle managed entirely by Apache Maven (Clean, Compile, Install).
* **Environment Control:** Isolation of environment variables and secrets using .env files and Spring Profiles (application-dev.properties).

## Trade-offs
* **JVM Overhead:** Increased RAM consumption at rest compared to Node.js or Python solutions is accepted in exchange for strong typing and a highly mature enterprise library ecosystem (Spring).