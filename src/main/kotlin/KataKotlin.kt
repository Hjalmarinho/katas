
// Since we are defining our method outside of a class, it represents a package-level function:
// For now, Kotlin only supports references to top-level and local functions and members of classes, not individual instances.
fun sumPositives(ints: IntArray): Int {
    return ints.filter { int -> 0 < int  }.sum()
}