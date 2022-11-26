package homework7.task1

class Fraction(var dividend: Int, var divider: Int) {

    fun plus(term:Fraction){
        this.dividend = this.dividend * term.divider + term.dividend*this.divider
        this.divider = this.divider*term.divider
        reduction()
    }

    fun minus(subtrahend: Fraction){
        this.dividend = this.dividend * subtrahend.divider - subtrahend.dividend*this.divider
        this.divider = this.divider*subtrahend.divider
        reduction()
    }
    private fun reduction(){
        val nod = gcd(this.dividend, this.divider)
        this.dividend = this.dividend / nod
        this.divider = this.divider / nod
    }

    private fun gcd(num: Int, den: Int): Int {
        var a = num
        var b = den
        while (a != 0 && b != 0) {
            if (a > b)
                a %= b
            else
                b %= a

        }
        return a + b
    }
    override fun toString(): String {
        return "Fraction(dividend=$dividend, divider=$divider)"
    }
}
fun main(){
    val fraction1 = Fraction(1,2)
    val fraction2 = Fraction(3,5)
    print("${fraction1.dividend}/${fraction1.divider} + ${fraction2.dividend}/${fraction2.divider} = ")
    fraction1.plus(fraction2)
    println("${fraction1.dividend}/${fraction1.divider}")
    print("${fraction1.dividend}/${fraction1.divider} - ${fraction2.dividend}/${fraction2.divider} = ")
    fraction1.minus(fraction2)
    println("${fraction1.dividend}/${fraction1.divider}")
}