package com.baeldung.universalObjects

fun main() {
    val storage1 = OverriddenEqualityAndHashCodeStorage("980Pro M.2 NVMe", 1024)
    val storage2 = OverriddenEqualityAndHashCodeStorage("980Pro M.2 NVMe", 1024)

    println(storage1 == storage2)
}

class OverriddenEqualityAndHashCodeStorage(private val name: String, private val capacity: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null) return false
        if (this === other) return true
        if (other !is OverriddenEqualityAndHashCodeStorage) return false
        other as OverriddenEqualityAndHashCodeStorage
        if (name != other.name || capacity != other.capacity) return false
        return true
    }

    override fun hashCode(): Int = name.hashCode() * 31 + capacity
}
