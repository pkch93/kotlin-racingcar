package car

class Car(
    private val position: Int = 0,
) {
    fun move(randomNumber: Int): MovedCar =
        if (randomNumber >= 4) {
            MovedCar(position + 1)
        } else {
            MovedCar(position)
        }
}