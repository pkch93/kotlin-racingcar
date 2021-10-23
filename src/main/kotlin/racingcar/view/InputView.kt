package racingcar.view

import racingcar.exception.Exception.Companion.CASE_INPUT_DATA_NOT_INT
import racingcar.model.CarName
import racingcar.model.RaceCondition

/**
 * 자동차 경주에서 게임 시작시 사용자가 입력해야하는 질문 모음 class
 * */
class InputView {
    fun inputRaceCondition(): RaceCondition {
        val nameCars = requestNameOfCars()
        val tryCount = requestTryCount()
        return RaceCondition(splitNameOfCars(nameCars), tryCount)
    }

    private fun requestNameOfCars(): String {
        println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)")
        return readLine()!!
    }

    private fun requestTryCount(): Int {
        println("시도할 횟수는 몇 회인가요?")
        return readLine()!!.toIntOrNull() ?: throw IllegalArgumentException(CASE_INPUT_DATA_NOT_INT)
    }

    companion object {
        private const val DELIMITER = ","
        fun splitNameOfCars(names: String): List<CarName> =
            names.split(DELIMITER).map { CarName(it) }
    }
}