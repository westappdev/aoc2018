import java.io.File

fun main() {
    var total = 0
    File("../input/ChronalCalibration.input").useLines { lines ->
        lines.forEach {
            val operator: Char = it[0]
            val operand: Int = it.substring(1).toInt()
            if (operator == '+') {
                total += operand
            } else if (operator == '-') {
                total -= operand
            }
        }
    }
    println(total)

    System.exit(1)
}

main()
