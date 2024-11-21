package car

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class CarRacingGameTest : StringSpec(
    {
        "자동차 경주 게임을 실행하여 최종 결과를 도출한다." {
            val sut = CarRacingGame(
                cars = listOf(
                    Car(name = "car1"),
                    Car(name = "car2"),
                    Car(name = "car3"),
                ),
                totalRound = 2,
                movePossibilities = listOf(
                    MovePossibilities(
                        listOf(
                            canMovePossibilityFixtures(),
                            canNotMovePossibilityFixtures(),
                            canNotMovePossibilityFixtures(),
                        )
                    ),
                    MovePossibilities(
                        listOf(
                            canMovePossibilityFixtures(),
                            canMovePossibilityFixtures(),
                            canNotMovePossibilityFixtures(),
                        )
                    ),
                ),
            )

            val actual = sut.play()

            actual shouldBe CarRacingGameResult(
                listOf(
                    RoundResult(
                        listOf(
                            MovedCar(1),
                            MovedCar(0),
                            MovedCar(0),
                        )
                    ),
                    RoundResult(
                        listOf(
                            MovedCar(2),
                            MovedCar(1),
                            MovedCar(0),
                        )
                    ),
                ),
            )
        }
    }
)