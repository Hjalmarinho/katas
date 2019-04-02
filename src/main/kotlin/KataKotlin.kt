// Since we are defining our method outside of a class, it represents a package-level function
    var sumPositives = {ints:IntArray -> ints.filter { it > 0 }.sum()} // All types are objects

    var reverseLetters = {letters:String -> letters.filter{it.isLetter()}.reversed()}

    var numberToString = Int::toString

    fun howManyBottles(bottleStreetPrice: Int, percentageDiscount: Int, holidayPrice: Int): Int {
        return holidayPrice * 100 / (bottleStreetPrice * percentageDiscount)
    }

fun calculateHumanCatAndDogYears(humanYears: Int): IntArray =
    when (humanYears) {
        0 -> intArrayOf(0, 0, 0)
        1 -> intArrayOf(1, 15, 15)
        2 -> intArrayOf(2, 24, 24)
        else -> intArrayOf(humanYears, 24 + (humanYears - 2) * 4, 24 + (humanYears - 2) * 5)
    }
