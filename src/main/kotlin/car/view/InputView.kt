package car.view

import car.Car
import car.CarRacingGame
import car.MovePossibilities
import car.MovePossibility

class InputView {
    fun input(): CarRacingGame {
        val cars = inputCarAmount()
        val totalRound = inputTotalRound()
        val movePossibilities = makeMovePossibilities(cars.size, totalRound)
        return CarRacingGame(cars, totalRound, movePossibilities)
    }

    private fun inputCarAmount(): List<Car> {
        println("자동차 대수는 몇 대인가요?")
        val maybeCarAmount = readlnOrNull()
        requireNotNull(maybeCarAmount) { "자동차 대수 입력은 필수입니다." }
        return try {
            val carAmount = maybeCarAmount.toInt()
            require(carAmount > 0)
            (1..carAmount).map { Car() }
        } catch (e: NumberFormatException) {
            throw IllegalArgumentException("자동차 대수는 숫자여야 합니다.")
        } catch (e: IllegalArgumentException) {
            throw IllegalArgumentException("자동차 대수는 0보다 커야 합니다.")
        }
    }

    private fun inputTotalRound(): Int {
        println("시도할 회수는 몇 회인가요?")
        val maybeTotalRound = readlnOrNull()
        requireNotNull(maybeTotalRound) { "실행 횟수 입력은 필수입니다." }
        return try {
            val totalRound = maybeTotalRound.toInt()
            require(totalRound > 0)
            totalRound
        } catch (e: NumberFormatException) {
            throw IllegalArgumentException("시도할 회수는 숫자여야 합니다.")
        } catch (e: IllegalArgumentException) {
            throw IllegalArgumentException("시도할 회수는 0보다 커야 합니다.")
        }
    }

    private fun makeMovePossibilities(
        carAmount: Int,
        totalRound: Int,
    ): List<MovePossibilities> =
        (0..<totalRound).map {
            (1..carAmount)
                .map { MovePossibility(generateRandomNumber()) }
                .let { MovePossibilities(it) }
        }

    private fun generateRandomNumber() = (0..10).random()
}