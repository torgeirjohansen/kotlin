import functional.Functional

fun main() {
    val functionalExample = Functional()
    functionalExample.printMap{ m -> println(m)}
    functionalExample.printFlatMap{ m -> println(m)}
}
