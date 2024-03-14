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

**Para resolverlo podemos seguir los siguientes pasos:**

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

*************************************************************************************
> Método de Gauss-Jordan

[Ejemplos de Método de Gauss-Jordan](https://github.com/AlanOrgazVillegas/MetodosNumericos_Tema3/tree/main/Gauss-Jordan%20-%205%20Ejemplos) 

El método de Gauss-Jordan utiliza operaciones con matrices para resolver sistemas de ecuaciones de n numero de variables. Para aplicar este método solo hay que recordar que cada operación que se realice se aplicara a toda la fila o a toda la columna en su caso. 

**Para resolverlo podemos seguir los siguientes pasos:**

+ Divide todo el primer renglón entre la componente a11.
+ Convierte todos los demás valores de esa columna en ceros:
+ Al segundo renglón (R2) se le restará el primer renglón multiplicado por la componente a21.
+ Al tercer renglón (R3) se le restará el primer renglón multiplicado por la componente a31.
+ Divide todo el segundo renglón entre la componente a22. 
+ Repite todo el proceso para las demás columnas hasta obtener la forma deseada. 

## _**Ejemplo**_

**Matriz a resolver:**


![Captura-de-Pantalla-2021-11-09-a-las-11 25 27](https://github.com/AlanOrgazVillegas/MetodosNumericos_Tema3/assets/147757830/43e206f0-4d4e-488d-9d6f-22ac13605e63)

# _**Solución**_

Como primer paso dividimos el primer renglón R1 entre la componente a11:


![Captura-de-Pantalla-2021-11-09-a-las-11 26 36](https://github.com/AlanOrgazVillegas/MetodosNumericos_Tema3/assets/147757830/be074ac6-0b84-4bbe-963d-738bf76a0d1d)

Como segundo paso se requiere «convertir» las componentes inferiores de la componente a11 en ceros (0):

![Captura-de-Pantalla-2021-11-09-a-las-11 27 15](https://github.com/AlanOrgazVillegas/MetodosNumericos_Tema3/assets/147757830/b14e1b34-5bd4-4ab6-b116-829ae6b06750)

Al tercer renglón (R3) se le restará el primer renglón multiplicado por la componente a31.

![Captura-de-Pantalla-2021-11-09-a-las-11 27 51](https://github.com/AlanOrgazVillegas/MetodosNumericos_Tema3/assets/147757830/d69f6aab-3df7-4b5f-a4fb-472031118750)

Se procede a dividir el segundo renglón R2 entre la componente a22 :

![Captura-de-Pantalla-2021-11-09-a-las-11 28 25](https://github.com/AlanOrgazVillegas/MetodosNumericos_Tema3/assets/147757830/8e481a1d-5f31-49e0-a404-53ec81c0c358)

Ahora se repite todo el proceso para las demás columnas hasta obtener la forma deseada. 

![Captura-de-Pantalla-2021-11-09-a-las-11 28 59](https://github.com/AlanOrgazVillegas/MetodosNumericos_Tema3/assets/147757830/06198b78-2d3f-4d0d-bbfb-0f6f8abfdefe)

Finalmente, convertimos al sistema convencional de ecuaciones:

![Captura-de-Pantalla-2021-11-09-a-las-11 29 34](https://github.com/AlanOrgazVillegas/MetodosNumericos_Tema3/assets/147757830/c2205259-b7bc-4b33-8387-a5894801bc7f)

***************************************************************************************
 > Método de Gauss-Seidel

[Ejemplos de Método de Gauss-Seidel](https://github.com/AlanOrgazVillegas/MetodosNumericos_Tema3/tree/main/Gauss-Seidel%20-%205%20Ejemplos)

Este método es una versión acelerada de Jácobi. En el cual es necesario contar con un vector aproximado completo para proceder a la sustitución en las ecuaciones de recurrencia y obtener una nueva aproximación. En el método de Gauss-Seidel se propone ir sustituyendo los nuevos valores de la aproximación siguiente conforme se vayan obteniendo sin esperar a tener un vector completo. De esta forma se acelera la convergencia.

**Para resolverlo podemos seguir los siguientes pasos:**

+ Asignar valores iniciales a las incógnitas, pudiendo ser hipotéticos o arbitrarios.
+ Empezar con la primera ecuación y calcular el valor de la incógnita con el coeficiente más grande, usando los valores asignados en el paso 1 para las otras incógnitas.
+ Proceder a la siguiente ecuación y calcular el valor de la incógnita con el coeficiente más grande, usando el valor calculado en el paso anterior y los valores iniciales para las otras incógnitas.
+ Repetir este proceso para las ecuaciones restantes, calculando siempre el valor de la incógnita con el coeficiente más grande en cada ecuación y usando los últimos valores calculados para las otras incógnitas.
+ Continuar iterando hasta que los valores de las incógnitas no cambien significativamente entre iteraciones.

## _**Ejemplo**_

Matriz a resolver
![Captura de pantalla (478)](https://github.com/AlanOrgazVillegas/MetodosNumericos_Tema3/assets/147757830/3122d1d1-7982-432a-8b0d-3ca5d5d92d83)


# _**Solución**_

Primero ordenamos las ecuaciones, de modo que en la diagonal principal esten los coeficientes mayores para asegurar la convergencia.

![Captura de pantalla (479)](https://github.com/AlanOrgazVillegas/MetodosNumericos_Tema3/assets/147757830/0e53cfeb-3d4f-488f-a3f6-320a66384207)

Despejamos cada una de las variables sobre la diagonal:

![seidel6](https://github.com/AlanOrgazVillegas/MetodosNumericos_Tema3/assets/147757830/073b1345-d02d-46d1-9ebb-16753b78b0cf)

Suponemos los valores iniciales X2 = 0 y X3 = 0 y calculamos X1

![seidel7](https://github.com/AlanOrgazVillegas/MetodosNumericos_Tema3/assets/147757830/8f7a74ab-f7e8-4321-9d04-b6383796c68c)

Este valor junto con el de X3 se puede utilizar para obtener X2

![seidel8](https://github.com/AlanOrgazVillegas/MetodosNumericos_Tema3/assets/147757830/06f04fc3-4076-4ac4-807a-35d409f231f1)

La primera iteración se completa sustituyendo los valores de X1 y X2 calculados obteniendo:

![seidel9](https://github.com/AlanOrgazVillegas/MetodosNumericos_Tema3/assets/147757830/d062786a-dbe0-4abe-8e47-9d998160c5a6)

En la segunda iteración, se repite el mismo procedimiento:

![seidel10](https://github.com/AlanOrgazVillegas/MetodosNumericos_Tema3/assets/147757830/285ace0b-8c11-4840-bac5-480f343b7e1a)

Comparando los valores calculados entre la primera y la segunda iteración

![seidel11](https://github.com/AlanOrgazVillegas/MetodosNumericos_Tema3/assets/147757830/11493da9-a76c-4cbb-9231-d500b98c7d4b)

Como podemos observar, no se cumple la condición

![seidel12](https://github.com/AlanOrgazVillegas/MetodosNumericos_Tema3/assets/147757830/5d381ed5-74de-480b-971d-79fee0b94cd9)

Entonces tomamos los valores calculados en la última iteración y se toman como supuestos para la siguiente iteración. Se repite entonces el proceso:

![seidel13](https://github.com/AlanOrgazVillegas/MetodosNumericos_Tema3/assets/147757830/4cd9d686-c0d9-4cb2-9109-750f01ebf3bd)

Comparando los valores obtenidos

![seidel22](https://github.com/AlanOrgazVillegas/MetodosNumericos_Tema3/assets/147757830/09d24323-5a12-4185-969d-eba34833a9ca)

Dado que se cumple la condición, el resultado es:

X1 = 3.0

X2 = -2.5

X3 = 7.0

**********************************************************************************






