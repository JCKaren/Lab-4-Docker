# Microservicio de calculadora

API REST sencilla con operaciones de suma, resta y producto. Los resultados se devuelven como valores numéricos JSON.

## Endpoints

Todos reciben los operandos `a` y `b` como parámetros de consulta:

| Operación | Ruta | Ejemplo |
| --- | --- | --- |
| Suma | `/api/calculadora/suma` | `/api/calculadora/suma?a=5&b=3` |
| Resta | `/api/calculadora/resta` | `/api/calculadora/resta?a=5&b=3` |
| Producto | `/api/calculadora/producto` | `/api/calculadora/producto?a=5&b=3` |

Por ejemplo, la suma anterior responde `8`.

## Ejecutar con Docker Compose

Desde la raíz del proyecto:

```bash
docker compose up --build
```

La API queda disponible en `http://localhost:8080`. Para detenerla, ejecuta `docker compose down`.

## Ejecutar pruebas

En Windows:

```powershell
.\mvnw.cmd test
```

En Linux o macOS:

```bash
./mvnw test
```
