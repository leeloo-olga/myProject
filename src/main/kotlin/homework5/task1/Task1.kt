package homework5.task1


import java.util.*

/*
* На вход подается 4 целых числа. Напишите метод, который будет возвращать минимальное из этих чисел.
*/
fun main() {
    print("Введите 4 целых числа: ")
    val input = Scanner(System.`in`)
    val list = mutableListOf<Int>()
    for (i in 1 .. 4) {
        val inputText = input.next().trim()
        if (isValidate(inputText)) {
            list.add(inputText.toInt())
        } else {
            return
        }
    }
    println("Ответ (минимальное): ${list.min()}")
}

fun isValidate(inputText: String) : Boolean{
    try {
        inputText.toLong()
    } catch (e: NumberFormatException) {
        println("Ошибка входных данных")
        return false
    }
    return true
}