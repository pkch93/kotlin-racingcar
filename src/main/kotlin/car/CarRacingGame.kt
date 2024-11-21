package car

class CarRacingGame(
    private val cars: List<Car>,
    private val totalRound: Int,
    private val movePossibilities: List<MovePossibilities>,
) {
    fun play(): CarRacingGameResult =
        (0..< totalRound)
            .map {
                Round(cars).start(movePossibilities[it])
            }
            .let { CarRacingGameResult(it) }
}

data class CarRacingGameResult(
    val value: List<RoundResult>,
) {
    val winners: List<String> = listOf()
}
