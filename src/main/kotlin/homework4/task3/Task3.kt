package homework4.task3

import java.util.*

/**
 * На вход подается натуральное число N - количество этажей равнобедренного треугольника.
 * Напишите код и реализуйте отдельную функцию, которая будет рисовать равнобедренный треугольник из звездочек (*).
 */

fun main() {
    print("Введите натуральное число: ")
    val input = Scanner(System.`in`)
    val inputText = input.next().trim()
    if(isValidate(inputText)){
        println("Ответ: ")
        triangle(inputText.toInt())
    }
}

fun triangle(countFloor: Int){
    var numberFloor = countFloor
    var countStars = 1
    while(numberFloor > 0){
        printStar(numberFloor-1, " ")
        printStar(countStars, "*", true)
        countStars += 2
        numberFloor -= 1
    }
}

fun printStar(countStars: Int, symbol: String, isLn: Boolean = false){
    for (i in 1..countStars) {
        if (i == countStars && isLn)
            println(symbol)
        else
            print(symbol)
    }
}

fun isValidate(inputText: String) : Boolean{
    try {
        val n = inputText.toInt()
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