## Ejercicio grupal 13

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

Se pide crear un proyecto Java llamado EmpresaClase13, el cual debe tener tres clases
correspondientes a las entidades antes mencionadas. Recuerde que cada clase debe llevar:

- Atributos
- Método toString()
- Un constructor que no reciba parámetros
- Un constructor que reciba todos los atributos de la clase como parámetros
  Por último, debe crear una clase adicional que contenga un método main(), a través del cual se cree
  una instancia de cada clase, y se desplieguen sus datos a través del método toString().
