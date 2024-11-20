package car

class Car(
    private var position: Int = 0,
) {
    fun move(movePossibility: MovePossibility): MovedCar {
        if (movePossibility.move) {
            position += 1
        }
        return MovedCar(position)
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
