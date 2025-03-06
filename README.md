# Taller de trabajo individual en patrones arquitecturales

Students are tasked with developing a simple CRUD (Create, Read, Update, Delete) system for managing real estate properties. The goal is to build a basic web application that allows users to perform the following operations on property listings:

- Create new property listings.
- Read or view a list of all properties and individual property details.
- Update existing property details.
- Delete property listings


## 📌 Características


# Funcionalidades Principales

Este sistema CRUD permite gestionar anuncios de propiedades inmobiliarias. Los usuarios pueden crear, leer, actualizar y eliminar propiedades a través de una interfaz web sencilla y un backend implementado con Spring Boot.


- Crear: Permite a los usuarios agregar nuevos anuncios de propiedades con detalles como dirección, precio, tamaño y descripción.
- Leer: Muestra una lista de todas las propiedades disponibles y permite ver los detalles individuales de cada propiedad.
- Actualizar: Permite editar la información de una propiedad existente.
- Eliminar: Permite eliminar una propiedad de la base de datos.

Despliegue de los servicios de backend y base de datos en servidores separados dentro de de AWS
  
```bash
Despliegue en AWS
```

Se ejecuta localmente en contenedores Docker y también puede ser desplegada en una máquina virtual en AWS.


## 🛠️ Requisitos
- Java 11 o superior
- Git
- Maven
- Docker
- AWS EC2
- MySQL


## 🚀 Instalación y Ejecución
### 1️⃣ Clonar el repositorio
```bash
git clone https://github.com/Juanse2347/AREP_T5
cd AREP_T5
```

### 2️⃣ Compilar el proyecto con Maven
```bash
mvn clean install
```

![Image](https://github.com/user-attachments/assets/0a5c2877-e890-4901-a25a-0cfa24bdb6ee)


### 3️⃣ Ejecutar el servidor 

```bash
mvn spring-boot:run
```

![image](https://github.com/user-attachments/assets/03293b31-728d-4a8c-ac17-72b71f5412c0)



## 🔍 Diseño de Clases 

Clases Principales

> [!IMPORTANT]
>  - **Property**: Representa la entidad de propiedad con los atributos id, address, price, size, y description.
>  - **PropertyService**: Contiene la lógica del negocio para gestionar las operaciones CRUD de las propiedades.
>  - **PropertyController**: Proporciona los endpoints RESTful para interactuar con el frontend.


![image](https://github.com/user-attachments/assets/a10ca6fa-8513-4c8c-a72d-7a8d74b1d3c9)


# 🔍 Sistema Arquitectónico

El sistema consta de tres componentes principales:


- **Frontend (HTML, JavaScript)**: Proporciona la interfaz de usuario para interactuar con las propiedades (crear, leer, actualizar, eliminar).
- **Backend (Spring Boot)**: Proporciona la API RESTful para gestionar las propiedades, implementando los métodos POST, GET, PUT y DELETE.
- **Base de Datos (MySQL en AWS RDS)**: Almacena los datos de las propiedades y asegura su persistencia.


```bash
docker build --tag dockersparkprimer .
```



## 🚀 AWS

# Creamos una instancia en AWS EC2.


![Image](https://github.com/user-attachments/assets/a102160f-35c0-45f0-ad8f-e9fc7839722f)


Vamos a instalar Docker en nuestra instancia

```bash
sudo yum update -y
sudo yum install docker
```

![Image](https://github.com/user-attachments/assets/f924b2cd-1f0f-411c-9f01-cbc67184b835)


Ahora iniciamos el servidor Socket

```bash
sudo service docker start
```

Configuramos el usuario en el grupo de docker para no tener que ingresar “sudo” cada vez que invoca un comando

```bash
sudo usermod -a -G docker ec2-user
```

![Image](https://github.com/user-attachments/assets/27a860aa-c2f0-4120-b11e-f77bd96f2c99)


A partir de la imagen creada en Dockerhub cree una instancia de un contenedor docker independiente de la consola (opción “-d”) y con el puerto 6000 enlazado a un puerto físico de su máquina (opción -p):

```bash
docker run -d -p 42000:6000 --name firstdockerimageaws usuariodedocker/nombredelrepo
```

![Image](https://github.com/user-attachments/assets/5f8fdc17-d3d2-46a7-abd1-3c240b89cd7c)


![Image](https://github.com/user-attachments/assets/d811801a-545b-4f8b-9074-6fe878628129)


Ahora abrimos  los puertos de entrada del security group de la máxima virtual para acceder al servicio


Ahora con:

```bash
http://ec2-34-227-105-59.compute-1.amazonaws.com:42000/index.html
```


![Image](https://github.com/user-attachments/assets/d644fdb6-743a-4246-ab1c-3ab00e15684b)


## 🔍 Pruebas de extremo a extremo ##

Pruebas del navegador 

Probamos que nuestro servicio este funcionando correctamente

```bash
http://localhost:30000/
```


## 🔍 Pruebas de Estilo de Codificacion ##

Con el siguiente comando realizamos las pruebas de estilo de codificación son aquellas que verifican que el código sigue las convenciones y buenas prácticas del equipo o la comunidad

```bash
mvn checkstyle:check
```

![Image](https://github.com/user-attachments/assets/6c5a4c16-9c71-463d-9629-59f5c976213a)


## :office: Desplieqgue ##

Vamos a ejecutar el servidor como un proceso en segundo plano o configurar un servicio systemd, de la siguiente manera:

```bash
java -cp"./classes:./dependency/* co.edu.eci.arep.HttpServer co.edu.eci.arep.GreetingController
```

## :cd: Construido con ## 

 - Java - Lenguaje principal utilizado
 - Maven - Para la gestión de dependencias y automatización
 - Docker - Plataforma de código abierto que permite crear, ejecutar, administrar y actualizar contenedores


## :busts_in_silhouette: Contribuciones ##

Lea [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) para obtener detalles sobre nuestro código de conducta y el proceso para enviarnos solicitudes de extracción.

## :school_satchel: Control de Versiones ##

Usamos [SemVer](http://semver.org/) para controlar las versiones.

## :bust_in_silhouette: Autor ##

* **Juan Sebastian Sanchez** - *Trabajo Inicial* - [Juanse2347](https://github.com/Juanse2347)


## 📄 Licencia
Este proyecto está bajo la licencia [LICENSE](LICENSE). ¡Siéntete libre de contribuir! 😊


## :wave: Expresiones de Gratitud ##

- Inspiracion
- Compromiso

