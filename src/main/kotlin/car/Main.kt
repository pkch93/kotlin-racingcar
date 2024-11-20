package car

import car.view.InputView
import car.view.OutputView

fun main() {
    val carRacingGame = InputView().input()
    val gameResult = carRacingGame.play()
    OutputView().printResult(gameResult)
}