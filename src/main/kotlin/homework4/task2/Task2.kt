package homework4.task2

import java.util.*

/**
 * На вход подается натуральное число N.
 * Напишите код и реализуйте отдельную функцию, которая будет вычислять факториал числа N.
 */
fun main(){
    print("Введите натуральное число: ")
    val input = Scanner(System.`in`)
    val inputText = input.next().trim()
    if(isValidate(inputText) ){
        val n = inputText.toLong()
        val factorial = factorial(n)
        println("факториал числа $n равен ${if(factorial < 0) "очень много" else factorial}")
    }
}

tailrec fun factorial(n: Long, accum: Long = 1): Long {
    val soFar = n * accum
    return if (n <= 1) {
        soFar
    } else {
        factorial(n - 1, soFar)
    }
}

fun isValidate(inputText: String) : Boolean{
    try {
        val n = inputText.toLong()
        if (n < 0) {
            println("Ошибка входных данных")
            return false
        }
    } catch (e: NumberFormatException) {
        println("Ошибка входных данных")
        return false
    }
    return true
}