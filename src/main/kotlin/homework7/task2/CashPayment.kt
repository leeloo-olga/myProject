package homework7.task2

/* Оплата наличными */
class CashPayment(amount: Int, currency: Currency) : Payment(amount, currency) {
    /* кол-во, которое было передано */
    private val total: Int
        get() {
            return total
        }
    /* сдача */
    val change: Int = 0
    override fun performPayment() {}
}