package de.pgebert.euler

import de.pgebert.euler.solutions.Solution001
import de.pgebert.euler.utils.shouldBe
import org.junit.jupiter.api.Test


class Solution001Test {


    @Test
    fun `testing solution 001`() {
        Solution001.solve(1000) shouldBe 233168
    }

}
