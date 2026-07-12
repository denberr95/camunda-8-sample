# camunda-8-sample

## System Requirements

- Java 25
- Maven 3.8.x or above
- Podman
- Podman Compose
- Visual Studio Code (with Java & Spring Boot Extensions)

## Setup

[Tasks](.vscode/tasks.json)

## Links

- [Camunda 8 Home](https://docs.camunda.io/)
- [Using Camunda](https://docs.camunda.io/docs/components/)
- [Getting Started](https://docs.camunda.io/docs/guides/)
- [Camunda Self Managed](https://docs.camunda.io/docs/self-managed/about-self-managed/)
- [API Tools](https://docs.camunda.io/docs/apis-tools/working-with-apis-tools/)
- [Reference](https://docs.camunda.io/docs/reference/)
- [GitHub](https://github.com/camunda/)
- [Camunda Platform Get Started](https://github.com/camunda/camunda-platform-get-started)
- [Camunda Compose Official](https://github.com/camunda/camunda-distributions/tree/main/docker-compose)
- [Camunda Compose Configuration](https://docs.camunda.io/docs/self-managed/quickstart/developer-quickstart/docker-compose/configuration/)

## Access Components Self Managed

- Components
  - user: demo
  - password: demo
- IdP
  - user: admin
  - password: admin

### Orchestration Cluster

- Operate: <http://localhost:8080>
- Tasklist: <http://localhost:8080>
- Orchestration Cluster Admin: <http://localhost:8080/admin>
- Orchestration Cluster REST API: <http://localhost:8080/v2>
- Orchestration Cluster gRPC API: localhost:26500

### Management and modeling components

- Console: <http://localhost:8087>
- Optimize: <http://localhost:8083>
- Management Identity: <http://localhost:8084>
- Web Modeler <http://localhost:8070>

### External dependencies

- Elasticsearch: <http://localhost:9200>
- Keycloak: <http://localhost:18080/auth/>
- PostgreSQL: localhost:5432
