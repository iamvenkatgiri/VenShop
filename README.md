# VenShop — Spring Boot Web App

VenShop is a simple Spring Boot + Thymeleaf demo storefront. It follows a classic MVC pattern: the controller maps the root path (`/`) and renders the `index` view with a title and message.

Key tech: Java 11, Spring Boot, Thymeleaf, Maven. The packaged JAR is `target/spring-boot-web.jar`.

## Project Structure

- Application code: `src/main/java/com/venkat` (entry point: `StartApplication.java`).
- Views and assets: `src/main/resources/templates` (Thymeleaf), `src/main/resources/static/{css,js}`.
- Configuration: `src/main/resources/application.properties`.
- Tests: `src/test/java/...` mirroring package names (add here).
- Build output: `target/`.

## Build

Build the application with Maven (produces the JAR under `target/`):

```
mvn clean package
```

## Run Locally

You can run via Spring Boot Maven plugin or the built JAR:

```
mvn spring-boot:run
# or
java -jar target/spring-boot-web.jar
```

Default port is 8081. Override with the `SERVER_PORT` environment variable (see `src/main/resources/application.properties`). Examples:

```
# default
curl http://localhost:8081/

# custom port
SERVER_PORT=8080 java -jar target/spring-boot-web.jar
```

## Docker

Build and run using Docker:

```
docker build -t ultimate-cicd-pipeline:v1 .

# Map host 8010 to app port 8081 (default)
docker run -d -p 8010:8081 ultimate-cicd-pipeline:v1
# or run the app on 8080 inside the container
docker run -d -e SERVER_PORT=8080 -p 8010:8080 ultimate-cicd-pipeline:v1
```

Access the app at `http://localhost:8010`.

## Testing

Run unit tests with:

```
mvn test
```

Add tests under `src/test/java/...` matching the main package structure.

## Configuration

- Server port: `server.port=${SERVER_PORT:8081}` — override with `SERVER_PORT`.
- Keep secrets out of the repo; externalize credentials via environment variables and reference them in `application.properties`.

## Notes

- Java version: 11 (configured in `pom.xml`).
- JAR name: `spring-boot-web.jar`.
- This repo includes a `Dockerfile` and a `JenkinsFile` suitable for CI/CD pipelines.

## Next Steps (Optional)

- Integrate code quality checks (e.g., SonarQube) in your CI.
- Expand the MVC with services and persistence if needed.
