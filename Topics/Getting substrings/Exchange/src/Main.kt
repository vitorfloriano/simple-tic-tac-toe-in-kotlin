fun main() {
    // put your code here
    val str = readLine()!!
    val strFirstChar = str.first()
    val strLastChar = str.last()
    val strMiddle = str.substring(1, str.length - 1)
    println(strLastChar + strMiddle + strFirstChar)
}