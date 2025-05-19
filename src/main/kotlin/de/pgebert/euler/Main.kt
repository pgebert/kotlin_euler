package de.pgebert.euler

import de.pgebert.euler.solutions.Solution001

const val NOT_IMPLEMENTED = "notImplemented"

object Main {
    private val days = listOf(
        Solution001(),
    )

    @JvmStatic
    fun main(args: Array<String>) {
        if (args.isNotEmpty()) {
            val number = args[0].toInt()
            days.find { it.number == number }?.also { printDay(it) } ?: error("Day $number not found!")
        } else
            days.forEach { printDay(it) }
    }

    private fun printDay(day: Day) {
        val header = "=== Day ${day.number.toString().padStart(2, '0')}: ${day.title} ==="
        val footer = "=".repeat(header.length)

        println(header)
        println("|> Part 1: ${day.partOne()}")
        println("|> Part 2: ${day.partTwo()}")
        println(footer)
    }
}
