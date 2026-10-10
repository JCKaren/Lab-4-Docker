# Microservicio de calculadora

Este proyecto consiste en un microservicio desarrollado con Spring Boot que permite realizar operaciones matemáticas básicas mediante servicios web REST. La aplicación cuenta con endpoints para realizar sumas, restas y multiplicaciones, y se puede ejecutar localmente o mediante Docker.

# Tecnologías utilizadas

Java 21.
Spring Boot.
Maven para la gestión y construcción del proyecto.
Docker para crear y ejecutar el contenedor.
Docker Compose para facilitar el despliegue.
Postman para probar los endpoints.


# Requisitos previos

Docker Desktop instalado y en ejecución, si se utiliza Docker.
Java 21 instalado, si se ejecuta localmente.


## Ejecutar con Docker

Con Docker Desktop iniciado, desde la raíz del proyecto ejecuta:

```powershell
docker compose up --build -d
```

La aplicación estará disponible en `http://localhost:8080`. 

Para detenerla:

```powershell
docker compose down
```

# Ejecutar localmente

Con Java 21 instalado, desde la raíz del proyecto ejecuta:

```powershell
.\mvnw.cmd spring-boot:run
```

# Endpoints disponibles

El microservicio cuenta con los siguientes endpoints:

```
Operación        Método HTTP        Endpoint
Suma	              GET	         /api/calculadora/suma
Resta	              GET	         /api/calculadora/resta
Multiplicación	    GET	         /api/calculadora/producto
```
Los endpoints reciben los valores necesarios para realizar cada operación. Los nombres de los parámetros deben consultarse en la implementación del controlador.

# Imagen publicada en Docker Hub

La imagen del proyecto se encuentra publicada en Docker Hub:

```
https://hub.docker.com/r/kell0123/demo-calculadora
```

# Para descargar la imagen, ejecuta:

```
docker pull kell0123/demo-calculadora:v1
```

