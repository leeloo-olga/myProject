package homework7.task2

import java.util.Date

class DelayedPayment(amount: Int, currency: Currency) : Payment(amount, currency) {
    private val endDate: Date
        get() {
            return endDate
        }
    val partAmount: String = ""
    fun performPartialPayment(amount: Int): Unit {}
    override fun performPayment() {}
}