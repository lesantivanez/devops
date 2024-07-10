# Dockerfile
FROM maven:3.9.8-amazoncorretto-8-al2023

# Instalar adduser si no está disponible
RUN yum install -y shadow-utils

# Crear el usuario jenkins
RUN adduser -u 1000 -m -s /bin/bash jenkins

# Establecer el usuario jenkins como el usuario actual
USER jenkins

