package homework2.task2

import java.util.*

fun main(){
    println("На вход подается одно натуральное число N - количество минут. Напишите код, который будет конвертировать минуты в кол-во годов и месяцев.")
    print("Введите N: ")
    val input = Scanner(System.`in`)
    val inputText = input.next()
    try {
        val inputLong = inputText.toLong()
        if(inputLong < 0){
            println("Введенные данные не удовлетворяют условию")
            return
        }
        val hours = inputLong/60
        val days = hours/24
        var months = days/30
        val years = days/360
        months -= years * 360/30
        println("$years лет, $months месяцев")
    } catch (e: NumberFormatException){
        println("Введенные данные не удовлетворяют условию")
    }
}