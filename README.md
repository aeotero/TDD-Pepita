Pepita TDD

Vamos a hacer un Test Driven Development muy simple para entender fácilmente como se debe de realizar.
Para ello haremos que nuestra hermosa y amada PEPITA haga acciones simples como comer y volar.

Aclaración: para enfocarnos en el tdd se va a entregar clases y código ya armado que no corresponde al desarrollo
del tema. Tampoco nos vamos a enfocar en salvar todos los posibles errores, TODOS VAN A SER CASOS FELICES.

Entre la práctica del tdd está el "semáforo" por el cual comenzamos con el VERDE, verde de que paso los test nuestro
código, después de que realizamos los requerimientos en el código.
Luego, el AMARILLO del refactor, ver que el código que hayamos hecho no tenga ni chanchadas ni 
desprolijidades (dicho en criollo).
Y al final (nuevo principio) agregar más requerimientos a nuestro test que harán que nuestro test vuelva a fallar
(luz ROJA) para volver a continuar desarrollando.

Acuérdensen que en el Intellij con ALT+ENTER (sobre el error) te da diversas opciones para resolver el conflicto.

------------PRIMERA PARTE-----------------------------------------------------------------------
Tenemos a pepita, solo con su estómago vacío, y con ganas de comer y volar.
Pero no sabemos por donde comenzar, entonces vamos por las acciones.
1) Que pepita coma. La accion de comer de pepita le da 10 de energía.
2) Que pepita vuele. la accion de volar le reste 7 de energía.

-------------SEGUNDA PARTE--------------------------------------------------------------
Ahora la vamos a complicar más, vamos a diferenciar las comidas y las distancias que vuela pepita.
3) Que pepita coma(unaComida). Ahora si pepita come Manzana, le aumenta la energía en 10, y si come Uva, en 2.
4) Que pepita vuele(distancia). Ahora cuando vuele pepita, por cada km que vuele, va a gastar 5 de energía.

