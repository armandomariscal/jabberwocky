# Architecture Overview: Jabberwocky

## Components
* **Web API (Spring Boot 3.2):** Servidor de aplicaciones embebido (Tomcat). Gestiona la lógica de negocio, la inyección de dependencias y el mapeo de recursos REST.
* **Persistence Layer (Spring Data JPA):** Abstracción sobre Hibernate para la gestión del ORM y la comunicación con el motor de base de datos.
* **Database (PostgreSQL 16):** Motor relacional para la persistencia de la entidad Movement y logs de auditoría.
* **Async Executor (Spring TaskExecutor):** Pool de hilos gestionado por el framework para la ejecución de procesos no bloqueantes.

## Deployment Strategy
* **Containerization:** Empaquetado mediante Docker utilizando imágenes base de OpenJDK 21-slim para optimizar el tamaño de la imagen.
* **Build Automation:** Ciclo de vida gestionado íntegramente por Apache Maven (Clean, Compile, Install).
* **Environment Control:** Aislamiento de variables de entorno y secretos mediante archivos .env y perfiles de Spring (application-dev.properties).

## Trade-offs
* **JVM Overhead:** Se asume un mayor consumo de memoria RAM en reposo comparado con soluciones Node.js o Python, a cambio de un tipado fuerte y un ecosistema de librerías empresariales (Spring) altamente maduro.