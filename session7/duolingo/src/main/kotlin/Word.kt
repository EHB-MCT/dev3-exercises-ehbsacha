open class Word(
    open val original: String,
    open val translated: String,
    open var storeDifficulty: Int,
    open val language: String
){
    var difficulty = storeDifficulty
        set(value){
            if (value <= 0) {
                field = 1
            }
        }
}