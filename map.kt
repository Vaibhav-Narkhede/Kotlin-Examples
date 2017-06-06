// ----- MAPS -----

fun main(args:Array<String>){
    // A modifiable collection that holds key value pairs

    // Create a Map
    val map = mutableMapOf<Int, Any?>()

    // Create a Map and add values
    val map2 = mutableMapOf(1 to "Aryan", 2 to 25)

    //print map
    println("Map2 :"+map2)

    // Add values
    map[1] = "Vaibhav"
    map[2] = 26

    // Get Size
    println("Map Size : ${map.size}")

    // Add a key value
    map.put(3, "Aditya")

    println("Map :"+map)

    // Remove a key and value
    map.remove(2)

    // Iterate and get keys and values
    for((x, y) in map){
        println("Key : $x Value : $y")
    }
}