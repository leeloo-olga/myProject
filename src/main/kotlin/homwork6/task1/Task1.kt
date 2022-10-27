package homwork6.task1

import java.util.*

/*
* На вход подается целое натуральное число N. Далее через пробел подаются N чисел от 0 до 100000.
* Нужно вывести эти числа в сортировоном виде от меньшего к большему через пробел.
 */
fun main() {
    print("Введите натуральное число: ")
    val input = Scanner(System.`in`)
    val inputText = input.next().trim()
    if(isValidate(inputText)){
        scannerN(inputText.toInt(), input)
    }
}
fun scannerN(count: Int, input: Scanner){
    println("Введите $count чисел от 0 до 100000")
    val inputArray = LongArray(count)
    for (i in 0 until count){
        val inputText = input.next().trim()
        if(!isValidate(inputText)) return
        inputArray[i] = inputText.toLong()
    }
    println("Ответ: ")
    println(inputArray.sortedArray().contentToString().replace("[","").replace("]","").replace(",",""))
}

fun isValidate(inputText: String) : Boolean{
    try {
        val n = inputText.toInt()
        if (n !in 1..99999) {
            println("Ошибка входных данных")
            return false
        }
    } catch (e: NumberFormatException) {
        println("Ошибка входных данных")
        return false
    }
    return true
}