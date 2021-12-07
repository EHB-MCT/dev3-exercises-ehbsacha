fun main(){
    var difficulty = "easy"
    print("Wat is je voorkeur taal? Spaans of zweeds: ")
    var language = readLine()!!
    print("Het aantal van vragen:  ")
    var number = readLine()!!.toInt()
    val duolingo = Duolingo(number, language)
    do{
        print("Wilt u spelen op easy of op hard: ")
        difficulty = readLine().toString()
    } while (difficulty != "easy" && difficulty != "hard")
    if(difficulty == "easy"){
        duolingo.playEasy()
    } else{
        duolingo.playHard()
    }

//    duolingo.play(difficulty)
}