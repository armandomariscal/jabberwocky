# Data Flow & Communication: Jabberwocky

## Communication Channels
1. **Request/Response (Sync):** Client <-> MovementsController via HTTP Port 8080.
2. **Internal Event Bus (Async):** Services <-> @Async Methods for background data processing tasks.
3. **Database I/O:** Application Layer <-> PostgreSQL via Port 5432 using JDBC/HikariCP.

## Event Flow (Movement Processing)
1. The client performs a request to the /api/movements endpoint.
2. The Controller validates the DTO (Data Transfer Object) and transfers it to the Service layer.
3. The Service executes business rules and persists the state in the database through JPA.
4. An asynchronous task is triggered for balance updates or metadata generation if required.
5. The system returns the processed entity or transaction status to the client.

## Initial Data Schema
* **Movement Entity:** Core structure containing ID, description, amount, category, and timestamp.
* **Audit Logs:** Record of transactions and system states for technical traceability.