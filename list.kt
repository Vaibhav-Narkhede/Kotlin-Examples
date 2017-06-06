// ----- LISTS -----

fun main(args: Array<String>) {
// There are immutable Lists and mutable MutableLists

// Create a mutable list
    var list1: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

// Create an immutable list
    val list2: List<Int> = listOf(1, 2, 3)

// Add an item
    list1.add(6)

// Get first item
    println("1st : ${list1.first()}")

// Get last
    println("Last : ${list1.last()}")

// Get value at index
    println("2nd : ${list1[2]}")

// Get a list starting from index to another
    var list3 = list1.subList(0, 3)

// Size of List
    println("List1 Length : ${list1.size}")

// Clear a Mutable list
// list3.clear()

// Remove a value
    list1.remove(1)

// Remove at index
    list1.removeAt(1)

// Add value at index
    list1[2] = 10

    //print list1
    println("List1 : ${list1}")

}

