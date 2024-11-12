package study

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun `이름 붙인 인자`() {
        val person1 = Person("jae", 12, "kkk")
        val person3 = Person(name = "jae", age = 12, nickname = null)

        println(person1)
        println(person3)

        assertThat(person1.name).isEqualTo("jae")
        assertThat(person1.age).isEqualTo(12)
        assertThat(person1.nickname).isEqualTo("kkk")

        assertThat(person3.name).isEqualTo("jae")
        assertThat(person3.age).isEqualTo(12)
        assertThat(person3.nickname).isNull()
    }

    @Test
    fun `기본 인자`() {
        val person = Person("jae", 20)

        assertThat(person.name).isEqualTo("jae")
        assertThat(person.age).isEqualTo(20)
        assertThat(person.nickname).isEqualTo("jae")
    }

    @Test
    fun `데이터 클래스`() { // 불변
        val person1 = Person("jae", 20)
        val person2 = Person("jae", 20)

        println(person1)

        assertThat(person1).isEqualTo(person2)
    }
}
