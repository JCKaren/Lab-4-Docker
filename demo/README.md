# Microservicio de calculadora

## Ejecutar con Docker

Con Docker Desktop iniciado, desde la raíz del proyecto ejecuta:

```powershell
docker compose up --build -d
```

La aplicación estará disponible en `http://localhost:8080`. Para detenerla:

```powershell
docker compose down
```

## Ejecutar localmente

Con Java 21 instalado, ejecuta:

```powershell
.\mvnw.cmd spring-boot:run
```
