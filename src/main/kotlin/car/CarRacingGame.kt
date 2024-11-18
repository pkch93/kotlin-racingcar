package car

class CarRacingGame(
    private val cars: List<Car>
) {
    fun play(
        totalRound: Int,
        movePossibilities: List<MovePossibilities>,
    ): RacingGameResult =
        (0..< totalRound)
            .map {
                Round(cars).start(movePossibilities[it])
            }
            .let { RacingGameResult(it) }
}

data class RacingGameResult(
    val value: List<RoundResult>,
)