package car

class Car(
    private var position: Int = 0,
    name: String,
) {
    private val name: String

    init {
        require(name.length <= 5) { "자동차 이름은 5자를 초과할 수 없습니다." }
        this.name = name
    }

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
