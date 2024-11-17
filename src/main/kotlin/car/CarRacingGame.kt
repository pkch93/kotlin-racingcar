package car

class CarRacingGame(
    private val cars: List<Car>
) {
    fun start(randomNumbers: List<Int>): List<MovedCar> =
        cars.mapIndexed { index, car -> car.move(randomNumbers[index]) }
}