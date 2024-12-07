import kotlin.math.abs
import kotlin.system.measureTimeMillis

class Day01 {

    fun part1(input: List<String>): Int {
        val splitList = input.map { it.split("   ") }
        val firstList = splitList.map { it[0].toInt() }.sorted()
        val secondList = splitList.map { it[1].toInt() }.sorted()
        var sum = 0
        firstList.forEachIndexed { index, first ->
            sum += abs(secondList[index] - first)
        }
        return sum
    }

    fun part2(input: List<String>): Int {
        val splitList = input.map { it.split("   ") }
        val firstList = splitList.map { it[0].toInt() }
        val secondList = splitList.map { it[1].toInt() }
        var sum = 0
        firstList.forEach { firstNumber ->
            sum += firstNumber * secondList.count { firstNumber == it }
        }

        return sum
    }


}

fun main() {
    val input = readInput("Day01")
    println("duration (ms): " + measureTimeMillis { println("part 1: " + Day01().part1(input)) })
    println("duration (ms): " + measureTimeMillis { println("part 2: " + Day01().part2(input)) })
}