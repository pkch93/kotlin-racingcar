package car.view

import car.CarRacingGameResult
import car.MovedCar
import car.RoundResult

class OutputView {
    fun printResult(result: CarRacingGameResult) {
        println("실행 결과")
        result.value.forEach { printRoundResult(it) }
    }

    private fun printRoundResult(roundResult: RoundResult) {
        roundResult.value.forEach { movedCarPosition(it) }
        println()
    }

    private fun movedCarPosition(movedCar: MovedCar) {
        val positionMark = (1..movedCar.position)
            .joinToString("") { "-" }
        println(positionMark)
    }
}