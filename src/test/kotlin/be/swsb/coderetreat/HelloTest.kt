package be.swsb.coderetreat

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class HelloTest {

    @Test
    fun `greet - should return World`() {
        assertThat(Hello().greet()).isEqualTo("World!")
    }

}
