package car

class CarRacingGame(
    private val cars: List<Car>
) {
    fun play(
        totalRound: Int,
        movePossibilities: List<MovePossibilities>,
    ): List<List<MovedCar>> =
        (0..< totalRound)
            .map {
                Round(cars).start(movePossibilities[it])
            }
}