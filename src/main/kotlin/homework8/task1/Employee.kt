package homework8.task1

open class Employee(surname: String, name: String, val position: String) : Man(surname, name){
    val pastPosition: Set<PastPosition> = mutableSetOf()
    var department : Department? = null
    var idCard: IdCard? = null
    val room:Set<Room> = mutableSetOf()

    fun deletePastPosition(pastPosition: PastPosition){}
    fun deleteRoom(room: Room){}
}

