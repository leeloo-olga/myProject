package homework7.task2

import java.util.Date

class Order(
    /* покупатель */
    customer: Customer,
    /* детали заказа */
    details: OrderDetails,
    /* опциональная оплата */
    payment: Payment?
) {
    /* дата оформления */
    lateinit var date: Date
    /* текущий статус */
    lateinit var status: OrderStatus

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