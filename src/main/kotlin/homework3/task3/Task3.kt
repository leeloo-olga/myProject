package homework3.task3

import java.util.*

fun main() {
    println("На вход приходит 3 натуральных числа - стороны треугольника. Определите тип треугольника (остроугольный, тупоугольный, прямоугольный) с данными сторонами.")
    print("Введите натуральное число (сторона a): ")
    val input = Scanner(System.`in`)
    var inputText = input.next().trim()
    try {
        val oneSideTriangle = inputText.toInt()
        if (oneSideTriangle < 0) {
            println("Ошибка входных данных")
            return
        }
        print("Введите натуральное число (сторона b): ")
        inputText = input.next().trim()
        val twoSideTriangle = inputText.toInt()
        if (twoSideTriangle < 0) {
            println("Ошибка входных данных")
            return
        }
        print("Введите натуральное число (сторона c): ")
        inputText = input.next().trim()
        val threeSideTriangle = inputText.toInt()
        if (threeSideTriangle < 0) {
            println("Ошибка входных данных")
            return
        }
        val oneSq = oneSideTriangle * oneSideTriangle
        val twoSq = twoSideTriangle * twoSideTriangle
        val threeSq = threeSideTriangle * threeSideTriangle

        when{
            oneSq == twoSq + threeSq || twoSq == oneSq + threeSq || threeSq == oneSq + twoSq ->
                println("треуголник прямоугольный")
            oneSq + twoSq > threeSq && oneSq + threeSq > twoSq && twoSq + threeSq > oneSq ->
                println("треуголник остроугольный")
            else ->
                println("треуголник тупоугольный")
        }

    } catch (e: NumberFormatException) {
        println("Ошибка входных данных")
        return
    }
}