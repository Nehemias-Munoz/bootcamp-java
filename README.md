## Ejercicio 14 grupal

Observación: este ejercicio es la continuación del ejercicio individual del día anterior
Una empresa de asesorías en prevención de riesgos necesita contar con un sistema de información
que le permita administrar los principales procesos que se llevan a cabo en ella día a día.
Hasta el momento se han definido algunas entidades que darán vida al sistema. Estas son:
Cliente:

- RUT: corresponde a un número menor a 99.999.999
- Nombres
- Apellidos
- Teléfono
- AFP
- Sistema de salud: 1 (Fonasa) o 2 (Isapre)
- Dirección
- Comuna
- Edad
  Usuario:
- Nombre
- Fecha de nacimiento
- RUN
  Capacitacion
- Identificador: número interno de la capacitación manejado por la empresa
- RUT cliente
- Día
- Hora
- Lugar
- Duración
- Cantidad de asistentes

Se pide crear un proyecto Java llamado EmpresaClase14, el cual debe tener tres clases
correspondientes a las entidades antes mencionadas. Recuerde que cada clase debe llevar:

- Atributos
- Método toString()
- Un constructor que no reciba parámetros
- Un constructor que reciba todos los atributos de la clase como parámetros
- Métodos mutadores
- Métodos accesores
  Además, se pide que en cada clase existan los métodos siguientes:
  Cliente
- obtenerNombre(): retorna un String con el nombre completo del cliente (nombres +
  apellidos)
- obtenerSistemaSalud(): de acuerdo al valor registrado en el objeto, despliega el tipo de
  sistema de salud
  Usuario
- mostrarEdad(): retorna un mensaje que diga “El usuario tiene X años”, en donde X es la
  edad del usuario en cuestión
  Capacitación
- mostrarDetalle(): retorna un mensaje con el texto “La capacitación será en A a las B del día
  C, y durará D minutos”, en donde A es el lugar, B es la hora, C es el día y D son los minutos.
  Por último, debe crear una clase adicional que contenga un método main(), a través del cual se haga
  lo siguiente:
- Cree dos instancias de cada clase, usando los dos constructores y mutadores existentes
- Debe desplegar los datos de los objetos a través del método toString().
- Modifique un atributo a elección de cada clase
- Despliegue los datos de cada objeto, esta vez usando métodos accesores. Procure asimismo
  desplegar el resultado de los métodos recién creados.