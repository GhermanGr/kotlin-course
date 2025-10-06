package org.example.lessons.lesson08.homework

//Все по-английски, поскольку русский текст не отображается в консоли, и я пока не могу это побороть.
fun main() {
    //1. Преобразование строк
    fun transformText(input: String) {
        if (input.contains("impossible")) {
            var newString = input.replace("impossible", "definitely possible")
            println(newString)
        }

        if (input.startsWith("I am not sure")) {
            var newString = input.replace("I am not sure", "I am 100% confident")
            println(newString)
        }
    }

    //2. Извлечение даты из строки лога


    //3. Маскирование личных данных
    fun hideCreditCardNumber(input: String) {
        val lastFour = input.takeLast(4)
        val hideCreditCardNumber = "*".repeat(input.length - 4) + lastFour
        print(hideCreditCardNumber)
    }

    //4. Форматирование адреса электронной почты
    fun formatEmail(input: String) {
        var newString: String
        newString = input.replace("@", " [at] ")
        newString = input.replace(".", " [dot] ")
        println(newString)
    }
    formatEmail("username@example.com")
}