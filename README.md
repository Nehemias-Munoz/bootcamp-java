# Instrucciones Ejercicio grupal 14

Una empresa de asesorías en prevención de riesgos necesita contar con un sistema de información
que le permita administrar los principales procesos que se llevan a cabo en ella día a día.
Como parte de las entidades que conforman el proyecto, se establecieron la clase Usuario, la que
contiene los datos de quienes tienen acceso a la plataforma. Existen tres tipos de usuario: Cliente,
Profesional y Administrativo. La primera de ellas ya fue establecida, mientras que los datos
necesarios para las otras clases son:
Profesional:

- Título
- Fecha de ingreso
  Administrativo
- Área
- Experiencia previa
  Como parte de este ejercicio se solicita:
- Las clases Profesional, Administrativo y Cliente deben extender desde la
  clase Usuario.
- Crear la interface Asesoria, la cual debe tener definido el método
  analizarUsuario().
- La clase Usuario debe implementar la interface anterior.
- En la clase padre, el método analizarUsuario()mostrar el nombre de usuario.
- En las clases hijas, el método analizarUsuario() debe desplegar la información
  del método correspondiente al padre, y los datos expuestos en las clases hijas.
- Cree la clase Listado, la que debe tener declarada una lista objetos de la clase
  Usuario, representada a través de la interface Asesoria.
- En la clase Listado debe tener dos métodos: uno para agregar un elemento al listado,
  y otro que permita llamar al método analizarUsuario() de todas las instancias
  registradas en el listado.

- Finalmente, cree una clase con un método main(). En ella se debe crear una instancia
  de la clase Listado, y cinco instancias de diferentes tipos de usuarios. Se deben
  agregar las instancias al