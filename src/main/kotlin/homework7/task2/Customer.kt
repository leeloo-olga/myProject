package homework7.task2

class Customer(
    /* имя */
    val name: String,
    var address: String = ""
) {
    val orders: List<Order> = mutableListOf()
    fun calcPrice(): Int{
        return 0
    }
    fun calcWeight(): Int{
        return 0
    }
    fun addItem(item: OrderItem): Unit{

    }
}