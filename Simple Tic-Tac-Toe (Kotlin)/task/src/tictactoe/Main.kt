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

fun printGameState(inputString: String) {
    displayGrid(inputString)

    val xCount = inputString.count { it == 'X' }
    val oCount = inputString.count { it == 'O' }
    val emptyCount = inputString.count { it == '_' }

    val xWins = isWinningState(inputString, 'X')
    val oWins = isWinningState(inputString, 'O')

    if (xWins && oWins || Math.abs(xCount - oCount) >= 2) {
        println("Impossible")
    } else if (xWins) {
        println("X wins")
    } else if (oWins) {
        println("O wins")
    } else if (emptyCount == 0) {
        println("Draw")
    } else {
        println("Game not finished")
    }
}

fun isWinningState(inputString: String, symbol: Char): Boolean {
    val rows = arrayOf(
        intArrayOf(0, 1, 2),
        intArrayOf(3, 4, 5),
        intArrayOf(6, 7, 8)
    )
    val columns = arrayOf(
        intArrayOf(0, 3, 6),
        intArrayOf(1, 4, 7),
        intArrayOf(2, 5, 8)
    )
    val diagonals = arrayOf(
        intArrayOf(0, 4, 8),
        intArrayOf(2, 4, 6)
    )

    for (row in rows) {
        if (row.all { inputString[it] == symbol }) {
            return true
        }
    }

    for (column in columns) {
        if (column.all { inputString[it] == symbol }) {
            return true
        }
    }

    for (diagonal in diagonals) {
        if (diagonal.all { inputString[it] == symbol }) {
            return true
        }
    }

    return false
}

fun main() {
    print("> ")
    val inputString = readLine()?.trim() ?: ""
    printGameState(inputString)
}
