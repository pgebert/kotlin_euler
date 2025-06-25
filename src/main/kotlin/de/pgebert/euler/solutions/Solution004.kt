package de.pgebert.euler.solutions

class Solution004() {
    companion object {
        fun solve(): Int {

            var max = -1

            for (i in 1..900) {
                for (j in i..900) {
                    val n = (1000 - i) * (1000 - j)
                    if (isPalindrome(n) && n > max) {
                        max = n
                    }
                }
            }

            return max
        }

        private fun isPalindrome(n: Int) = n.toString().let { it == it.reversed() }

    }
}
