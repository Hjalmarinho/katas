    // Since we are defining our method outside of a class, it represents a package-level function
    fun sumPositives(ints: IntArray): Int = ints.filter { it > 0 }.sum() // All types are objects

    fun reverseLetters(letters: String): String = letters.filter{it.isLetter()}.reversed()

    fun numberToString(number: Int): String = number.toString()