# camunda-8-sample

## Environment

```bash
podman machine init --memory 8192 --cpus 8 --now
cd collections/camunda
podman compose -f docker-compose.yaml up -d
podman compose -f docker-compose.yaml down
```

## Links

[Compose](https://docs.camunda.io/docs/self-managed/setup/deploy/local/docker-compose)
[Spring Start](https://docs.camunda.io/docs/guides/getting-started-java-spring)
[API Tools](https://docs.camunda.io/docs/apis-tools/working-with-apis-tools/)

## Access Components

- Component
  - user: demo
  - password: demo
- Idp
  - user: admin
  - password: admin

- Operate: <http://localhost:8081>
- Tasklist: <http://localhost:8082>
- Optimize: <http://localhost:8083>
- Identity: <http://localhost:8084>
- Web Modeler <http://localhost:8070>
- Elasticsearch: <http://localhost:9200>
- Keycloak: <http://localhost:18080/auth/>
- Mailpit's Web UI: <http://localhost:8075>
