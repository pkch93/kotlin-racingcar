package car

class Round(
    private val cars: List<Car>
) {
    fun start(movePossibilities: MovePossibilities): List<MovedCar> =
        cars.mapIndexed { index, car -> car.move(movePossibilities[index]) }
}

class MovePossibilities(
    private val movePossibilities: List<MovePossibility>,
) {
    operator fun get(index: Int): MovePossibility = movePossibilities[index]
}