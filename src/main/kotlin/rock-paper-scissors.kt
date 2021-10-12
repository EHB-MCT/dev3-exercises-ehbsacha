fun main(){
    //The options and the defining of the random number wich chooses the option.
    val options = arrayOf("rock", "paper", "scissors")
    val computer = options.random()

    //The input of the user and the readLine.
    print("Type your answer here: ")
    val enteredString = readLine()

    //checking if you won or lost
    when (enteredString) {
        //If you chose rock it determines if you won!
        "rock" -> if (computer == "rock") {
            println("gelijkgespeeld")
        } else if (computer == "scissors"){
            println("U wint!")
        } else if (computer == "paper"){
            println("U verliest!")
        }
        //If you chose paper it determines if you won!
        "paper" -> if (computer == "paper") {
            println("gelijkgespeeld")
        } else if (computer == "rock"){
            println("U wint!")
        } else if (computer == "scissors"){
            println("U verliest!")
        }
        //If you chose scissors it determines if you won!
        "scissors" -> if (computer == "scissors") {
            println("gelijkgespeeld")
        } else if (computer == "paper"){
            println("U wint!")
        } else if (computer == "rock"){
            println("U verliest!")
        }

        else -> {
            print("You typed something wrong")
        }
    }

    println("Computer chose: " + computer)
    println("you chose: " + computer)

}