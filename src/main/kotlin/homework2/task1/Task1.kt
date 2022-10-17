package homework2.task1

import java.util.*

fun main() {
    println("На вход подается одно натуральное трехзначное число - N. Напишите код, который будет вычислять сумму цифр в данном числе.")
    print("Введите N: ")
    val input = Scanner(System.`in`)
    val inputText = input.next()
    val sum = inputText[0].digitToInt() + inputText[1].digitToInt() + inputText[2].digitToInt()
    println("Cумма цифр в данном числе: $sum")
}