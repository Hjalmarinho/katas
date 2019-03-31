    // Since we are defining our method outside of a class, it represents a package-level function
    fun sumPositives(ints: IntArray): Int {
        // All types are objects
        return ints.filter { it > 0 }.sum()
    }

    fun reverseLetters(letters: String): String {
        return letters.filter{it.isLetter()}.reversed()
    }