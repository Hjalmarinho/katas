// Since we are defining our method outside of a class, it represents a package-level function
    var sumPositives = {ints:IntArray -> ints.filter { it > 0 }.sum()} // All types are objects

    var reverseLetters = {letters:String -> letters.filter{it.isLetter()}.reversed()}

    var numberToString = Int::toString

    fun howManyBottles(bottleStreetPrice: Int, percentageDiscount: Int, holidayPrice: Int): Int {
        return holidayPrice * 100 / (bottleStreetPrice * percentageDiscount)
    }