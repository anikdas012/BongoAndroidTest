package anagram

fun isAnagram(stringOne: String, stringTwo: String): Boolean {
    val stringOne = stringOne.replace(" ", "")
    val stringTwo = stringTwo.replace(" ", "")
    if (stringOne.length != stringTwo.length) {
        return false
    }
}