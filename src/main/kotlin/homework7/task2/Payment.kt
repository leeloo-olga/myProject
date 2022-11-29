package homework7.task2

/* Оплата */
open class Payment(
    /* кол-во */
    val amount: Int,
    /* тип валюты */
    val currency: Currency
) {
    /* статус платежа */
    var status: PaymentStatus? = PaymentStatus.NOT_PAID
    open fun performPayment(): Unit {}
}