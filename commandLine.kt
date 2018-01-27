fun main(args: Array<String>) {
     if (args.size == 0) {
        println("Please provide a name as a command-line argument")
        return
    }
    //println("Hello, ${args[0]}!")
    
    for (name in args)
        println("Hello, $name!")
}

//Pass arguments through commandline - guest1 guest2 guest3
