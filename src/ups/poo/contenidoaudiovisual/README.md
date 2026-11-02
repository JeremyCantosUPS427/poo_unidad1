# Proyecto Contenido Audiovisual

## Descripción

Este proyecto fue realizado en Java con el objetivo de practicar y entender mejor la Programación Orientada a Objetos.

En el programa se crearon diferentes tipos de contenidos audiovisuales, como películas, series, documentales, videos musicales y reels de TikTok.

También se utilizaron conceptos como herencia, polimorfismo, agregación y composición.

## Contenido del proyecto

El proyecto tiene una clase principal llamada `ContenidoAudiovisual`, de la cual se crean diferentes clases hijas.

Las clases utilizadas son:

* `ContenidoAudiovisual`
* `Pelicula`
* `SerieDeTV`
* `Documental`
* `VideoMusical`
* `RelsTiktok`
* `Actor`
* `Temporadas`
* `Investigador`
* `Artista`
* `Influencer`

## Relaciones entre las clases

En el proyecto se utilizaron diferentes relaciones entre clases.

### Composición

Se utilizó composición en:

* `Pelicula` con `Actor`
* `VideoMusical` con `Artista`

En estos casos, la clase principal se encarga de crear los objetos que necesita.

Por ejemplo, una película recibe los nombres de los actores y crea los objetos `Actor` dentro de la misma clase.

```java
this.actores = Arrays.stream(opcionActores)
        .map(Actor::new)
        .toArray(Actor[]::new);
```

### Agregación

También se utilizó agregación en:

* `SerieDeTV` con `Temporadas`
* `Documental` con `Investigador`
* `RelsTiktok` con `Influencer`

En estos casos, primero se crea el objeto y después se agrega a la clase correspondiente.

Ejemplo:

```java
Investigador investigador1 = new Investigador("Juan Pérez");

documental.agregarInvestigador(investigador1);
```

## Stream y map

También se utilizó `Stream` y `map()` para trabajar con varios objetos y obtener la información que necesitamos.

Por ejemplo:

```java
Arrays.stream(actores)
        .map(actor -> actor.getNombre())
        .forEach(System.out::println);
```

En este caso se recorren los actores y se muestra solamente el nombre de cada uno.

## Estructura del proyecto

```text
src/
└── ups.poo.contenidoaudiovisual/
    ├── ejecutable/
    │   └── MainContenidoAudiovisual.java
    │
    └── modelo/
        ├── ContenidoAudiovisual.java
        ├── Pelicula.java
        ├── Actor.java
        ├── SerieDeTV.java
        ├── Temporadas.java
        ├── Documental.java
        ├── Investigador.java
        ├── VideoMusical.java
        ├── Artista.java
        ├── RelsTiktok.java
        └── Influencer.java
```

## Requisitos

Para poder utilizar el proyecto se necesita:

* Tener Java instalado.
* Tener un programa para trabajar con Java, como Eclipse o IntelliJ IDEA.
* Git, en caso de querer clonar el proyecto desde GitHub.

## Instalación

Primero se debe clonar el repositorio:

```bash
git clone URL_DEL_REPOSITORIO
```

Después se abre la carpeta del proyecto desde Eclipse.

En Eclipse se puede utilizar:

```text
File → Import → Existing Projects into Workspace
```

Luego se selecciona la carpeta donde se encuentra el proyecto.

## Ejecución

Para ejecutar el programa se debe abrir la clase:

```text
MainContenidoAudiovisual.java
```

Después hacer clic derecho y seleccionar:

```text
Run As → Java Application
```

Al ejecutar el programa se mostrarán los datos de los diferentes contenidos audiovisuales y las relaciones que tienen con las demás clases.

## Temas utilizados

Durante el desarrollo del proyecto se trabajó con:

* Clases y objetos
* Herencia
* Polimorfismo
* Encapsulamiento
* Asociación
* Agregación
* Composición
* Arreglos
* Listas
* Stream
* map
* forEach

## Autor

Jeremy
