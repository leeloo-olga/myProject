package homework4.task1

import java.util.*

/**
 * На вход подается натуральное число N.
 * Напишите код и реализуйте отдельную функцию, которая будет возвращать значение true, если число является палиндромом.
 */

fun main() {
    print("Введите натуральное число: ")
    val input = Scanner(System.`in`)
    val inputText = input.next().trim()
    if(isValidate(inputText)){
        println("Ответ: ")
        isPalindrome(inputText)
    }
}

fun isPalindrome(inputText: String) {
    var result = true
    for (i in 0 .. inputText.length/2){
        val iEnd = inputText.length-i-1
        if(inputText[i] != inputText[iEnd]){
            result = false
            break
        }
    }
    println(result)
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

