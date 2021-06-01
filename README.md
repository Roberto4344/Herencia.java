# Herencia
Ejercicio de Herencia y Polimorfismo

En un gimnasio se quiere crear un programa para tener los datos de los EMPLEADOS y de los SOCIOS por lo cual se van a desarrollar un conjunto de clases que representen dicho gimnasio, se describen las características básicas de estas clases: 
1.Persona.  Clase abstracta la cual tiene los datos comunes de todos que son   sus datos personales (id, nombre, apellidos, DNI, dirección, teléfono, fecha de alta. 
•Constructores para definir correctamente un empleado y socio, a partir de su nombre, apellidos, DNI, dirección, teléfono... 
 
2.Trabajador. Tiene despacho, especialidad y antigüedad.
•Constructores (debe rellenar la información personal y los datos principales) •Información (debe imprimir sus datos personales y su puesto en la empresa). 
3.Socio,implementa un float que es la cuota a pagar y fecha de alta.: •Constructores (debe rellenar la información personal y los datos principales) •Imprimir (debe imprimir sus datos personales).
 •Dar de alta un nuevo socio 
•Dar de baja un socio pondrá baja al imprimir sus datos.
 4.premium tiene un trabajador a su cargo
•Constructores (debe rellenar el trabajador ) 
•Cambiar de trabajador. 
•Añadir trabajador

En momento que se cree un socio nuevo ,se guardara en un frame writer, cuando se de baja o cambie algún dato también se guardara, abra un opción en el menú de leer el frame writer con un frame reader.
Los trabajadores tienen todos las mimas propiedades , igual los pongo en un enum ya que solo van a ser 3 tipos .
La excepción que implemente será añadir un socio nuevo a un numero existente ya que aunque un usuario se de baja su número se conserva.
