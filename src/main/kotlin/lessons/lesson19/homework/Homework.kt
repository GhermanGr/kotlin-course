package org.example.lessons.lesson19.homework

// 1
fun <T> getMiddleElement(list: List<T>): T? {

    if (list.size % 2 == 0) {
        return null
    }

    return list[list.size / 2]
}

// 2
class ListHolder<T> {

    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }


    fun getAll(): List<T> {
        return items.toList()
    }
}

// 3
interface Mapper<From, To> {
    fun convert(one: From): To
    fun convertList(many: List<From>): List<To>
}

// 4
class PhrasesToListOfStrings : Mapper<String, List<String>> {
    override fun convert(one: String): List<String> {
        return one.split(" ")
    }

    override fun convertList(many: List<String>): List<List<String>> {
        return many.map { it.split(" ") }
    }
}

// 5
fun <K, V> transposition(input: Map<K, V>): Map<V, K> {
    val result = mutableMapOf<V, K>()
    for ((key, value) in input) {
        result[value] = key
    }
    return result
}

// 6
interface Validator<T> {
    fun isValid(value: T): Boolean
}