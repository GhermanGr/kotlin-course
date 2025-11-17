package org.example.lessons.lesson20.homework

// 1
fun Array<Int>.getFirstAndLast(): Pair<Int?, Int?> {
    if (isEmpty()) {
        return null to null
    } else {
        return first() to last()
    }
}

// 2
fun <T : Comparable<T>> MutableList<T>.customSort(ascending: Boolean): List<T> {
    if (ascending) {
        sort()
    } else {
        sortDescending()
    }
    return toList()
}

// 3
fun <T> Map<T, List<T>>?.transformByIndex(position: Int): Map<String, T?>? {
    if (this == null) return null

    val result = mutableMapOf<String, T?>()
    for ((key, valueList) in this) {
        val stringKey = key.toString()
        val item = if (position < valueList.size) valueList[position] else null
        result[stringKey] = item
    }
    return result
}
