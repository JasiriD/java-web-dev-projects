package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class BalancedBracketsTest {
    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void wordsInsideBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[swag]"));
    }

    @Test
    public void closeBracketFirstReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    public void closeBracketFirstWithWordsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Man["));
    }
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}