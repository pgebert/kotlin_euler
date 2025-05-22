package de.pgebert.euler.solutions

class Solution001() {
    companion object {
        fun solve(limit: Int) = buildSet {
            listOf(3, 5).forEach { number ->
                (1..(limit - 1) / number).forEach { add(it * number) }
            }
        }.sum()
    }
}
