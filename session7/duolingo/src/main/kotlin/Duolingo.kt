class Duolingo(
    var roundSize: Int = 5,
    var preferedLanguage: String
){
    var words = mutableListOf<Word>(

        //Mijn spaanse woorden met nederlandse vertaling
        Spanish("Niño","jongen"),
        Spanish("Niña","meisje"),
        Spanish("boleto","ticket"),
        Spanish("manzanas","appels"),
        Spanish("maleta","koffer"),
        Spanish("aeropuerto","luchthaven"),
        Spanish("pan","brood"),
        Spanish("cerrado","gesloten"),
        Spanish("gato","kat"),
        Spanish("perro","hond"),

        //Mijn zweedse woorden met nederlandse vertaling
        Swedish("bil","auto"),
        Swedish("Vän","vriend"),
        Swedish("Bra","goed"),
        Swedish("Tystnad","stilte"),
        Swedish("Duktig","getalenteerd"),
        Swedish("Älskar","liefde"),
        Swedish("Leende","glimlach"),
        Swedish("Sommarmorgon","zomerochtend"),
        Swedish("Gift","getrouwd"),
        Swedish("Planka","zwartrijden")
    )

    fun playEasy() {
        var theWords = words.filter { it.language == preferedLanguage }
        play(theWords.toMutableList())
    }
    fun playHard() {
        var theWords = words
        play(theWords.toMutableList())
    }

    //Mijn duolingo playbutton
    fun play(words: MutableList<Word>){
        val currentWords = words.shuffled().take(roundSize).toMutableSet()

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