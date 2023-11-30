**Developer:** Jose Calderon<br>
**Email:** joscompu@gmail.com

# Api-accuweather
**Descripción:** Este proyecto consiste en un microservicio que consume una API externa del clima. La API proporciona datos de temperatura diaria para una ciudad.


## Requisitos Previos
Asegúrate de tener los siguientes requisitos previos instalados antes de levantar el proyecto:

- Java 8 <br>
### Configuración de Variables de Entorno:

#### Url de la api externa
- **URL_API**=http://dataservice.accuweather.com/forecasts/v1/daily/1day/7894?apikey=w6lz64yonMFRHkpykyTGGKQ5TAbHtpeW <br>

    
  **Nota:** Se indica que el Apikey tiene un tiempo de expiracion, por lo que se debe crear cada cierto tiempo una nueva app en el panel de accuweather.

#### Base de Datos H2

- **DATA_SOURCE_URL**=jdbc:h2:mem:testdb

- **DATA_SOURCE_DRIVER**=org.h2.Driver

- **DATA_SOURCE_USERNAME**=sa


  **Nota:** Para el caso de la base datos, por motivo de seguridad, no es recomendable exponer aqui las variables de base datos, pero como es una prueba tecnica,
  queremos indicarlas.

# Swagger

Puedes acceder a la interfaz Swagger y explorar las API mediante el siguiente enlace después de iniciar el proyecto:

[Swagger UI](http://localhost:8080/swagger-ui/#/)

# Postman
En "Resources" se encuentra una carpeta llamada "postman" la cual contiene las colecciones y enviroment para probar los endpoint del de la api.
