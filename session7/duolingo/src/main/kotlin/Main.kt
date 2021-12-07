fun main(){
    print("Wat is je voorkeur taal? Spaans of zweeds: ")
    var language = readLine()!!
    print("Het aantal van vragen:  ")
    var number = readLine()!!.toInt()
    val duolingo = Duolingo(number, language)
    duolingo.play()
}