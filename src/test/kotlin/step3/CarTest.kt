package step3

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import step3.domain.Car
import step3.domain.ManualCarMover

internal class CarTest {

    @Test
    fun `자동차를 움직이면 위치가 1씩 증가한다`() {
        //given
        val car = Car(ManualCarMover())
        val position = car.position

        //when
        car.move()

        //then
        assertThat(car.position).isEqualTo(position + 1)
    }

    @ParameterizedTest
    @ValueSource(strings = ["pobi","crong","honux"])
    fun `자동차 객체에 이름을 부여할 수 있다`(name: String) {
        val car = Car(ManualCarMover(), name)
        assertThat(car.name).isEqualTo(name)
    }
}