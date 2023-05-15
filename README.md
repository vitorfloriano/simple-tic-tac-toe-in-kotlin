# Simple Tic-Tac-Toe in Kotlin

This is a simple tic-tac-toe game written in Kotlin. It is a console-based application that lets two players take turns to mark the cells of a 3x3 grid with X and O symbols. The game ends when one player has three of their symbols in a row, column, or diagonal, or when the grid is full and there is no winner.

## Installation

To run this game, you need to have Kotlin installed on your machine. You can download it from [here](https://kotlinlang.org/). You also need to have Gradle, a build automation tool, which you can get from [here](https://gradle.org/).

To install the game, clone this repo to your local directory using the following command:

git clone https://github.com/vitorfloriano/simple-tic-tac-toe-in-kotlin.git


Then, navigate to the project folder and run the following command to build the executable:

gradlew build


## Usage

To start the game, run the following command from the project folder:

gradlew run


The game will prompt you to enter the names of the two players and then display the empty grid. The first player will be assigned the X symbol and the second player will be assigned the O symbol. The game will ask each player to enter the coordinates of the cell they want to mark, in the format of row and column numbers separated by a space. For example, `1 1` means the top left cell, and `3 3` means the bottom right cell. The game will check if the input is valid and if the cell is empty before marking it. If not, it will ask the player to enter another coordinate. The game will also check if there is a winner or a draw after each move and announce the result accordingly.

Here is an example of how the game looks like:

Enter the names of two players:
Alice
Bob
| |
| |
| |
Alice's turn (X):
1 1
| X |
| |
| |
Bob's turn (O):
2 2
| X |
| O |
| |
Alice's turn (X):
1 2
| X X |
| O |
| |
Bob's turn (O):
3 3
| X X |
| O |
| O |
Alice's turn (X):
1 3
| X X X |
| O |
| O |
Alice wins!


## License

This project is licensed under the MIT License - see the [LICENSE](https://github.com/vitorfloriano/simple-tic-tac-toe-in-kotlin/blob/main/LICENSE) file for details.

## Contact

If you have any questions or suggestions about this project, feel free to contact me.

