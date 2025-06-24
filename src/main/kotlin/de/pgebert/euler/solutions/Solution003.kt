package de.pgebert.euler.solutions

class Solution003() {
    companion object {
        fun solve(n: Long): Int {

            if (n <= 2) return -1

            val prime = (2..n).map { true }.toMutableList()


            var i = 2
            while (i * i < n) {
                if (prime[i]) {
                    var j = i
                    while (j * i < n) {
                        prime[j * i] = false
                        j++
                    }
                }
                i++
            }

            return prime.indexOfLast { it }
        }
    }
}
