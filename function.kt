fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun greet(){
  println("Hello...")
}

fun main(args: Array<String>) {
    greet()
    println("Max Number is : ${max(10, 20)}")
}
