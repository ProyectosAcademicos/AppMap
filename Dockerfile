# Usar una imagen base con Java
FROM eclipse-temurin:17-jdk-alpine

# Crear un directorio dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR al contenedor
COPY . .

# Exponer el puerto (Spring Boot usa 8080 por defecto)
EXPOSE 8080

# Comando para ejecutar la app
ENTRYPOINT ["java", "-jar", "app.jar"]