package vi

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.MethodSource

class ScratchTest {

    @Test
    fun `passed test`() {
        `Шаг 1`()
        `Шаг 2`()
        `Шаг 3`()
        assertEquals(1, 1);
    }

    private fun `Шаг 1`() {
        println("Шаг 1")
    }

    private fun `Шаг 2`() {
        println("Шаг 2")
    }

    private fun `Шаг 3`() {
        println("Шаг 3")
    }

    @Test
    fun `failed test`() {
        assertEquals(1, 2);
    }

    @ParameterizedTest(name = "{0} + {1} should equal {2}")
    @CsvSource("1,1,2", "2,3,5")
    fun `Works as expected`(arg0: Int, arg1: Int, result: Int) {
        assertEquals(result, arg0 + arg1)
    }

    @ParameterizedTest(name = "{0} + {1} should equal {2}")
    @MethodSource("data")
    fun `Works with data as expected`(arg0: Int, arg1: Int, result: Int) {
        assertEquals(result, arg0 + arg1)
    }

    companion object {
        @JvmStatic
        fun data(): Array<Array<Any>> {
            return arrayOf(
                    arrayOf(1, 1, 2),
                    arrayOf(2, 3, 5)
            )
        }
    }
}