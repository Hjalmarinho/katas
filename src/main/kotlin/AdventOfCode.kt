fun calculateFuelRequired(mass: Int) =  Math.floorDiv(mass, 3) - 2

fun calculateFuelRequiredForBothMassAndFuel(mass: Int): Int {
    val fuelRequired = calculateFuelRequired(mass)
    return if (calculateFuelRequired(fuelRequired) <= 0)
        fuelRequired
    else
        fuelRequired + calculateFuelRequiredForBothMassAndFuel(fuelRequired)
}