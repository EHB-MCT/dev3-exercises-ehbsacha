fun main() {
    var persons = arrayOf(Student("Stan"),Student("Lauren"),Teacher("Frank"),Comedian("Emma"), Chatbot())
    var randomPerson = persons.random()
    randomPerson.introduce()
    randomPerson.talk()
}