package racingcar

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldBe
import racingcar.domain.Car
import racingcar.domain.RacingGameResult

class RacingGameResultTest : ShouldSpec({
    context("자동차 경주 우승자는") {
        should("가장 많이 이동한 자동차다") {
            val cars = listOf(
                Car(location = 0, name = "pobi"),
                Car(location = 3, name = "crong"),
                Car(location = 4, name = "honux")
            )
            val winner = RacingGameResult(cars).getWinners().first()
            winner.location shouldBe 4
        }

        should("여러 명일 수 있다") {
            val cars = listOf(
                Car(location = 0, name = "pobi"),
                Car(location = 4, name = "crong"),
                Car(location = 4, name = "honux")
            )
            val winners = RacingGameResult(cars).getWinners()
            winners.size shouldBe 2
        }
    }
})