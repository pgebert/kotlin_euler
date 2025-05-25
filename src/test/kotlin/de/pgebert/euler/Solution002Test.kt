package de.pgebert.euler

import de.pgebert.euler.solutions.Solution002
import de.pgebert.euler.utils.shouldBe
import org.junit.jupiter.api.Test


class Solution002Test {


    @Test
    fun `testing solution 002`() {
        Solution002.solve(4_000_000) shouldBe 4613732
    }

}
