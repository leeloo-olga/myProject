package homework5.task2

import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

/*
* На вход подается 4 целых числа x1, x2, y,1, у2 (-10000<x1,x2,y,1,у2<10000).
* Напишите метод, который будет возвращать вещественное число типа double - длину отрезка с концами в точках (x1,y1) и (x2,y2).
*/
fun main() {
    print("Введите 4 целых числа x1, x2, y,1, у2 (-10000<x1,x2,y,1,у2<10000): ")
    val input = Scanner(System.`in`)
    val list = mutableListOf<Double>()
    for (i in 1 .. 4) {
        val inputText = input.next().trim()
        if (isValidate(inputText)) {
            list.add(inputText.toDouble())
        } else {
            return
        }
    }
    println("Применим теорему Пифагора: |AB|² = (y2 — y1)² + (x2 — x1)²")
    val AB = sqrt((list[3] - list[2]).pow(2) + (list[1]-list[0]).pow(2))
    println("Ответ, длина отрезка AB с концами в точках (${list[0].toInt()},${list[2].toInt()}) и (${list[1].toInt()},${list[3].toInt()}): ${String.format("%.3f", AB)}")
}

fun isValidate(inputText: String) : Boolean{
    try {
        val x = inputText.toInt()
        if (x < -10000 || x > 10000) {
            println("Ошибка входных данных")
            return false
        }
    } catch (e: NumberFormatException) {
        println("Ошибка входных данных")
        return false
    }
    return true
}