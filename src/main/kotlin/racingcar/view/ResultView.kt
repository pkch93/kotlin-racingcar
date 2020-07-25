package racingcar.view

import racingcar.domain.Cars
import racingcar.domain.Winners

object ResultView {
    fun printRaceStatus(cars: Cars) {
        println(cars)
    }

    fun printWinners(winners: Winners) {
        println("최종 우승자는 ${winners.joinWinnersName()} 입니다.")
    }
}
