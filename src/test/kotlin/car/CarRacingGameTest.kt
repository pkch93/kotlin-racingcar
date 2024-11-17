package car

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class CarRacingGameTest : StringSpec(
    {
        "자동차 경주 게임의 최종 이동 결과를 도출한다," {
            val sut = CarRacingGame(
                listOf(
                    Car(),
                    Car(),
                    Car(),
                )
            )

            val actual = sut.start(listOf(4, 4, 3))

            actual shouldBe listOf(
                MovedCar(1),
                MovedCar(1),
                MovedCar(0),
            )
        }
    }
)