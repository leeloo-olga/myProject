package homework8.task1

class PastPosition(val name: String, val department: Department) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PastPosition

        if (name != other.name) return false
        if (department != other.department) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + department.hashCode()
        return result
    }
}