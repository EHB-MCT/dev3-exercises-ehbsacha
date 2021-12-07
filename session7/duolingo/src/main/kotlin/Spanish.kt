class Spanish(
    override val original: String,
    override val translated: String,
    override var storeDifficulty: Int = 1
): Word(original, translated, storeDifficulty ,"spaans") {
}