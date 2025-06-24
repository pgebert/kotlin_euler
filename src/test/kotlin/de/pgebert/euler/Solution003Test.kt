package de.pgebert.euler

import de.pgebert.euler.solutions.Solution003
import de.pgebert.euler.utils.shouldBe
import org.junit.jupiter.api.Test


class Solution003Test {


    @Test
    fun `testing solution 003`() {
        Solution003.solve(600_851_475_143) shouldBe 6857
    }

}
