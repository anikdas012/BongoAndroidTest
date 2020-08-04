package anagram

import org.junit.Test

import org.junit.Assert.*

class AnagramKtTest {

    @Test
    fun isAnagram() {
        val isAnagram = isAnagram("table", "bleat")
        assertEquals(true, isAnagram)
        val isAnagram1 = isAnagram("eat", "ter")
        assertFalse(isAnagram1)
    }
}