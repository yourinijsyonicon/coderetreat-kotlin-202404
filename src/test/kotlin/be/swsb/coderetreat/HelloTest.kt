package be.swsb.coderetreat

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class HelloTest {

    @Test
    fun `greet - should return Hello World`() {
        val actual = Hello().greet()

        assertThat(actual).isEqualTo("Hello, World!")
    }

    @Test
    fun `greet - given a person to greet, should return a greeting to this person`() {
        val actual = Hello(name = "Admiral Adama").greet()

        assertThat(actual).isEqualTo("Hello, Admiral Adama!")
    }
}

