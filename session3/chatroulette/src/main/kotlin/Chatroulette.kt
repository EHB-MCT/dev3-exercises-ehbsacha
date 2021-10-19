open class Person(
    val name: String
    ){
    open fun hi(){
        print("Hi my name is ")
        println(name)
    }
}