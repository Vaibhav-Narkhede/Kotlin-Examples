fun main(args:Array<String>){
println("---try catch example---")
    try {
        var n2:Int= 0
        var Div=100/n2
        println("DIV:$Div")
    }catch (ex:Exception){
        println("Exception :"+ex.message)
    }
    println("app is done")
}