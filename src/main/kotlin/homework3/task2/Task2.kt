package homework3.task2

import java.util.*

fun main() {
    println("Дано целое неотрицательное число X, X<100. Требуется перевести это число в римскую систему счисления.")
    print("Введите целое неотрицательное число, меньше 100: ")
    val input = Scanner(System.`in`)
    val inputText = input.next().trim()
    try {
        var number = inputText.toInt()
        if (number !in 1..99) {
            println("Число не соответствует условию")
            return
        }
        val numerals = listOf(90, 50, 40, 10, 9, 5, 4, 1)
        val romNumerals = listOf("XC", "L", "XL", "X", "IX", "V", "IV", "I")
        var i = 0
        var result = ""
        while (number > 0) {
            while (number - numerals[i] >= 0) {
                result += romNumerals[i]
                number -= numerals[i]
            }
            i += 1
        }
        println(result)
    } catch (e: NumberFormatException){
        println("Ошибка входных данных")
        return
    }
}