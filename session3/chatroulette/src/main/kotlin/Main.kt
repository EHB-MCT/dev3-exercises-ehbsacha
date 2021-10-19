fun main() {
    var persons = arrayOf(Student("Stan"),Student("Lauren"),Teacher("Frank"),Comedian("Emma"))
    var randomPerson = persons.random()
    randomPerson.introduce()
    randomPerson.talk()
}