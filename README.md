# Herencia
Ejercicio de Herencia y Polimorfismo

Lo primero y mas importante modificar el archivo de constantes a la ruta del pec que estemos utilizando para escribir
Leer y guardar los datos en un .txt

En un gimnasio se quiere crear un programa para tener los datos de los EMPLEADOS y de los SOCIOS por lo cual se van a desarrollar un conjunto de clases que representen dicho gimnasio, se describen las características básicas de estas clases: 
1.Persona.  Clase abstracta la cual tiene los datos comunes de todos que son   sus datos personales (id, nombre, apellidos, DNI, dirección, teléfono, fecha de alta. 
•Constructores para definir correctamente un empleado y socio, a partir de su nombre, apellidos, DNI,Alta
 
2.Trabajador. Tiene salario tipo double y Tipo que es enum
•Constructores (Se crea automaticamente al iniciar el menu con un metodo)  

3.Socio,implementa un double que es la cuota a pagar (ya predefinida en el codigo de 30) 
•Constructores (debe rellenar la información personal y los datos principales) 
•Leer (debe imprimir los datos que hemos pouesto en el codigo este caso id nombre apellidos y si esta dado de alta).
•Dar de alta un nuevo socio 
•Dar de baja un socio.

Al salir del menu se guardan los datos automaticamente



En momento que se cree un socio nuevo ,se guardara en un frame writer, cuando se de baja o cambie algún dato también se guardara, abra un opción en el menú de leer el frame writer con un frame reader.
Los trabajadores tienen todos las mimas propiedades.
Las excepciones añadidas son las obligadas por el filewriter y en la edad introducir algo que no sea un int


	 			Persona
				   |
			 __________|________
			|		     |
		    Trabajador		   Socio