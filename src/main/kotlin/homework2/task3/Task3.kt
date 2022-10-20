import java.util.Scanner
import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    println("Дан прямоугольник со сторонами A и B. Требуется вычислить квадрат диагонали прямоугольника.")
    print("Введите A: ")
    val input = Scanner(System.`in`)
    var inputText = input.next()
    val a: Double
    val b:Double
    try {
        a = inputText.toDouble()
        print("Введите B: ")
        inputText = input.next()
        b = inputText.toDouble()
        if(a < 0 || b < 0){
            println("Введенные данные не удовлетворяют условию - сторона треугольника не может быть меньше нуля")
            return
        }
    }catch (e: NumberFormatException){
        println("Введенные данные не удовлетворяют условию")
        return
    }
    val d= sqrt(a.pow(2.0) + b.pow(2.0))
    println("Формула диагонали прямоугольника выводится через теорему Пифагора: a^2+b^2=d^2")
    println("D: ${String.format("%.3f", d)}")
}

