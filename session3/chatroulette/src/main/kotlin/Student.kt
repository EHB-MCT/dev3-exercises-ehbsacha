class Student(override val name: String): Person(name), ChatPartner {
    override fun talk() {
        gossip()
    }
    fun gossip(){
        println("Do you know about Jef and his crush?")
    }
}