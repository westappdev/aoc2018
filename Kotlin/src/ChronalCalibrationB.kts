import java.io.File

fun main(): Int {
    val input = mutableListOf<String>()
    var total = 0
    val freqs = HashMap<Int, Int>()

    File("../input/ChronalCalibration.input").useLines { lines -> lines.forEach { input.add(it) } }

    while (true) {
        input.forEach {
            val operator: Char = it[0]
            val operand: Int = it.substring(1).toInt()

            if (operator == '+') {
                total += operand
            } else if (operator == '-') {
                total -= operand
            }

            if (freqs.put(total, 1) != null) {
                return total
            }
        }
    }
}

println(main())
