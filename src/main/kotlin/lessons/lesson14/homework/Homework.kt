package org.example.lessons.lesson14.homework

fun main() {
    // Событие: вечеринка. Создайте класс Party, который описывает вечеринку. У него должны быть свойства location (String) и attendees (Int). Добавьте метод details(), который выводит информацию о месте проведения и количестве гостей.
    class Party(val location: String, val attendees: Int) {
        fun details() {
            println("Party at $location with $attendees guests.")
        }
    }
    val party = Party("Club Downtown", 50)
    party.details()

    // Аспект реальности: эмоция. Создайте класс Emotion, который представляет эмоцию. У него должно быть свойство type (String) и intensity (Int). Добавьте метод express(), который выводит описание эмоции в зависимости от её типа и интенсивности.
    class Emotion(val type: String, val intensity: Int) {
        fun express() {
            println("Feeling $type with intensity $intensity.")
        }
    }
    val emotion = Emotion("Happiness", 8)
    emotion.express()

    // Природное явление: луна. Создайте объект Moon, который будет представлять Луну. Добавьте свойства isVisible (Boolean), чтобы отображать, видна ли Луна в данный момент, и phase (String), чтобы отображать текущую фазу Луны (например, "Full Moon", "New Moon"). Добавьте метод showPhase(), который выводит текущую фазу Луны.


    // Покупка: продукт. Создайте дата класс для продукта, который будет представлять продукт в магазине. У него должны быть свойства “название”, “цена”, “количество”.
    data class Product(val name: String, val price: Double, val quantity: Int)
    val product = Product("Apple", 0.5, 10)
    println(product)

    // Мероприятие: концерт. Создайте класс, который будет представлять концерт. У него должны быть свойства “группа”, “место проведения”, “стоимость”, “вместимость зала”. Также приватное поле “проданные билеты”. Добавьте метод, который выводит информацию о концерте и метод “купить билет”, который увеличивает количество проданных билетов на один.
    class Concert(val band: String, val venue: String, val ticketPrice: Double, val capacity: Int) {
        private var ticketsSold: Int = 0

        fun concertInfo() {
            println("Concert by $band at $venue, ticket price: $$ticketPrice, capacity: $capacity, tickets sold: $ticketsSold")
        }

        fun buyTicket() {
            ticketsSold += 1
            println("Ticket purchased. Total sold: $ticketsSold")
        }
    }
    val concert = Concert("Rock Band", "Arena", 25.0, 500)
    concert.concertInfo()
    concert.buyTicket()
    concert.concertInfo()
}