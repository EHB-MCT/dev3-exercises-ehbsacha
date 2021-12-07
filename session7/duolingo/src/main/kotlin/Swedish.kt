class Swedish(
    override val original: String,
    override val translated: String,
    override var storeDifficulty: Int = 2
): Word(original, translated,storeDifficulty,"zweeds") {
}