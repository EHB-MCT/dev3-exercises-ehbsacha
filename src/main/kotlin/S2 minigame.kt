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
                rps()
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

fun rps(){
    //The options and the defining of the random number wich chooses the option.
    val options = arrayOf("rock", "paper", "scissors")
    val computer = options.random()

    //The input of the user and the readLine.
    println()
    println("Now guess rock, paper or scissors against the computer.")
    print("Type your answer here: ")
    val rpsOption = readLine()

    println("Computer chose: " + computer)
    println("you chose: " + rpsOption)
    //checking if you won or lost
    when(rpsOption) {
        //If you chose rock it determines if you won!
        "rock" -> if (computer == "rock") {
                println("gelijkgespeeld")
            } else if (computer == "scissors"){
                println("U wint!")
                guess()
            } else if (computer == "paper"){
                println("U verliest!")
            }
        //If you chose paper it determines if you won!
        "paper" -> if (computer == "paper") {
                println("gelijkgespeeld")
            } else if (computer == "rock"){
                println("U wint!")
                guess()
            } else if (computer == "scissors"){
                println("U verliest!")
            }
        //If you chose scissors it determines if you won!
        "scissors" -> if (computer == "scissors") {
                println("gelijkgespeeld")
            } else if (computer == "paper"){
                println("U wint!")
                guess()
            } else if (computer == "rock"){
                println("U verliest!")
            }

            else -> {
                print("You typed something wrong")
            }
    }


}

fun guess(){
    //The text input
    println()
    println("Choose the number between 1 and 100")
    print("Type here ")

    //Read dice player input
    var guess = readLine()
    print("U wint! met ")
    println(guess)

}

fun alive(){
    println("You survived")
    println("FOR NOW!")
}

fun dead(){
    println("You died a horrible death.")
}