import java.util.Scanner
import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.math.roundToInt

fun main(){
    println("Дан прямоугольник со сторонами A и B. Требуется вычислить квадрат диагонали прямоугольника.")
    print("Введите A: ")
    val inputA = Scanner(System.`in`)
    val a: Double = inputA.nextDouble()
    print("Введите B: ")
    val inputB = Scanner(System.`in`)
    val b:Double = inputB.nextDouble()
    val c= sqrt(a.pow(2.0) + b.pow(2.0))
    val d:Double = (c * 1000).roundToInt().toDouble()
    println("Формула диагонали прямоугольника выводится через теорему Пифагора: a^2+b^2=d^2")
    println("D: ${(d/1000)}")
}

