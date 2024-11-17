package car

class Round(
    private val cars: List<Car>
) {
    fun start(movePossibilities: List<MovePossibility>): List<MovedCar> =
        cars.mapIndexed { index, car -> car.move(movePossibilities[index]) }
}