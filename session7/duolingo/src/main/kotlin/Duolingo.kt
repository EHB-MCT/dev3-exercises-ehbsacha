class Duolingo(
    val roundSize: Int = 5
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
        val currentWords = words.shuffled().take(roundSize).toMutableSet()
//        println(currentWords.count())
        println()

        while (currentWords.isNotEmpty()){
            val selecedWord = currentWords.random()
            println("Wat betekent " + selecedWord.original + " in het " + selecedWord.language + "?")
            print("Type hier: ")
            val userinput = readLine()

            if(userinput == selecedWord.translated){
                println("Helemaal juist!")
                println()
                currentWords.remove(selecedWord)
            } else {
                println("Helemaal fout jij slecht mens!")
                println("Andere talen proberen zo kapot te maken.")
                println(selecedWord.original + " betekent " + selecedWord.translated + ", maar in het " + selecedWord.language)
                println()
            }
            println("Nog " + currentWords.count() + " te gaan!")
            println()
        }


//        println()
//        currentFive.forEach{
//
//            println("Wat betekent " + it.original + " in het " + it.language + "?")
//
//            print("Type hier: ")
//            val userinput = readLine()
//
//            if(userinput == it.translated){
//                println("Helemaal juist!")
//                println()
//                currentFive.remove(it)
//            } else {
//                println("Helemaal fout jij slecht mens!")
//                println("Andere talen proberen zo kapot te maken.")
//                println(it.original + " betekent " + it.translated + ", maar in het " + it.language)
//                println()
//            }
//        }
    }

}