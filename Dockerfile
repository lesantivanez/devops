# Usar una imagen base específica para Maven y JDK
FROM maven:3.6.0-jdk-13

# Crear el usuario jenkins con un UID específico
RUN useradd -m -u 1000 -s /bin/bash jenkins

# Establecer el usuario jenkins como el usuario predeterminado
USER jenkins

# Directorio de trabajo predeterminado
WORKDIR /home/jenkins

# Añadir cualquier dependencia adicional que puedas necesitar
# RUN yum install -y openssh-clients 

# Añadir el resto de las instrucciones que necesites para configurar tu ambiente

# Este comando establece el comando predeterminado a ejecutar cuando se inicia el contenedor
CMD ["bash"]

