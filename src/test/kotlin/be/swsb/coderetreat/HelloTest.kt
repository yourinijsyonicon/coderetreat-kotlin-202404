package be.swsb.coderetreat

import io.mockk.every
import io.mockk.mockk
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class HelloTest {

    @Test
    fun `greet - should return World`() {
        assertThat(Hello().greet()).isEqualTo("World!")
    }

    @Test
    fun `sayGreeting - without mock should return World`() {
        val helloMock = HelloService()
        assertThat(helloMock.sayGreeting()).isEqualTo("World!")
    }

    @Test
    fun `sayGreeting - with mock should return a mocked greeting`() {
        val helloMock = mockk<HelloService>()
        every { helloMock.sayGreeting() } returns "Snarf!"
        assertThat(helloMock.sayGreeting()).isEqualTo("Snarf!")
    }
}
