package homework8.task1

class Room (val number: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Room

        if (number != other.number) return false

        return true
    }

    override fun hashCode(): Int {
        return number
    }
}