Pepita TDD

Vamos a hacer un Test Driven Development muy simple para entender fácilmente como se debe de realizar.
Para ello haremos que nuestra hermosa y amada PEPITA haga acciones simples como comer y volar.

Aclaracion: para enfocarnos en el tdd se va a entregar clases y codigo ya armado que no corresponde al desarrollo
del tema. Tampoco nos vamos a enfocar en salvar todos los posibles errores, TODOS VAN A SER CASOS FELICES.

Entre la practica del tdd esta el "semaforo" por el cual comenzamos con el Verde, verde de que paso los test nuesto
codigo, despues de que realizamos los requerimientos en el codigo.
Luego, el AMARILLO del refactor, ver el codigo que hayamos hecho chanchadas ni desprolijidades (dicho en criollo).
Y al final (nuevo principio) agregar mas requerimientos a nuestro test que harán que nuestro test vuelva a fallar
(luz ROJA) para volver a continuar desarrollando.

Acuérdensen que en el Intellij con ALT+ENTER (sobre el error) te da diversas opciones para resolver el conflicto.

------------PRIMERA PARTE-----------------------------------------------------------------------
Tenemos a pepita, solo con su estómago vacation, y con ganas de comer y volar.
Pero no sabemos por donde comenzar, entonces vamos por las acciones.
1) que la accion de comer de pepita le de 10 de energía
2) que la accion de volar le reste 7 de energía

-------------SEGUNDA PARTE--------------------------------------------------------------
Ahora la vamos a complicar mas, vamos a diferenciar las comidas y las distancias que vuela pepita que se le ingresan 
con un entero como parametro del metodo volar.
3) ahora si pepita come manzana, le aumenta la energia en 10, y si come uva, en 2.
4) ahora cuando vuele pepita, por cada km que vuele, va a gastar 5 de energia.

