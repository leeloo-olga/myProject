package homework7.task2

/* Оплата */
open class Payment(
    /* кол-во */
    val amount: Int,
    /* тип валюты */
    val currency: Currency
) {
    /* статус платежа */
    var status: PaymentStatus? = null
    open fun performPayment(): Unit {}
}