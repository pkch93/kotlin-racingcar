package car

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class RoundTest : StringSpec(
    {
        "자동차 경주 게임의 최종 이동 결과를 도출한다," {
            val sut = Round(
                listOf(
                    Car(),
                    Car(),
                    Car(),
                )
            )

            val actual = sut.start(
                listOf(
                    MovePossibility(4),
                    MovePossibility(4),
                    MovePossibility(3),
                )
            )

            actual shouldBe listOf(
                MovedCar(1),
                MovedCar(1),
                MovedCar(0),
            )
        }
    }
)