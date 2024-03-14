# Métodos Numéricos Tema3

### Saludos
Presento mi problemario del tema 3 de la asignatura de Métodos Numéricos.

## Sobre la materia

> Competencia de la Asignatura

Aplica los métodos numéricos para resolver problemas científicos y de ingeniería utilizando la computadora.

> Competencia del TEMA

Aplica los métodos numéricos con el objeto de solucionar ecuaciones mediante los métodos de intervalo e interpolación apoyada de un lenguaje de programación.


### INTRODUCCIÓN A CADA MÉTODO

> Eliminación Gaussiana

[Ejemplos de Eliminación Gaussiana](https://github.com/AlanOrgazVillegas/MetodosNumericos_Tema3/tree/main/Eliminacion%20Gaussiana%20-%205%20ejemplos)

El método de eliminación Gauss-Jordan consiste en representar el sistema de ecuaciones por medio de una matriz y obtener a partir de ella lo que se define como la matriz escalonada equivalente, a través de la cual se determina el tipo de solución de la ecuación.

**Para resolver un sistema de ecuaciones podemos seguir los siguientes pasos:**

+ Escriba la matriz aumentada del sistema de ecuaciones lineales.
+ Use operaciones elementales de fila para llevar la matriz aumentada a una forma escalonada.
+ Mediante sustitución regresiva, resuelva el sistema equivalente correspondiente a la matriz aumentada escalonada.

## _**Ejemplo**_

![Captura de pantalla (471)](https://github.com/AlanOrgazVillegas/MetodosNumericos_Tema3/assets/147757830/50c62dc5-562a-47c1-aac9-05b7a164fff1)

# _**Solución**_

La matriz a resolver:

![Captura de pantalla (472)](https://github.com/AlanOrgazVillegas/MetodosNumericos_Tema3/assets/147757830/7ca341ee-6c64-4bbf-8364-18e7a34b5939)

![Captura de pantalla (473)](https://github.com/AlanOrgazVillegas/MetodosNumericos_Tema3/assets/147757830/8b5df265-0d50-43dc-b4bc-7a1b2fffc6be)

De la tercera fila se obtiene 2z=2, es decir, z=1. De la segunda fila obtenemos y=-1. Finalmente de la primera fila se obtiene x+2y+z=0, es deci, x=1.

Concluimos que la solución del sistema de ecuaciones es:

**x=1
y=−1
z=1**






