package tictactoe

fun printGrid(grid: Array<CharArray>) {
    println("---------")
    for (row in grid) {
        println("| ${row[0]} ${row[1]} ${row[2]} |")
    }
    println("---------")
}

fun checkWin(grid: Array<CharArray>, player: Char): Boolean {
    // Check rows
    for (row in grid) {
        if (row.all { cell -> cell == player }) {
            return true
        }
    }

    // Check columns
    for (col in 0 until 3) {
        if (grid.all { row -> row[col] == player }) {
            return true
        }
    }

    // Check diagonals
    if (grid[0][0] == player && grid[1][1] == player && grid[2][2] == player) {
        return true
    }
    if (grid[0][2] == player && grid[1][1] == player && grid[2][0] == player) {
        return true
    }

    return false
}

fun checkDraw(grid: Array<CharArray>): Boolean {
    return grid.all { row -> row.all { cell -> cell != ' ' } }
}

fun makeUserMove(grid: Array<CharArray>, currentPlayer: Char) {
    var validMove = false
    while (!validMove) {
        println("Enter the coordinates (row column) for your move (1-3):")
        val (row, col) = readLine()!!.split(" ").map { it.toIntOrNull() }

        if (row == null || col == null) {
            println("You should enter numbers!")
        } else if (row !in 1..3 || col !in 1..3) {
            println("Coordinates should be from 1 to 3!")
        } else if (grid[row - 1][col - 1] != ' ') {
            println("This cell is occupied! Choose another one!")
        } else {
            grid[row - 1][col - 1] = currentPlayer
            validMove = true
        }
    }
}

fun main() {
    val grid = Array(3) { CharArray(3) { ' ' } }
    printGrid(grid)

    var currentPlayer = 'X'
    var gameWon = false
    var draw = false

    while (!gameWon && !draw) {
        makeUserMove(grid, currentPlayer)
        printGrid(grid)

        if (checkWin(grid, currentPlayer)) {
            gameWon = true
            break
        }

        if (checkDraw(grid)) {
            draw = true
            break
        }

        currentPlayer = if (currentPlayer == 'X') 'O' else 'X'
    }

    if (gameWon) {
        println("$currentPlayer wins")
    } else if (draw) {
        println("It's a draw!")
    }
}
