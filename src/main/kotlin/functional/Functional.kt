package functional

class Functional {
    val list1  = listOf(1, 2, 3)
    val list2  = listOf('a', 'b', 'c')

    fun printMap(fn: (String) -> Unit) {
        val map1 = list1.map {
                el1 -> list2.map { el2 -> "$el1$el2"}
        }

        fn("Printing map")
        fn(map1.toString())
    }

    fun printFlatMap(fn: (String) -> Unit) {
        val map1 = list1.flatMap {
                el1 -> list2.map { el2 -> "$el1$el2"}
        }

        fn("Printing flatMap")
        fn(map1.toString())
    }
}