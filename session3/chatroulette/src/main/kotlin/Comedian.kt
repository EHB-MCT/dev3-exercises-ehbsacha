class Comedian(override val name: String): Person(name), ChatPartner {
    override fun talk() {
        joke()
    }
    fun joke(){
        println("Do you know about the joke with no ending?")
    }
}