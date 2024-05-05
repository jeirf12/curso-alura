# Gestor de multimedia (Películas y Series)

El sistema permite la gestión de una biblioteca de contenido digital como Netflix, Prime u otro. La herramienta
permite registrar películas o series, mostrar sus fichas técnicas, también maneja una serie de entradas básicas con un menú interactivo.

## Discurso del problema

Desarrolla un programa en Java que funcione como un menú interactivo para un sistema de gestión de contenido multimedia. El programa deberá permitir al usuario registrar nuevas películas, mostrando detalles como el nombre, año de lanzamiento y duración. Además, el programa deberá permitir al usuario salir cuando lo desee.

## Pre-requisitos

Para poder correr el programa tenemos varias opciones, desde el manejo de consola hasta el uso de intellig.

> [!NOTE] 
> Para la instalación y ejecución del programa debe tener instalado previamente lo siguiente:

* [Java-17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
* [Make](https://gnuwin32.sourceforge.net/packages/make.htm) (Opcional) <-> Make es opcional, si quiere trabajar con linea de comandos (CLI) y sin un entorno de desarrollo integrado (IDE).
* [IntelliG](https://www.jetbrains.com/idea/download/) (Alternativa) <-> IntelliG contiene todos los programas requeridos incluso el JDK para trabajar cómodamente.

---
## Instalación del proyecto
<details>
<summary>Descargar el proyecto</summary>

Para esto vamos a utilizar la CLI.

**En Gnu-Linux/MacOS/windows:**
```
git clone https://github.com/jeirf12/curso-alura -b clase-02
```
</details>

---
## Ejecución y compilación local

<details>
<summary>Ejecución del proyecto</summary>

Para la instalación tenemos varias maneras.

> CLI

En primer lugar, nos ubicamos en la raíz del proyecto y vamos a ejecutar el siguiente comando para compilar y ejecutar el proyecto.

**En linux/MacOS/windows:**
```
make
```

Con el comando anterior puede compilar y ejecutar al mismo tiempo; sin embargo, si ya compilo el proyecto y quiere solo ejecutarlo, puede utilizar el siguiente comando:
```
make run
```

> IntelliG

* En caso de utilizar el IDE intellig, solo es buscar la opción abrir proyecto y seleccionan la carpeta donde esta guardado el proyecto en su pc.

* En segundo lugar, es buscar el botón ejecutar; que es de color verde con un icono de reproducir.

</details>

---
## Introducción

La aplicación contiene elementos que se usa en la Programación orientada a objetos (POO), 
en el cual va dirigida a aquellas personas que están iniciando en el mundo de la ingeniería en sistemas, informáticas, entre otros.
Dentro se puede encontrar con los pilares de POO como `abstraccion`, `encapsulamiento`, `herencia`, y  `polimorfismo`.
También se ve la re factorización y uso de librerías propias, que a medida va avanzando en este campo
va a tener que aprender a crear o reutilizar, según los requerimientos o reglas de negocio.

---
<details>
<summary><b style="font-size: 1.5rem;">Programación orientada a objetos (POO)</b></summary>

- El paradigma de programación orientada a objetos (POO) parte del concepto base del mismo nombre "objetos", los cuales contienen datos en forma de atributos y operaciones en forma de métodos.

- Ejemplo: Supongamos que jugamos con bloques de construcción; cada bloque es un objeto que tiene sus propias características (color y forma). Al juntar un bloque con otro puedes crear cosas útiles como un robot o un castillo. De esta manera funciona POO; tienes tus propios bloques (Clases), que al juntarlos puedes crear un sistema complejo. 
</details>

---
<details>
<summary><b style="font-size: 1.5rem;">Clase</b></summary>

- Una clase es una especie de molde o plantilla que permite instanciar objetos.
- Es una abstracción de la realidad.
- Encapsula datos y funciones miembro.
</details>

---
<details>
<summary><b style="font-size: 1.5rem;">Objeto</b></summary>

- Es una instancia específica de una clase.
- Estos se crean y eliminan durante la ejecución del programa.
- Tienen un ciclo de vida.
</details>

---
<details>
<summary><b style="font-size: 1.5rem;">Diferencias entre Clase y objeto
</b></summary>

* Una diferencia entre un `objeto` y una `clase` es que el **objeto** es una entidad concreta que tiene un tiempo definido de existencia dentro del sistema mientras que la **clase** es solo una abstracción y nunca existe de forma concreta.
</details>

---
<details>
<summary><b style="font-size: 1.5rem;">Abstracción</b></summary>

- Se puede entender como abstracción, al referirnos en el "¿Qué hace?" más que en el "¿Cómo lo hace?". En términos mas simples, es aislar un elemento de su contexto o del resto de los elementos que lo acompañan.
- Ejemplo: Supongamos que tenemos que dibujar un auto. En este caso, nos enfocamos en lo importante, como las ruedas y las ventanas, sin dibujar cada tornillo o parte pequeña que lo conforma.

</details>

---
<details>
<summary><b style="font-size: 1.5rem;">Encapsulamiento</b></summary>

- El encapsulamiento se refiere a una agrupación de datos con los que se operan a través de métodos. En pocas palabras, se utiliza para ocultar los valores o el estado de un objeto de datos estructurados dentro de una `clase`.
- Ejemplo: Imaginemos que tienes una caja mágica donde guardas tus juguetes. 
Solo puedes jugar con ellos usando la caja, pero no puedes ver ni cambiar lo que hay adentro sin abrir la caja. Así proteges tus juguetes y los usas como quieras. 
</details>

---
<details>
<summary><b style="font-size: 1.5rem;">Herencia</b></summary>

- Propiedad o pilar de POO, que permite a los objetos ser construidos a partir de otro. En otras palabras: la capacidad de un objeto para utilizar las estructuras de datos y los métodos previstos de sus ascendientes.
- Ejemplo: Conjeturemos que, un perro y un gato son hermanos, pero cada un o de ellos tienen habilidades diferentes. Ambos pueden ser mascotas y hacer trucos, pero el perro puede ladrar y el gato puede maullar. En este caso, tenemos la clase padre o ascendente llamada Mascota y sus descendientes seria una clase Perro y otra Gato con sus diferentes habilidades. 
</details>

---
<details>
<summary><b style="font-size: 1.5rem;">Polimorfismo</b></summary>

- Se refiere a la propiedad de enviar mensajes con sintaxis iguales a objetos de tipos distintos. Aunque el mensaje sea el mismo, diferentes objetos pueden responder a él de manera única y específica.
- Ejemplo: Tenemos un juguete con el que jugamos todos los días. Sin embargo, en algunos días lo vamos a utilizar como un carro y otras como un avión. Esto quiere decir que el juguete puede ser algo versátil y útil, según como lo estés utilizando.
</details>
