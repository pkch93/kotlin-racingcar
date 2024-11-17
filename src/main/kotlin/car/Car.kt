package car

class Car(
    private val position: Int = 0,
) {
    fun move(movePossibility: MovePossibility): MovedCar =
        if (movePossibility.move) {
            MovedCar(position + 1)
        } else {
            MovedCar(position)
        }
}

class MovePossibility(
    randomNumber: Int,
) {
    val move: Boolean = randomNumber >= 4
}

data class MovedCar(
    val position: Int,
)
