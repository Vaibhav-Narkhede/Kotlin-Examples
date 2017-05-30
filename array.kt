fun main(args:Array<String>){

    // ------- ARRAYS -------
    // You can store multiple types in arrays
    var array = arrayOf(1, 2.33, "Jon")

    // You can access values using indexes starting at 0
    println(array[2])

    // Change the value
    array[1] = 3.14
    println(array[1])

    // Elements in array
    println("Array Length : ${array.size}")

    // Is element in the array
    println("Jon in Array : ${array.contains("Jon")}")

    // Get first 2 elements in array as an array
    var subArray = array.copyOfRange(0,1)

    // Get the first element
    println("First : ${array.first()}")

    // Get the last element
    println("Last : ${array.last()}")

    // Get index of value
    println("Jon Index : ${array.indexOf("Jon")}")

    // Create an array of squares
    var sqArray = Array(5, { x -> x * x})
    println(sqArray[2])

    // There are type specific arrays
    var arr2: Array<Int> = arrayOf(1,2,3)
    println(arr2[2])

}