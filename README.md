## Ejercicio 31
Una empresa corredora de propiedades necesita contar con un sistema de registro de sus
trabajadores y sus cargas familiares. Anteriormente se definió la clase Trabajador, la que contiene
los siguientes campos:
- Nombres
- Apellidos
- RUN (se debe almacenar con guion)
- Teléfono
- Edad
  A la clase anterior se debe agregar el método mostrarDatos(), el cual debe mostrar el teléfono
  y edad del trabajador.
  Además, se sabe que existen tres tipos de trabajadores:
- Honorario: respecto de este tipo de trabajadores, se desea saber su giro y año de iniciación
  de actividades.
- Contratado: de esta categoría se debe conocer su fecha de ingreso y salario mensual.
- Eventual: de este tipo de trabajador se interesa saber su disponibilidad y correo electrónico.
  Como parte de este ejercicio se pide:
- Cree las tres clases indicadas en el listado anterior. Todas tienen que extender desde la clase
  Trabajador.
- Cada clase hija debe tener los atributos antes indicados, junto con sus accesores, mutadores
  y método toString().
- Por cada una de estas clases implemente el método mostrarDatos(). En cada una de
  ellas, el método a crear debe sustituir el comportamiento establecido en la clase Padre.

## Ejercicio 27

Observación: este ejercicio es la continuación del ejercicio individual del día anterior Una empresa corredora de propiedades necesita contar con un sistema de registro de sus trabajadores y sus cargas familiares. Los datos de los trabajadores ya son conocidos; en lo que respecta a las cargas familiares se requiere saber:

- RUN carga (se debe almacenar con guion)
- Nombres
- Apellidos
- RUN Familiar
- Parentesco: 1 (Cónyuge), 2 (Hijo/a), 3 (Otro)
- Edad
  Se solicita crear una clase que represente a una carga familiar de un trabajador, usando atributos con tipos de datos adecuados a la situación. Además, debe considerar lo siguiente:
- Debe agregar un método toString() y dos métodos constructores.
- Debe agregar los modificadores y accesores para cada atributo de la clase
- Debe cambiar el modificador de acceso de los atributos, a fin de mantener el
  encapsulamiento de la clase.
  Los dos últimos pasos aplican para ambas clases creadas.
  Finalmente, genere un proyecto con las dos clases existentes, y comprima el directorio como entrega a este ejercicio.

## Ejercicio 25

Una empresa corredora de propiedades necesita contar con un sistema de registro de sus trabajadores. Por cada uno de ellos se necesita saber:

- Nombres
- Apellidos
- RUN (se debe almacenar con guion)
- Teléfono
- Edad
  Se solicita crear una clase que represente a un trabajador de la empresa, usando atributos con tipos de datos adecuados a la situación. Además, debe considerar lo siguiente:
- Debe agregar un método toString().
- Debe tener dos métodos constructores: uno que cree un objeto vacío, y otro que solicite todos los atributos pertenecientes a la clase.
- Debe agregar el método nombreCompleto(), el cual debe retornar la concatenación de los nombres y apellidos del usuario.
- Desarrolle el método descomponerRun(), el cual debe retornar un número entero correspondiente a todo lo que está en el RUN antes del guion y del dígito verificador.

Nota 1: Considere que Eclipse permite crear rápidamente muchos métodos de manera fácil y rápida.

Nota 2: Recuerde que esta clase, a diferencia de las anteriores desarrolladas, no debe llevar un método main(), ya que desde ella no se ejecutarán acciones.
