package tictactoe

fun displayGrid(inputString: String) {
    println("---------")

    for (rowIndex in 0 until 3) {
        print("| ")
        for (columnIndex in 0 until 3) {
            val index = (rowIndex * 3) + columnIndex
            val symbol = inputString.getOrNull(index) ?: '_'
            print("$symbol ")
        }
        println("|")
    }

    println("---------")
}
fun main() {
    print("> ")
    val inputString = readLine()?.trim() ?: ""
    displayGrid(inputString)
}
