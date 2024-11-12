package study

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StringTest {
    @Test
    fun test() {
        val isBlank = "\n".isBlank()

        assertThat(isBlank).isEqualTo(true)
    }
}
