class Matrix(private val matrixAsString: String) {

    fun column(colNr: Int): List<Int> {
        var rows : List<String> = matrixAsString.split('\n')
        var col = mutableListOf<Int>()
        rows.forEach {
            col.add(it.split(" ")[colNr-1].toInt())
        }
        return col
    }

    fun row(rowNr: Int): List<Int> {
        var row : String = matrixAsString.split('\n')[rowNr-1]
        var intRow = mutableListOf<Int>()
        row.split(" ").forEach{
            intRow.add(it.toInt())
        }
        return intRow
    }
}
