import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test


class Day01Test {

    private val sut = Day01()

    @Test
    fun part1() {
        sut.part1(testInput) shouldBe 11
    }

    @Test
    fun part2() {
        sut.part2(testInput) shouldBe 31
    }

    val testInput = listOf(
        "3   4",
        "4   3",
        "2   5",
        "1   3",
        "3   9",
        "3   3"
    )

}