import kotlin.math.sqrt

// Since we are defining our method outside of a class, it represents a package-level function
var sumPositives = {ints:IntArray -> ints.filter { it > 0 }.sum()} // All types are objects

fun reverseLetters(letters:String) =  letters.filter{it.isLetter()}.reversed()

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

var evenOrOdd = {number:Int -> if (number % 2 == 0) "Even" else "Odd"}

fun areAllNumbersSmallEnough(numbers: IntArray, limit: Int) = numbers.all { it <= limit }

fun removeSpaces(string: String) = string.replace(" ", "")

fun countRedBeads(blueBeads: Int) = if (blueBeads < 2) 0 else (blueBeads - 1) * 2

fun findSmallestInt(numbers: List<Int>) = numbers.min() ?: 0 // The Elvis operator ?:

fun findMiddleCharacter(string: String): String {
    val lenth = string.length
    var start = if (lenth % 2 == 0) lenth / 2 - 1 else lenth / 2
    return string.substring(start, lenth / 2 + 1)
}

fun predictAge(vararg ages: Int): Int {
    return (sqrt(ages.map { it * it }.sum().toDouble()) / 2).toInt()
}
