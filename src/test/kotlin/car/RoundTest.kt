package car

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class RoundTest : StringSpec(
    {
        "자동차 경주 게임의 최종 이동 결과를 도출한다," {
            val sut = Round(
                listOf(
                    Car(name = "car1"),
                    Car(name = "car2"),
                    Car(name = "car3"),
                )
            )

            val actual = sut.start(
                MovePossibilities(
                    listOf(
                        canMovePossibilityFixtures(),
                        canMovePossibilityFixtures(),
                        canNotMovePossibilityFixtures()
                    )
                )
            )

            actual shouldBe RoundResult(
                listOf(
                    MovedCar(1),
                    MovedCar(1),
                    MovedCar(0),
                ),
            )
        }
    }
)