fun main() {
    // write your code here
    val sequence = readLine().toString().toLowerCase()
    val qtGuanine = sequence!!.count { it == 'g' }.toDouble()
    val qtCytosine = sequence.count { it == 'c' }.toDouble()
    val qtGandC = qtGuanine + qtCytosine
    val division = qtGandC / sequence.length
    val percentage = division * 100
    println(percentage)
}

