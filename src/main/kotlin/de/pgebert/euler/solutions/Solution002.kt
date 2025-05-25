package de.pgebert.euler.solutions

class Solution002() {
    companion object {
        fun solve(limit: Int): Int {

            var sum = 0

            var a = 1
            var b = 1

            while (a + b < limit) {
                val c = a + b
                if (c % 2 == 0) sum += c

                a = b
                b = c
            }

            return sum
        }
    }
}
