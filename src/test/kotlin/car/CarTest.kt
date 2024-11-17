package car

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class CarTest : StringSpec(
    {
        "자동차가 전진한다." {
            val sut = Car()
            val actual = sut.move(MovePossibility(4))
            actual shouldBe MovedCar(1)
        }

        "자동차가 정지한다." {
            val sut = Car()
            val actual = sut.move(MovePossibility(3))
            actual shouldBe MovedCar(0)
        }
    }
)