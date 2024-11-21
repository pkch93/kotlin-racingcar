package car

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class CarTest : StringSpec(
    {
        "자동차를 정상적으로 생성한다." {
            Car(name = "12345")
        }

        "자동차 이름이 5자 초과할 경우 예외를 발생한다." {
            shouldThrow<IllegalArgumentException> { Car(name = "123456") }
        }

        "자동차가 전진한다." {
            val sut = Car(name = "pkch")
            val actual = sut.move(MovePossibility(4))
            actual shouldBe MovedCar(1)
        }

        "자동차가 정지한다." {
            val sut = Car(name = "pkch")
            val actual = sut.move(MovePossibility(3))
            actual shouldBe MovedCar(0)
        }
    }
)