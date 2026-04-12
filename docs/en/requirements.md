# Requirements: Jabberwocky

## Context
Robust backend system designed for the management and traceability of financial movements, focused on stability, strong typing, and clean architecture.

## Functional Requirements (FR)
* **FR-01: Resource Management:** Full CRUD capabilities for the Movements entity.
* **FR-02: API Exposure:** Implementation of RESTful endpoints with standard JSON response formats.
* **FR-03: Asynchronous Processing:** Capability to execute long-running tasks without degrading the user experience on the main API.
* **FR-04: Data Validation:** Integrity rules to ensure amounts and categories comply with business standards.

## Non-Functional Requirements (NFR)
* **NFR-01: Performance:** Utilization of Java 21 capabilities for concurrency and thread management.
* **NFR-02: Portability:** Reproducible deployment in Linux environments (specifically Fedora/RHEL) via containers.
* **NFR-03: Maintainability:** Use of Maven for strict dependency and library version management.
* **NFR-04: Configuration Security:** Protection of database credentials and system keys through environment variables.