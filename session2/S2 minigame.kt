var i = 0;

fun main(){

    roomOne()
}

fun roomOne(){
    println("You wake up in a dark dungeon with a few candles around you.")
    println("A cold stone wall against your back.")
    println("At the wall on your left there's a yellow door, in front of you a red one and to your right a blue one.")
    print("Which door do you choose? ")

    var inputOne = readLine()
    do {
        when (inputOne) {
            "yellow" -> {
                i++
                alive()
                roomTwo()
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

fun roomTwo(){
    println("The second room is better lit.")
    println("A Black cat on the other side stares you in the eyes!")
    println("There are even more doors but with numbers written on them. 1 to 5")
    print("Which number door do you choose? (As a number like '1' or '2'): ")

    var inputTwo = readLine()!!.toInt()
    val randomNumber = (1..5).random()
    if(inputTwo == randomNumber){
        i++
        alive()
    } else if(inputTwo == 1 || inputTwo == 2 || inputTwo == 3 || inputTwo == 4 || inputTwo == 5 && inputTwo != randomNumber){
        i++
        dead()
    }
}

fun alive(){
    println("You survived")
    println("FOR NOW!")
}

fun dead(){
    println("You died a horrible death.")
    when (i){
        1 -> println("The door fell on you")
        2 -> println("The door was locked and the cat ate you!")
    }
}