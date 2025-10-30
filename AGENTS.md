# Repository Guidelines

## Project Structure & Module Organization
- Application code: `src/main/java/com/venkat` (Spring Boot entry: `StartApplication.java`).
- Views and assets: `src/main/resources/templates` (Thymeleaf), `src/main/resources/static/{css,js}`.
- Configuration: `src/main/resources/application.properties`.
- Tests (add here): `src/test/java/...` mirroring package names.
- Build output: `target/` (jar name: `spring-boot-web.jar`).

## Build, Test, and Development Commands
- Build package: `mvn clean package` — compiles and produces jar in `target/`.
- Run locally: `mvn spring-boot:run` or `java -jar target/spring-boot-web.jar`.
- Unit tests: `mvn test` — runs tests under `src/test/java`.
- Docker build/run:
  - `docker build -t ultimate-cicd-pipeline:v1 .`
  - `docker run -d -p 8010:8080 ultimate-cicd-pipeline:v1`

## Coding Style & Naming Conventions
- Java 17 (see `pom.xml`). Prefer 4‑space indentation, UTF‑8 encoding.
- Packages: `com.venkat...`; Classes: PascalCase; methods/fields: camelCase; constants: UPPER_SNAKE_CASE.
- Keep controllers thin; place view logic in templates; static files under `static/`.
- Organize by feature when adding modules (controller/service/config under the same package root).

## Testing Guidelines
- Framework: JUnit (via `spring-boot-starter-test`).
- Location: `src/test/java/...` matching main package structure.
- Naming: `ClassNameTest.java`; use descriptive test method names.
- Run locally with `mvn test`; aim for meaningful coverage around controllers and configuration.

## Commit & Pull Request Guidelines
- Commits: imperative, present tense (e.g., "Add health endpoint"); scope in subject when helpful; keep under ~72 chars.
- PRs: clear description, what/why, screenshots for UI changes, reproduction steps, and links to issues. Confirm local build/tests pass.

## Security & Configuration Tips
- Never commit secrets. Externalize credentials using environment variables and reference them in `application.properties`.
- Validate inputs on controller endpoints; avoid logging sensitive data.

## Agent-Specific Instructions
- These guidelines apply to the entire repository. Maintain existing structure and naming. When adding files, follow paths above and keep changes minimal and focused.
