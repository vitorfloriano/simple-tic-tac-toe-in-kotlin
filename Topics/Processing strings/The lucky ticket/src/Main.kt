import javax.xml.stream.events.Characters

fun main() {
    // write your code here
    val input = readLine()!!
    val splitInput = input.toCharArray()
    val firstHalf = Character.getNumericValue(splitInput[0]) +
            Character.getNumericValue(splitInput[1]) +
            Character.getNumericValue(splitInput[2])
    val secondHalf = Character.getNumericValue(splitInput[3]) +
            Character.getNumericValue(splitInput[4]) +
            Character.getNumericValue(splitInput.last())
    println(if (firstHalf == secondHalf) "Lucky" else "Regular")
}