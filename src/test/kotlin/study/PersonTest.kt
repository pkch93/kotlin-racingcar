package study

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun `이름 붙인 인자`() {
        val actual = Person(name = "김성민", age = 29, nickname = "성민")
        assertThat(actual.name).isEqualTo("김성민")
        assertThat(actual.nickname).isEqualTo("성민")
        assertThat(actual.age).isEqualTo(29)
    }

    @Test
    fun `널 타입`() {
        val actual = Person(name = "김성민", age = 29, nickname = null)
        assertThat(actual.nickname).isNull()
    }

    @Test
    fun `기본 인자`() {
        val actual = Person(name = "김성민", age = 29)
        assertThat(actual.nickname).isEqualTo("김성민")
    }

    @Test
    fun `데이터 클래스`() {
        val actual1 = Person(name = "김성민", age = 29)
        val actual2 = Person(name = "김성민", age = 29)
        assertThat(actual1).isEqualTo(actual2)
    }
}
