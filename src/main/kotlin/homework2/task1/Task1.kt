package homework2.task1

import java.util.*

fun main() {
    println("На вход подается одно натуральное трехзначное число - N. Напишите код, который будет вычислять сумму цифр в данном числе.")
    print("Введите N: ")
    val input = Scanner(System.`in`)
    var inputText = input.next().trim()
    try {
        if(inputText.toLong() < 0 || inputText.toInt() !in 100..999){
            println("Попробуйте ещё раз. Введите натуральное трехзначное число")
            inputText = input.next().trim()
            if (inputText.toLong() < 0 || inputText.toInt() !in 100..999) {
                println("Всё пропало!")
                return
            }
        }
        val inputInt = inputText.toInt().toString()
        val sum = inputInt[0].digitToInt() + inputInt[1].digitToInt() + inputInt[2].digitToInt()
        println("Cумма цифр в данном числе: $sum")
    } catch (e: NumberFormatException){
        println("Всё пропало! Это не натуральное трехзначное число")
    }

}