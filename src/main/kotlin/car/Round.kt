package car

class Round(
    private val cars: List<Car>
) {
    fun start(movePossibilities: MovePossibilities): RoundResult =
        cars.mapIndexed { index, car -> car.move(movePossibilities[index]) }
            .let { RoundResult(it) }
}

class MovePossibilities(
    private val movePossibilities: List<MovePossibility>,
) {
    operator fun get(index: Int): MovePossibility = movePossibilities[index]
}

data class RoundResult(
    val value: List<MovedCar>,
)