Foro Hub - API Backend
Bienvenido a Foro Hub, un proyecto que simula la funcionalidad de un foro de discusión en línea, específicamente centrado en la gestión de tópicos. Esta API REST permite a los usuarios crear, leer, actualizar y eliminar tópicos, proporcionando las funcionalidades básicas de un foro.

Historia
El propósito de este proyecto fue replicar, a nivel back-end, el funcionamiento de un foro, permitiendo gestionar los tópicos de manera eficiente. En plataformas como Alura, los estudiantes utilizan foros para resolver dudas sobre cursos y proyectos. Pero, ¿cómo funciona el backend de un foro? ¿Cómo se almacenan y gestionan los datos relacionados con los tópicos, respuestas y usuarios?

El reto fue desarrollar una API REST usando el framework Spring, con un enfoque en la gestión de tópicos. La API permite a los usuarios:

Crear un nuevo tópico
Mostrar todos los tópicos creados
Mostrar un tópico específico
Actualizar un tópico
Eliminar un tópico
Funcionalidades
Este proyecto incluye una API con las siguientes características:

Rutas implementadas siguiendo las mejores prácticas del modelo REST.
Validaciones conforme a las reglas de negocio.
Persistencia de datos mediante una base de datos.
Servicio de autenticación y autorización para restringir el acceso a la información.
Tecnologías Utilizadas
Spring Framework: Para el desarrollo de la API REST.
Base de Datos: Para almacenar los tópicos y sus datos asociados.
JWT (JSON Web Tokens): Para implementar la autenticación y autorización.
Cómo Ejecutar el Proyecto
Clona el repositorio en tu máquina local.
Asegúrate de tener Java y Maven instalados en tu sistema.
Configura las credenciales de tu base de datos en el archivo de configuración.
Ejecuta la aplicación con mvn spring-boot:run desde la terminal.
Accede a la API a través de las rutas configuradas.
Contribuciones
Este proyecto está abierto a contribuciones. Si deseas mejorar o agregar nuevas funcionalidades, no dudes en abrir un pull request. ¡Estamos felices de colaborar!
