package car

import io.kotest.core.spec.style.StringSpec
import org.assertj.core.api.Assertions.assertThat

class CarTest : StringSpec(
    {
        "자동차가 전진한다." {
            val sut = Car()
            val actual = sut.move(4)
            assertThat(actual).isTrue()
        }

        "자동차가 정지한다." {
            val sut = Car()
            val actual = sut.move(3)
            assertThat(actual).isFalse()
        }
    }
)