package homework7.task2

import java.util.Date

class Order(
    /* покупатель */
    val customer: Customer,
    /* детали заказа */
    val details: OrderDetails,
    /* опциональная оплата */
    val payment: Payment?
) {
    /* дата оформления */
    lateinit var date: Date
    /* текущий статус */
    var status: OrderStatus = OrderStatus.WAITING

    enum class OrderStatus{
        /* отправлен, ждет оплаты, оплачен, обрабатывается, получен */
        SEND,
        WAITING,
        PAID,
        PROCESSED,
        RECEIVED
    }
    fun calcPrice(): Int{
        return 0
    }
    fun calcWeight(): Int{
        return 0
    }
    fun pay(payment: Payment): Unit{

    }
}