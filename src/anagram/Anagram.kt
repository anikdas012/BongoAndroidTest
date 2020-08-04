package anagram

fun isAnagram(stringOne: String, stringTwo: String): Boolean {
    val stringOne = stringOne.replace(" ", "")
    val stringTwo = stringTwo.replace(" ", "")
    if (stringOne.length != stringTwo.length) {
        return false
    }
    val stringOneArray = stringOne.toLowerCase().toCharArray()
    stringOneArray.sort()
    val stringTwoArray: CharArray = stringTwo.toLowerCase().toCharArray()
    stringTwoArray.sort()
    return stringOneArray.contentEquals(stringTwoArray)
}

fun main() {
    println(isAnagram("eat", "tar"))
    println(isAnagram("eat", "tae"))
    println(isAnagram("eat", "taed"))
    println(isAnagram("table", "bleat"))
}