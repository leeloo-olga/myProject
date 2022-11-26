package homework7.task2

/* Оплата онлайн */
class OnlinePayment(amount: Int, currency: Currency) : Payment(amount, currency) {
    private val bankId: String
        get() = bankId
    lateinit var bankName: String
    fun checkIfSucceed(): PaymentStatus {
        return PaymentStatus.NOT_PAID
    }
    override fun performPayment() {}
}