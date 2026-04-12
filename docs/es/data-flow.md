# Data Flow & Communication: Jabberwocky

## Communication Channels
1. **Request/Response (Sync):** Cliente <-> MovementsController vía HTTP Port 8080.
2. **Internal Event Bus (Async):** Services <-> @Async Methods para tareas de procesamiento de datos en segundo plano.
3. **Database I/O:** Application Layer <-> PostgreSQL vía Port 5432 utilizando JDBC/HikariCP.

## Event Flow (Movement Processing)
1. El cliente realiza una petición al endpoint /api/movements.
2. El Controller valida el DTO (Data Transfer Object) y lo transfiere a la capa de Servicio.
3. El Servicio ejecuta las reglas de negocio y persiste el estado en la base de datos a través de JPA.
4. Se dispara una tarea asíncrona para la actualización de balances o generación de metadatos si es requerido.
5. El sistema retorna la entidad procesada o el estado de la transacción al cliente.

## Initial Data Schema
* **Movement Entity:** Estructura principal que contiene ID, descripción, monto, categoría y marca de tiempo.
* **Audit Logs:** Registro de transacciones y estados del sistema para trazabilidad técnica.