# Biblioteca de Reservas de Libros

## Descripción del proyecto

> Este proyecto es una aplicación de gestión de biblioteca que permite mantener un registro de libros y reservas.
> Está escrito en Java y JavaScript, y utiliza documentación generada para facilitar su comprensión y desarrollo.

## Instrucciones para clonar, configurar e ejecutar en local

### Clonar desde el repositorio

Puedes clonar este repositorio utilizando el siguiente comando:

``git clone https://github.com/Dani-Ps/Despliegue``

> Configuración en IDE

1. Abre tu IDE favorito (por ejemplo, Eclipse, IntelliJ, Visual Studio Code, etc.).
2. Importa el proyecto desde la ubicación donde lo has clonado.
3. Ejecución en local
4. Abre el proyecto en tu IDE.
5. Ejecuta el archivo Main.java para iniciar la aplicación.

### Enlaces a la documentación generada

La documentación de este proyecto ha sido generada y está disponible en los siguientes enlaces:

[Documentación JavaDoc](./docs/javadoc/index.html)/

[Documentación JSDoc](./docs/jsdoc/index.html)

### Ejecución en Java

1. Asegúrate de tener Java JDK instalado.
2. Descarga el archivo JAR de la biblioteca desde [releases]([enlace-a-tus-releases](https://www.java.com/es/download/manual.jsp)).
3. Ejecuta la biblioteca en tu terminal:

``java -jar biblioteca-reservas-libros.jar``

## JavaScript

### **Ejecución en JavaScript**

1. Asegúrate de tener Node.js instalado.

2. Clona el repositorio:

Crea una caprpeta en local y sigue los sguiente comandos:

```bash
git init
git clone https://github.com/Dani-Ps/Despliegue
cd biblioteca-reservas-libros/js
npm install
node main.js
```

## Comandos utilizados para generar la documentación

### Para generar la documentación, se utilizaron los siguientes comandos

 Generar JavaDoc
 > Sustituye `./src/` con la ubicación de tus archivos Java.
 > Sustituye `./docs/javadoc` con la ubicación donde quieres que se genere el JavaDoc.

```bash
javadoc -d ./docs/javadoc -sourcepath ./src/ -subpackages filejava
```

 > Generar JSDoc (para JavaScript)
 > >Sustituye `src/js` con la ubicación de tus archivos JS.
 > >Sustituye `docs/jsdoc` con la ubicación donde quieres que se genere el JSDoc.
 ***Asegúrate de tener JSDoc instalado.***

 ```bash
jsdoc src/js -d docs/jsdoc
```

## Estructura de directorios en formato árbol

```bash
/biblioteca-reservas-libros
|-- /src
|   |-- /filejava
|   |   |-- Main.java
|   |   |-- Libro.java
|   |   |-- Reserva.java
|   |-- /js
|   |   |-- main.js
|   |   |-- Libro.js
|   |   |-- Reserva.js
|-- /docs
|   |-- /javadoc
|   |   |-- index.html
|   |-- /jsdoc
|   |   |-- index.html
|-- README.md
|-- CHANGELOG.md
```

## Estructura del Proyecto

El proyecto sigue la siguiente estructura de directorios:

- `/src` contiene el código fuente de Java y JavaScript.
- `/docs` contiene la documentación generada.
- `/css` contiene archivos de estilo CSS (si es aplicable).

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para obtener más detalles.

## Contacto

Si tienes alguna pregunta o sugerencia, no dudes en contactarme en mi [correo](dperser837@g.educaand.es) o a través de mi perfil de [GitHub](https://github.com/Dani-Ps).
