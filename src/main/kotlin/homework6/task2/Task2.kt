package homework6.task2

/*
* На вход подается Данно 2 иммутабельных массива данных. Нужно реализовать 3 подзадачи:
* Нужно "склеить" два массива, т.е. получить 3-ий массив, в котором сначала идут значения из первого, а потом из второго.
* Нужно "вычесть" два массива. т.е. получить 3-ий массив, в котором есть все элементы из первого, кроме тех, которые есть во втором.
* Нужно "пересечь" два массива, т.е.получить 3-ий массив, в котором все элементы находятся сразу и в первом и во втором массивах
* На вход каждой подзадачи подается две строки. Ответ на каждую задачу должен содержать строку с результатом.
 */
fun main() {
    val mass1 = intArrayOf(1,2,3,4,5,6,7,8,9)
    val mass2 = intArrayOf(1,11,3,9)
    println("Входные данные:")
    println(mass1.contentToString())
    println(mass2.contentToString())
    println("Ответ (\"склеить\" два массива):")
    val mass3 = mass1.plus(mass2)
    println(mass3.contentToString())
    println()
    println("Ответ (\"вычесть\" два массива):")
    val mass5 = mass1.filter{m1 -> mass2.find{m2 -> m1 == m2}==null}
    println(mass5)
    println()
    println("Ответ (\"пересечь\" два массива):")
    val mass4 = mass1.filter{m1 -> mass2.find{m2 -> m1 == m2}!=null}
    println(mass4)


}

