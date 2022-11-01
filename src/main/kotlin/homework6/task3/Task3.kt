package homework6.task3

/*
* На вход подается массив чисел, содержащий минимум одно число.
* Нужно вывести через пробел: минимальное, среднее и максимальное числа из этого массива.
*
* Ответ три числа через пробел.
 */
fun main() {
    val mass = intArrayOf(99,52,37,24,85,16,7,48,9)
    println("Входные данные:")
    println(mass.contentToString())
    println("Ответ: ")
    println("${mass.min()} ${String.format("%.2f", mass.average())} ${mass.max()}")
}