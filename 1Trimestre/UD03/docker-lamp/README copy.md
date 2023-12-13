# Manual Despleigue Docker-lamp
Proyecto para la instalación de LAMP a través de contenedores Docker

## Estas son algunas de las anotaciones que seran utilizadas.

> [!NOTE]
> Para el manual de despliegue.

> [!TIP]
> Para consejos claves.

> [!IMPORTANT]
> Para avisos importantes.

>[!WARNING]
> Para prestar atención en ese paso concreto.

> [!CAUTION]
> Para tener precaución en un punto concreto.


```
docker-lamp
├─ .gitignore 
├─ LICENSE
├─ README.md
├─ apache2-php
│  ├─ Dockerfile
│  ├─ conf
│  │  ├─ 000-default.conf
│  │  └─ intranet.conf
│  ├─ etc
│  │  ├─ apache2
│  └─ www
│     ├─ index.html
│     ├─ intranet
│     │  └─ index.html
│     ├─ phpinfo.php
│     └─ test-bd.php
├─ dist
│  ├─ env.dist
│  └─ htpasswd.dist
├─ docker-compose.yml
├─ docs
│  └─ images
└─ mysql
   ├─ conf
   └─ dump
      └─ myDb.sql

```
> [!NOTE]
>## Descripcion de la estructura del proyecto: 
>
>
>La estructura del proyecto `docker-lamp` es un entorno de desarrollo LAMP (Linux, Apache, MySQL, PHP) utilizando Docker. A continuación, se describen cada parte de la estructura:
> 
>- **.gitignore**: Este archivo indica a Git qué archivos o carpetas ignorar en el control de versiones, como archivos de configuración personales o directorios de compilación. En este caso ignoraremos el archivo con las variables de entorno .env
>
>- **LICENSE**: Contiene información sobre la licencia bajo la cual se distribuye el proyecto, especificando cómo se puede usar o modificar.
>
>- **README.md**: Incluye información sobre el proyecto, como descripciones, instrucciones de instalación, uso y créditos.
>
>- **apache2-php/**: Esta carpeta contiene los archivos relacionados con el servidor web Apache y PHP.
>  - **certs/**: Contiene archivos de certificaciones ssl.
>  - **Dockerfile**: Script de instrucciones para construir la imagen Docker para el servidor Apache con PHP.
 > - **conf/**: Contiene archivos de configuración para Apache.
 >   - **000-default.conf**: La configuración predeterminada del Virtual Host para Apache.
  >  - **intranet.conf**: La configuración del Virtual Host para la intranet, accesible en un puerto específico o subdominio.
 > - **etc/apache2/**: Contiene archivos de configuración adicionales para el directorio apache2.
> - **www/**: Directorio que almacena los archivos del sitio web.
   > - **index.html**: Página de inicio para el sitio principal.
    >- **intranet/**: Carpeta que contiene los archivos para la sección de intranet del sitio.
      >- **index.html**: Página de inicio para la intranet.
    >- **phpinfo.php**: Script PHP para mostrar información sobre la configuración de PHP.
   > - **test-bd.php**: Script PHP para probar la conexión a la base de datos MySQL.
>
>- **dist/**: Contiene plantillas o archivos distribuibles, en este caso una versión de ejemplo del archivo `.env`.
 > - **env.dist**: Una plantilla para el archivo de variables de entorno.
 > - **htpasswd.dist**: Una plantilla para con usuario de ejemplo inicial para acceder a la intranet
>
>- **docker-compose.yml**: Archivo YAML que define los servicios, redes y volúmenes para el proyecto, organizando y ejecutando múltiples contenedores Docker.
>
>- **docs/**: Directorio destinado a contener documentación del proyecto.
  >- **images/**: Imágenes utilizadas en la documentación.
>
>- **mysql/**: Contiene configuraciones y datos relacionados con el servicio de base de datos MySQL.
 > - **conf/**: Directorio para archivos de configuración personalizados de MySQL.
 > - **dump/**: Contiene archivos de carga de bases de datos, como scripts SQL para inicializar la base de datos.
   > - **myDb.sql**: Un script SQL con lo necesario para inicializar la base de datos.


# Guía de Instalación del Proyecto Docker LAMP

Esta guía detalla los pasos para clonar y configurar un entorno Docker LAMP (Linux, Apache, MySQL, PHP) con Virtual Hosts.

## Clonar el Repositorio

Primero, clonar el repositorio Git:

```bash
git clone [https://github.com/antonio-gabriel-gonzalez-casado/docker-lamp/]
cd docker-lamp
```
![](./images/Clonado-repo.png)

##  Copiar y configurar Archivo .env

Copiar el archivo env.dist a .env y personaliza las variables de entorno:

```bash
cp dist/env.dist .env
```
Comprobamos
![](./images/copy-env.png)

Editar el archivo .env estableciendo los siguientes valores:

```
MYSQL_DATABASE=dbname
MYSQL_USER=root
MYSQL_PASSWORD=test
MYSQL_ROOT_PASSWORD=test
MYSQL_PORT=3307
```
##  Copiar y configurar Archivo .htpasswd

Copiar el archivo htpasswd.dist a ./apache2-php/etc/apache2/ y añade usuarios para acceder a la intranet:

```bash
cp dist/htpasswd.dist ./apache2-php/etc/apache2/.htpasswd
```

![](./images/copy.passwd.png)

Comprobamos que se ha copiado adecuadamente:

![](./images/c-passwd.png)

Añadir un usuario con formato: 
```
usuario:contraseña
```
La constraseña se puede generar con la utilidad de apache2-utils o directamente usando un [generador online](https://hellotools.org/es/generar-cifrar-contrasena-para-archivo-htpasswd)

![](./images/create-user.png)

## Construir las Imágenes

Construir las imágenes usando Docker Compose:

```bash
docker-compose build
```

![](./images/build.png)

## Iniciar los Contenedores

Arrancar los contenedores en modo detached:

```bash
docker-compose up -d
```
![](./images/up.png)

## Parte 1 (VIRTUAL HOST)


### A) Modificar el nombre del virtualhost de la intranet y de local con nombre-apellido-x.local

> En la carpeta ./docker-lamp/apache2-php/conf
> > En el archivo 000-dafault.conf:
> > >![](./images/local-servername.png)
> > En el archivo intranet.conf:
> > >![](./images/intranet-servername.png)

### B) Crear un nuevo virtual host para el servicio phpmyadmin. Este deberá estar configurado con el nombre nombre-apellidos-phpmyadmin.local:8081 y debe ser solo accesible por los mismos usuarios que pueden acceder a la intranet.

> En la carpeta ./docker-lamp/apache2-php/conf
> > Creamos el archivo en cuestion con el nombre: nombre-apellidos-phpmyadmin.conf
> > Instrucciones de configuración:
> >- Configurar el puerto la escucha por el puerto 8081
> >- Tener la misma configuración de autenticación que la intranet, pero en este caso en vez de estar dentro de <Directory> debe estar dentro de la etiqueta <location /> ya que se va a configurar un proxy inverso para redirigir.
> >- Después de cerrar la etiqueta </Location> se tiene que incluir la configuración del > >proxy inverso que redirija todas las peticiones al servicio de phpmyadmin desplegado. Hay > >que agregar las siguientes líneas:

```
ProxyPreserveHost On
ProxyPass / http://phpmyadmin:80/
ProxyPassReverse / http://phpmyadmin:80/
```
![](./images/new-php-vh.png)

### C)  Habilitar los módulos de proxy inverso en el Dockerfile de la imágen de apache. Estos módulos son: proxy proxy_http.

Para ello en el _Dockerfile_ añadimos las siguientes líneas:
```
&& a2enmod proxy \
&& a2enmod proxy_http \
```

![](./images/dockerfile-new-php-conf.png)

### D) Por último no olvidar activar el módulo de configuración del nombre-apellidos-phpmyadmin.conf en el Dockerfile del fichero apache.

Para ello en el _Dockerfile_ añadimos las siguientes líneas:
```
# Activar el módulo de configuración del nombre-apellidos-phpmyadmin.conf
RUN a2ensite daniel-perezserrano-phpmyadmin.conf

```

![](./images/dockerfile-new-php-conf.png)


> [!NOTE]
> [!TIP]
> [!IMPORTANT]
> [!WARNING]
> [!CAUTON]