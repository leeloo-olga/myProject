package homework8.task1

class Employee(surname: String, name: String, val position: String) : Man(surname, name){
    val pastPosition: Set<PastPosition> = mutableSetOf()
    var department : Department? = null
    var idCard: IdCard? = null
    val room:Set<Room> = mutableSetOf()

    fun deletePastPosition(pastPosition: PastPosition){}
    fun deleteRoom(room: Room){}
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Employee

        if (position != other.position) return false
        if (pastPosition != other.pastPosition) return false
        if (department != other.department) return false
        if (idCard != other.idCard) return false
        if (room != other.room) return false

        return true
    }

    override fun hashCode(): Int {
        var result = position.hashCode()
        result = 31 * result + pastPosition.hashCode()
        result = 31 * result + (department?.hashCode() ?: 0)
        result = 31 * result + (idCard?.hashCode() ?: 0)
        result = 31 * result + room.hashCode()
        return result
    }
}

