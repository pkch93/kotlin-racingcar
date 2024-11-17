package car

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class CarRacingGameTest : StringSpec(
    {
        "자동차 경주 게임을 실행하여 최종 결과를 도출한다." {
            val sut = CarRacingGame(
                listOf(
                    Car(),
                    Car(),
                    Car(),
                )
            )

            val actual = sut.play(
                totalRound = 2,
                movePossibilities = listOf(
                    MovePossibilities(
                        listOf(
                            MovePossibility(4),
                            MovePossibility(3),
                            MovePossibility(3),
                        )
                    ),
                    MovePossibilities(
                        listOf(
                            MovePossibility(4),
                            MovePossibility(4),
                            MovePossibility(3),
                        )
                    ),
                )
            )

            actual shouldBe listOf(
                listOf(
                    MovedCar(1),
                    MovedCar(0),
                    MovedCar(0),
                ),
                listOf(
                    MovedCar(2),
                    MovedCar(1),
                    MovedCar(0),
                )
            )
        }
    }
)