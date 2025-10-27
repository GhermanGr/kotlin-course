package org.example.lessons.lesson12.homework

fun main() {
    val numbers = listOf(-1, 2, 2, -3, 4, -5, 8, 264)

    // Задачи на приведение коллекции к значению
// Проверить, что размер коллекции больше 5 элементов.
    fun checkSize(collection: List<Int>) {
        if (collection.size > 5) {
            println("It is greater than 5.")
        }
    }
    checkSize(numbers)

    // Проверить, что коллекция пустая
    fun checkEmpty(collection: List<Int>) {
        if (collection.isEmpty()) {
            println("It is empty.")
        } else {
            println("It is not empty.")
        }
    }
    checkEmpty(numbers)

    // Проверить, что коллекция не пустая
    fun checkNotEmpty(collection: List<Int>) {
        if (collection.isNotEmpty()) {
            println("It is not empty.")
        } else {
            println("It is empty.")
        }
    }
    checkNotEmpty(numbers)

    // Взять элемент по индексу или создать значение если индекса не существует
    fun getElementByIndex(collection: List<Int>, index: Int): Int {
        return if (index >= 0 && index < collection.size) {
            collection[index]
        } else {
            0 // Return 0 if index doesn't exist
        }
    }
    println(getElementByIndex(numbers, 3)) // Prints -3
    println(getElementByIndex(numbers, 10)) // Prints 0

// Собрать коллекцию в строку
    var numbersString = numbers.joinToString(separator = " : ")
    println(numbersString)

// Посчитать сумму всех значений
    var numbersSum = numbers.sum()
    println(numbersSum)

// Посчитать среднее
    var numbersAverage = numbers.average()
    println(numbersAverage)

// Взять максимальное число
    var numbersMax = numbers.maxOrNull()
    println(numbersMax)

// Взять минимальное число
    var numbersMin = numbers.minOrNull()
    println(numbersMin)

// Взять первое число или null
    var numbersFirst = numbers.firstOrNull() // Changed to firstOrNull() for safety
    println(numbersFirst)

// Проверить что коллекция содержит элемент
    var elementPresent = numbers.contains(-100)
    println(elementPresent)

// Задачи на обработку коллекций
// Отфильтровать коллекцию по диапазону 18-30
    val filteredRange = numbers.filter { it in 18..30 }
    println(filteredRange)

// Выбрать числа, которые не делятся на 2 и 3 одновременно
    val notDivisibleBy2And3 = numbers.filter { !(it % 2 == 0 && it % 3 == 0) }
    println(notDivisibleBy2And3)

// Очистить текстовую коллекцию от null элементов
    val textList = listOf("hello", null, "world", null, "kotlin")
    val noNulls = textList.filterNotNull()
    println(noNulls)

// Преобразовать текстовую коллекцию в коллекцию длин слов
    val wordLengths = textList.filterNotNull().map { it.length }
    println(wordLengths)

// Преобразовать текстовую коллекцию в мапу, где ключи - перевёрнутые слова, а значения - длина слов
    val reversedWordMap = textList.filterNotNull().associate { it.reversed() to it.length }
    println(reversedWordMap)

// Отсортировать список в алфавитном порядке
    val sortedTextList = textList.filterNotNull().sorted()
    println(sortedTextList)

// Взять первые 3 элемента списка
    val firstThree = numbers.take(3)
    println(firstThree)

// Распечатать квадраты элементов списка
    val squares = numbers.map { it * it }
    println(squares)

// Группировать список по первой букве слов
    val groupedByFirstLetter = textList.filterNotNull().groupBy { it.first() }
    println(groupedByFirstLetter)

// Очистить список от дублей
    val noDuplicates = numbers.distinct()
    println(noDuplicates)

// Отсортировать список по убыванию
    val sortedDescending = numbers.sortedDescending()
    println(sortedDescending)

// Взять последние 3 элемента списка
    val lastThree = numbers.takeLast(3)
    println(lastThree)


    //Задача 24. Характеристика числовой коллекции
    //Напиши функцию, которая принимает коллекцию чисел и возвращает строку с характеристикой коллекции используя конструкцию when
    //
    //Если коллекция пустая - “Пусто”
    //Если количество элементов меньше пяти - “Короткая”
    //Если коллекция начинается с 0 - “Стартовая”
    //Если сумма всех чисел больше 10000 - “Массивная”
    //Если среднее значение равно 10 - “Сбалансированная”
    //Если длина строки образованная склеиванием коллекции в строку равна 20 - “Клейкая”
    //Если максимальное число меньше -10 - “Отрицательная”
    //Если минимальное число больше 1000 - “Положительная”
    //Если содержит одновременно числа 3 и 14 - “Пи***тая”
    //Иначе - “Уникальная”

    //Задача 25. Анализ учебных оценок
    //Напиши функцию, которая принимает список чисел и возвращает список чисел.

    //Задача 26. Создание каталога по первой букве
    //Напиши функцию, которая принимает список строк и возвращает словарь с ключом - буквой и значением - списком строк.

    //Задание 27. Подсчёт средней длины слов в списке
    //Напиши функцию, которая принимает список строк и возвращает строку.

    //Задание 28: Категоризация чисел
    //Напиши функцию, которая принимает список чисел и возвращает словарь с ключами - строками и значениями - список чисел.

    //Задание 29: Поиск первого подходящего элемента
    //Напиши функцию, которая принимает список чисел и число и возвращает nullable число.
}