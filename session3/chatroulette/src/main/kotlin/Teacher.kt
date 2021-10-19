class Teacher(override val name: String): Person(name), ChatPartner {
    override fun talk() {
        fact()
    }
    fun fact(){
        println("Did you know the name 'bonobo' resulted from a misspelling?")
    }
}
