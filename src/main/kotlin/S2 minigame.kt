fun main(){
    roomOne()
}

fun roomOne(){
    println("You wake up in a dark dungeon with a few candles around you.")
    println("A cold stone wall against your back.")
    println("At the wall on your left there's a yellow door, in front of you a red one and to your right a blue one.")
    print("Which door do you choose? ")
    var i = 0;
    var inputOne = readLine()
    do {
        when (inputOne) {
            "yellow" -> {
                i++
                alive()
            }
            "red" -> {
                i++
                dead()
            }
            "blue" -> {
                i++
                dead()
            }
            else -> { //Fallback for wrong input
                println("You typed something wrong.")
                print("What did you mean? ")
                inputOne = readLine()
            }
        }
    } while (i != 1)
}

fun alive(){
    println("You survived")
    println("FOR NOW!")
}

fun dead(){
    println("You died a horrible death.")
    print("The door fell on you")
}