package org.example.lessons.lesson7

fun main() {
    //Задания для цикла for
    //Прямой диапазон
    //Напишите цикл for, который выводит числа от 1 до 5.

    fun task1() {
        for (i in 1..5) {
            print(i)
        }
    }

    //Напишите цикл for, который выводит четные числа от 1 до 10.

    fun task2() {
        for (i in 1..10) {
            if (i % 2 == 0) {
                print(i)
            }
        }
    }

    //Обратный диапазон
    //Создайте цикл for, который выводит числа от 5 до 1.

    fun task3() {
        for (i in 5 downTo 1) {
            print(i)
        }
    }

    //Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.

    fun task4() {
        for (i in 10 downTo 1) {
            var num = i - 2
            print(num)
        }
    }

    //С шагом (step)
    //Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.

    fun task5() {
        for (i in 1..9 step 2) {
            print(i)
        }
    }

    //Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.

    fun task6() {
        for (i in 1..20 step 3) {
            print(i)
        }
    }

    //Использование до (until)
    //Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.

    fun task7(size: Int) {
        for (i in 3 until size step 2) {
            print(i)
        }
    }

    //Задания для цикла while
    //Цикл while
    //Создайте цикл while, который выводит квадраты чисел от 1 до 5.

    fun task8(){
        var i = 1
            while (i <= 5) {
                var result = i * i
                println(result)
                i++
            }
    }

    //Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль

    fun task9(){
        var i = 10
        while (i >= 5) {
            println(i)
            i--
        }
    }

    //Цикл do while
    //Используйте цикл do while, чтобы вывести числа от 5 до 1.

    fun task10(){
        var i = 5
            do {
                println(i)
                i--
            } while (i >= 1)
    }

    //Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.

    fun task11(){
        var i = 5
            do {
                println(i)
                i++
            } while (i <= 10)
    }

    //Задания для прерывания и пропуска итерации
    //Использование break
    //Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.

    fun task12(){
        for (i in 1..10) {
            if (i == 6) break
            println(i)
        }
    }

    //Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.

    fun task13(){
        var i = 1
        while (true) {
            println(i)
            i++
            if (i == 11) break
        }
    }

    //Использование continue
    //В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.

    fun task14(){
        for (i in 1..10) {
            if (i % 2 == 0) continue
            println(i)
        }
    }

    //Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.

    fun task15(){
        var i = 0
        while (i < 10) {
            i++
            if (i % 3 == 0) continue
            println(i)
        }
    }
    task15()
    //HARD TASKS LET'S GOOOO!!!

    //Используя вложенный цикл реализовать таблицу умножения, как на картинке.

        fun hard_task1() {
            var x = 1
            while (x <= 10) { //Next time need to remember to use different conditional variables for different loops.
                for (i in 1 until 11) {
                    var result = i * x
                    print("$result\t")
                }
                x++
                println()
            }
        }
}