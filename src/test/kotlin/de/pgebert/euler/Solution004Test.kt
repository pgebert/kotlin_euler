package de.pgebert.euler

import de.pgebert.euler.solutions.Solution004
import de.pgebert.euler.utils.shouldBe
import org.junit.jupiter.api.Test


class Solution004Test {


    @Test
    fun `testing solution 004`() {
        Solution004.solve() shouldBe 906609
    }

}
