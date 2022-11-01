package homework5.task3

import java.util.*

/*
    Реализуйте метод, который будет валидировать пароль. Пароль должен быть достаточно сложным, поэтому должны выполняться следующие минимальные правила:
 -  Длина минимум 6 символов.
 -  Минимум одна цифра.
 -  Минимум одна заглавная буква.
 -  Не должно быть 3 одинаковых символа подряд.*
 */
fun main() {
    println("Длина минимум 6 символов")
    println("Минимум одна цифра")
    println("Минимум одна заглавная буква")
    println("Не должно быть 3 одинаковых символа подряд")
    println("Введите пароль: ")
    val input = Scanner(System.`in`)
    if (isValidate(input.next())){
        println("Пароль валидный")
    } else {
        println("Пароль невалидный")
    }
}

fun isValidate(inputText: String) : Boolean{
    val reg = Regex("^((?=.*[0-9])(?=.*[A-Z])\\S).{6,}\$")
    val reg1 = Regex("(\\S)\\1{2,}")
    return reg.matches(inputText) && !reg1.containsMatchIn(inputText)
}