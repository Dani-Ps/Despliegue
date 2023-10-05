# Biblioteca de Reservas de Libros

> ## Curso Escolar 2023-2024
>
>## Autor: [Daniel Perez Serrano](https://github.com/Dani-Ps)
>
>## Tutor: [Antonio Grabiel Gonzales Casado](https://github.com/antonio-gabriel-gonzalez-casado)
>
>## Fecha de Inicio: 01-10-2023
>
>## Fecha de Finalización: 01-06-2024

## Descripción del proyecto

> Este proyecto es una aplicación de gestión de biblioteca que permite mantener un registro de libros y reservas.
> Está escrito en Java y JavaScript, y utiliza documentación generada para facilitar su comprensión y desarrollo.

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
|   |-- /css
|   |   |-- style.css
|-- /docs
|   |-- /javadoc
|   |   |-- index.html
|   |-- /jsdoc
|   |   |-- index.html
|-- /node_modules
|-- README.md
|-- CHANGELOG.md
```

## Estructura del Proyecto

El proyecto sigue la siguiente estructura de directorios:

- `/src` contiene el código fuente de Java y JavaScript.
- `/docs` contiene la documentación generada.
- `/css` contiene archivos de estilo CSS (si es aplicable).
- `/node_modules` contiene las dependencias de Node.js (JavaScript) si las hubiera. Esta carpeta se utiliza para almacenar las bibliotecas y módulos necesarios para el proyecto JavaScript.

## Enlaces a la documentación generada

La documentación de este proyecto ha sido generada y está disponible en los siguientes enlaces:

- [Documentación JavaDoc](./docs/javadoc/index.html)
- [Documentación JSDoc](./docs/jsdoc/index.html)

## Instrucciones para clonar, configurar e ejecutar en local

### Clonar desde el repositorio

Puedes clonar este repositorio utilizando el siguiente comando:

> `git clone https://github.com/Dani-Ps/Despliegue`

## Java

### **Ejecución en Java**

> Configuración en IDE
>
> > 1. Abre tu IDE favorito (por ejemplo, Eclipse, IntelliJ, Visual Studio Code, etc.).
> > 2. Importa el proyecto desde la ubicación donde lo has clonado.
> > 3. Ejecución en local
> > 4. Abre el proyecto en tu IDE.
> > 5. Ejecuta el archivo Main.java para iniciar la aplicación.

## JavaScript

### **Ejecución en JavaScript**

> Configuración de entorno
>
> > 1. Asegúrate de tener Node.js instalado.
> > 2. Clona el repositorio:
> > 3. Crea una carpeta en local y sigue los sguiente comandos:
> >
```bash
git init
git clone https://github.com/Dani-Ps/Despliegue
cd biblioteca-reservas-libros/js
npm install
node main.js
```

## Comandos utilizados para generar la documentación

### Para generar la documentación, se utilizaron los siguientes comandos

> Generar JavaDoc
>
> > Sustituye `./src/` con la ubicación de tus archivos Java.
> > Sustituye `./docs/javadoc` con la ubicación donde quieres que se genere el JavaDoc.

```bash
javadoc -d ./docs/javadoc -sourcepath ./src/ -subpackages filejava
```

> Generar JSDoc (para JavaScript)
>
> > Sustituye `src/js` con la ubicación de tus archivos JS.
> > Sustituye `docs/jsdoc` con la ubicación donde quieres que se genere el JSDoc.
> > **_Asegúrate de tener JSDoc instalado._** > > [Enlace a una guía de instalación a JSDoc](https://gist.github.com/m-coding/1a7fce771ab0b82904d6)

```bash
jsdoc src/js -d docs/jsdoc
```

## Tabla de contenido de la hoja de estilo

1. Valores Predeterminados
   - Selección de elementos (body, h1, p, ul, li)

2. Estilos del Cuerpo (body)
   - Fuente y Familia de Fuente ('Helvetica, Arial, sans-serif')
   - Color de Fondo (#f0f0f0)
   - Color del Texto (#555)
   - Espaciado entre Líneas (1.4)

3. Estilos del Encabezado (header)
   - Color de Fondo (#333)
   - Color del Texto (#fff)
   - Espaciado Interior (15px en la parte superior e inferior, 0 en los lados)
   - Alineación del Texto (Centrado)

4. Estilos de Encabezados de Nivel 1 (h1)
   - Tamaño de Fuente (40px)
   - Margen Inferior (30px)

5. Estilos de la Barra de Navegación (nav)
   - Color de Fondo (#444)
   - Espaciado Interior (15px)

6. Estilos de Enlaces en la Navegación (nav a)
   - Color del Texto (#eee)
   - Decoración de Subrayado ('none')
   - Margen Derecho entre Enlaces (20px)

7. Estilos del Enlace Actual en la Navegación (nav a.current)
   - Peso de la Fuente en Negrita
   - Color del Enlace Actual (#ff6600)

8. Estilos del Contenido Principal (.main-content)
   - Espaciado Interior (30px)
   - Color de Fondo (#f5f5f5)
   - Sombra Ligera (2px 2px 5px rgba(0, 0, 0, 0.2))

9. Estilos de la Sección de Productos (.product-section)
   - Margen Superior (30px)

10. Estilos de Listas de Productos (.product-list)
    - Eliminación de Viñetas de Lista ('disc')

11. Estilos de Elementos de Lista de Productos (.product-list-item)
    - Borde (2px solid #ddd)
    - Espaciado Interior (15px)
    - Margen Inferior (15px)

12. Estilos del Pie de Página (footer)
    - Color de Fondo (#333)
    - Color del Texto (#eee)
    - Espaciado Interior (15px en la parte superior e inferior, 0 en los lados)
    - Alineación del Texto (Centrado)

13. Estilos para Pantallas Pequeñas (Media Query)
    - Reducción del Tamaño de Fuente para h1 (24px)
    - Reducción del Tamaño de Fuente para .main-content (14px)

14. Nuevas Clases
    - Estilo para la Clase .special-text
    - Estilo para la Clase .highlight-box

Tipo de Fuente: body: 'Helvetica, Arial, sans-serif'


## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para obtener más detalles.

## Contacto

Si tienes alguna pregunta o sugerencia, no dudes en contactarme en mi [correo](dperser837@g.educaand.es) o a través de mi perfil de [GitHub](https://github.com/Dani-Ps).
