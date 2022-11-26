package homework7.task2

open class Customer(
    /* имя */
    val name: String
) {
    open var address: String? = ""
    val orders: List<Order> = emptyList()
    constructor(name: String, address: String?): this(name) {
        this.address = address
    }
    fun calcPrice(): Int{
        return 0
    }
    fun calcWeight(): Int{
        return 0
    }
    fun addItem(item: OrderItem): Unit{

    }
}