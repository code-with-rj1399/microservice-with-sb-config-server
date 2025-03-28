# Config Server [microservice-with-sb-config-server]

🔗 **For a complete overview of the microservices architecture and setup, please refer to the [Main README](https://github.com/code-with-rj1399/microservice-with-sb-api-gateway/blob/master/README.md).**

The **Config Server** is responsible for managing and serving externalized configurations for all microservices. It allows services to fetch their configuration dynamically at startup, ensuring consistency across environments.

## How to Start

1. Clone this repository.
2. Open the project in your IDE.
3. Navigate to the `Application` class.
4. Run the application.

## Service Details

- **Port:** `8088`
- **Registers with Eureka:** ✅ Yes
- **Configuration Source:** Reads configurations from a remote Git repository.
- **Exposed Endpoints:**
  - `GET /{service-name}/{profile}` → Fetch configuration for a specific service and environment.
  - Example:
    - `GET /microservice-with-sb-department-service/default` → Fetches default configuration for **Department Service**.
    - `GET /microservice-with-sb-employee-service/dev` → Fetches dev configuration for **Employee Service**.

## Adding a New Service Configuration

To add a new service configuration:
1. Create a configuration file in the `src/main/resources/config/` directory.
2. Use the naming convention `{service-name}.yml` (e.g., `microservice-with-sb-new-service.yml`).
3. Restart the Config Server to apply the changes.

## API Gateway

All services fetch their configurations from this **Config Server** and are exposed through the **[API Gateway](http://localhost:8083)** for centralized routing and security.  
