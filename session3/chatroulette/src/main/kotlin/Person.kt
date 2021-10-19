open abstract class Person(
    open val name: String
    ){
    fun introduce(){
        print("Hello my name is ")
        println(name)
    }
    open fun talk(){
    }
}