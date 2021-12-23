fun main(){
    var difficulty = "easy"
    print("Wat is je voorkeur taal? Spaans of zweeds: ")
    var language = readLine()!!
    if(language != "zweeds" && language != "spaans"){
        throw Exception("Please choose a correct language!")
    }
    print("Het aantal van vragen:  ")
    var number = readLine()!!.toInt()
    if(number > 10 || number < 0){
        throw Exception("Please type a number between 0 or 10!")
    }
    val duolingo = Duolingo(number, language)
//    do{
    print("Wilt u spelen op easy of op hard: ")
    difficulty = readLine().toString()
//    } while (difficulty != "easy" && difficulty != "hard")
    if(difficulty == "easy"){
        duolingo.playEasy()
    }
    if(difficulty == "hard"){
        duolingo.playHard()
    }
    if(difficulty != "easy" && difficulty != "hard"){
        throw Exception("Please choose 'easy' or 'hard' not your gibberish, it is not that hard to type right!")
    }

//    duolingo.play(difficulty)
}