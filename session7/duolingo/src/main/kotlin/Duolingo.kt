class Duolingo(
    var roundSize: Int = 5,
    var preferedLanguage: String

){
    val words = mutableListOf<Word>(

        //Mijn spaanse woorden met nederlandse vertaling
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

        //Mijn zweedse woorden met nederlandse vertaling
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

    //Mijn duolingo playbutton
    fun play(){
        val wordsInLanguage = words.filter { it.language == preferedLanguage }
        val currentWords = wordsInLanguage.shuffled().take(roundSize).toMutableSet()

        println() //A line for a clean view

        while (currentWords.isNotEmpty()){
            val selecedWord = currentWords.random()
            println("Wat betekent " + selecedWord.original + " in het " + selecedWord.language + "?")
            print("Type hier: ")
            val userinput = readLine()

            if(userinput == selecedWord.translated){
                //The visible text when getting it right
                println("Helemaal juist!")
                println() //A line for a clean view
                currentWords.remove(selecedWord) //Removing the word when getting it right
            } else {
                //The visible text when making a mistake
                println("Helemaal fout jij slecht mens!")
                println("Andere talen proberen zo kapot te maken.")
                println(selecedWord.original + " betekent " + selecedWord.translated + ", maar in het " + selecedWord.language)
                println() //A line for a clean view
            }
            println("Nog " + currentWords.count() + " te gaan!") //A countdown
            println() //A line for a clean view
        }
    }
}