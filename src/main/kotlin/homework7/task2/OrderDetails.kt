package homework7.task2

class OrderDetails(var items: List<OrderItem>) {
    var location: String = ""
    fun calcPrice(): Int {return 0}
    fun calcWeight(): Int {return 0}
    fun addItem(item: OrderItem): Unit {}
}