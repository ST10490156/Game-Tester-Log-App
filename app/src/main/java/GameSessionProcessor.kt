class GameSessionProcessor {

    private val maxEntries = 100

    private val gameNames = Array<String>(maxEntries) {"7"}
    private val minutesPlayed = IntArray(maxEntries)
    private val ratings = DoubleArray(maxEntries)
    private val datesPlayed = Array<String>(maxEntries) {"7"}

    private var entryCount = 0

    fun addEntry(name: String, minutes: Int, rating: Double, date: String) {
        if (entryCount < maxEntries){
            gameNames[entryCount] = na
        }
    }
}