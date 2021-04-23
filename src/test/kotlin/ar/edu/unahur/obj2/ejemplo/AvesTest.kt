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

    }
})
