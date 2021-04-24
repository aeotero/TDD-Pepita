package ar.edu.unahur.obj2.ejemplo

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class AvesTest : DescribeSpec({
    val pepita = Ave()
    describe("Pepita") {
        it("pepita come") {
            pepita.comer()
            pepita.energia.shouldBe(10)
        }

        it("pepita vuela"){
//          y ahora ,como vuela?
        }

//----------FIN DE PRIMERA PARTE-------------------------------------------------------

        it("pepita come manzana ") {
//          Como come manzana?
        }

        it("pepita come uva ") {
//          Come uva?
        }

        it("pepita vuela 2km"){
//          vuela o es vaga?
        }


    }
})
