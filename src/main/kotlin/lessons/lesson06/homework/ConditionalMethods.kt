package org.example.lessons.lesson06.homework

fun main() {
    //Задание 1: "Определение сезона"
    //
    //Напишите функцию, которая на основе номера месяца распечатывает сезон года. Номера месяцев начинаются с единицы.

    fun detectSeason(monthNum: Int) {
        if ( monthNum in 1..2 || monthNum == 12) {
            println("It is winter.")
        } else if (monthNum in 3..5) {
            println("It is spring.")
        } else if (monthNum in 6..8) {
            println("It is summer.")
        } else if (monthNum in 9..1) {
            println("It is fall.")
        }
    }
    detectSeason(7)

    //Задание 2: "Расчет возраста питомца"
    //
    //Создайте функцию, которая преобразует возраст собаки в "человеческие" годы. До 2 лет каждый год собаки равен 10.5 человеческим годам, после - каждый год равен 4 человеческим годам. Результат распечатай в консоль.

    fun convertDogAge(dogAge: Double) {
        if (dogAge > 2.0) {
            var dogMatureAge: Double = dogAge - 2
            var dogToHumanAge = 21 + (dogMatureAge * 4)
            println(dogToHumanAge)
        } else {
            var dogToHumanAge = dogAge * 10.5
            println(dogToHumanAge)
        }
    }
    convertDogAge(2.1)

    //Задание 3: "Определение способа перемещения"
    //
    //Напишите функцию, которая печатает в консоль, какой способ перемещения лучше использовать, исходя из длины маршрута. Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".
    fun pickTransportationMode(distance: Double) {
        if (distance >= 0 && distance < 1) {
            println("You should walk.")
        } else if (distance >= 1 && distance < 5) {
            println("You should ride a bike.")
        } else {
            println("You should drive.")
        }
    }

    //Задание 4: "Расчет бонусных баллов"
    //
    //Клиенты интернет-магазина получают бонусные баллы за покупки. Напишите функцию, которая принимает сумму покупки и печатает в консоль количество бонусных баллов: 2 балла за каждые 100 рублей при сумме покупки до 1000 рублей и 3 балла за каждые 100 рублей при сумме свыше этого.

//    fun calculateBonusPoints(purchasePrice:Double) {
//        if
//    }

}