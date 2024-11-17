package car

import io.kotest.core.spec.style.StringSpec

class CarTest : StringSpec(
    {
        "자동차가 전진한다." {
            val sut = Car()
            sut.move(4)
        }

        "자동차가 정지한다." {
            val sut = Car()
            sut.move(3)
        }
    }
)