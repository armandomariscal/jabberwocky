# Jabberwocky: Financial BI Backend

A robust backend system built with **Spring Boot 3.2** and **Java 21**, designed for high-performance financial movement tracking and business intelligence processing.

## Tech Stack
* **Language:** Java 21 (LTS)
* **Framework:** Spring Boot 3.2
* **Database:** PostgreSQL 16
* **Persistence:** Spring Data JPA / Hibernate
* **Tools:** Maven, Docker, Lombok

## Project Structure
The project follows a standard Layered Architecture:
* `Controller`: REST API endpoints and request orchestration.
* `Service`: Business logic and transaction management.
* `Repository`: Data access abstraction.
* `Model`: Managed JPA entities.

## Getting Started

### Prerequisites
* JDK 21
* Maven 3.9+
* Docker & Docker Compose

### Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/armandomariscal/jabberwocky
   ```
2. Spin up the infrastructure:
    ```bash
    docker-compose up -d
   ```
3. Run the application:
    ```bash
    ./mvnw spring-boot:run
    ```

### Documentation
Detailed technical specifications are available in the /docs folder:

- Architecture Overview
- Data Flow & Communication
- System Requirements

---

Note: Spanish documentation is also available in the docs/es directory.

---