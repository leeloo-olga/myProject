package homework3.task1

import java.util.*

fun main() {
    println("Напишите программу, которая вводит с клавиатуры номер месяца и день и определяет, сколько дней осталось до Нового года")
    print("Введите номер месяца: ")
    val input = Scanner(System.`in`)
    var inputText = input.next().trim()
    try {
        val numberMonth = inputText.toInt()
        if(numberMonth !in 1..12){
            println("Некорректный номер месяца")
            return
        }
        print("Введите день месяца: ")
        inputText = input.next().trim()
        val numberDay = inputText.toInt()
        when (numberMonth){
            1,3,5,7,8,10,12 ->{
                if(numberDay !in 1 .. 31){
                    println("Некорректный день месяца")
                    return
                }
            }
            4,6,9,11 -> {
                if(numberDay !in 1 .. 30){
                    println("Некорректный день месяца")
                    return
                }
            }
            2 ->{
                if(numberDay !in 1 .. 28){
                    println("Некорректный день месяца")
                    return
                }
            }
        }
        var amountDays = 0
        for (month in 1 until numberMonth){
            when (month) {
                1, 3, 5, 7, 8, 10 -> amountDays += 31
                4, 6, 9, 11 -> amountDays += 30
                2 -> amountDays += 28
            }
        }
        println("до Нового года: ${365 - (amountDays + numberDay)} дней")
    } catch (e: NumberFormatException){
        println("Ошибка входных данных")
    }
}