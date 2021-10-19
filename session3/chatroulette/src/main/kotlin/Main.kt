fun main() {
    var stan = Person("Stan")
    var lauren = Person("Lauren")
    var persons = arrayOf(stan,lauren)
    var randomPerson = persons.random()
    randomPerson.hi()
}