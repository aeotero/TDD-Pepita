package ar.edu.unahur.obj2.ejemplo

interface Comida{
    val energia: Int
}

object Manzana :Comida {
    override val energia = 10
}

object Uva : Comida {
    override val energia = 2
}