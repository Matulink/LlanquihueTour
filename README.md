# Evaluación Sumativa 1 – Desarrollo Orientado a Objetos I 

## Autor del proyecto 
- **Nombre completo:** [Fernando Maturana Arquero] 
- **Carrera:** Analista Programador Computacional 
- **Sede:** [Online] 

## Descripción general del sistema 
Este proyecto corresponde a la Evaluación Sumativa 1 de la asignatura *Desarrollo Orientado a Objetos I*. Se trata de un sistema orientado a objetos desarrollado en Java para la agencia de turismo **Llanquihue Tour**. El objetivo es modelar y gestionar las entidades clave de su ecosistema (clientes, empleados y proveedores), aplicando los principios de encapsulamiento, composición, herencia y manejo de excepciones. El proyecto fue desarrollado a partir del caso contextualizado de la agencia, abordando la problemática de la información duplicada y desorganizada, proponiendo una solución estructurada, modular y reutilizable.

## Estructura general del proyecto 
```plaintext
src/ 
├── app/          # Clase principal con el método main (Main.java)
├── model/        # Clases de dominio (Persona, Cliente, Empleado, Proveedor, Rut, Direccion)
└── util/         # Utilidades y validaciones (RutInvalidoException)
