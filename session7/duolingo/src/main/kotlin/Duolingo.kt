class Duolingo(
){
    val words = mutableListOf<Word>(
        Word("Niño","jongen","spaans"),
        Word("Niña","meisje","spaans"),
        Word("boleto","ticket","spaans"),
        Word("manzanas","appels","spaans"),
        Word("maleta","koffer","spaans"),
        Word("aeropuerto","luchthaven","spaans"),
        Word("pan","brood","spaans"),
        Word("cerrado","gesloten","spaans"),
        Word("gato","kat","spaans"),
        Word("perro","hond","spaans"),

        Word("bil","auto","zweeds"),
        Word("Vän","vriend","zweeds"),
        Word("Bra","goed","zweeds"),
        Word("Tystnad","stilte","zweeds"),
        Word("Duktig","getalenteerd","zweeds"),
        Word("Älskar","liefde","zweeds"),
        Word("Leende","glimlach","zweeds"),
        Word("Sommarmorgon","zomerochtend","zweeds"),
        Word("Gift","getrouwd","zweeds"),
        Word("Planka","zwartrijden","zweeds")
    )

    fun play(){
        words.shuffle()
        val five = words.take(5)
        println()
        five.forEach{
            println("Wat betekent " + it.original + " in het " + it.language + "?")
            print("Type hier: ")
            val userinput = readLine()
            if(userinput == it.translated){
                println("Helemaal juist!")
                println()
            } else {
                println("Helemaal fout jij slecht mens!")
                println("Andere talen proberen zo kapot te maken.")
                println(it.original + " betekent " + it.translated + ", maar in het " + it.language)
                println()
            }
        }
    }

}