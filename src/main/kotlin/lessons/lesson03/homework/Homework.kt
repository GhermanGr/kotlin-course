package org.example.lessons.lesson03.homework

// 1. Название мероприятия
val eventName: String = "Giga Hackaton Pro"

// 2. Дата проведения
var eventDate: String = "September 14th 2025"

// 3. Место проведения
var venueAddress: String = "Red Triangle, Saint-Petersburg"

// 4. Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы.
private var detailedEventBudget: String = "Detailed event budget information"

// 5. Количество участников
var participantsNumber: Byte = 56

// 6. Длительность хакатона
val eventLengthHours: Byte = 48

// 7. Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
private var partnerAgreements: String = "Contact information and agreements with event partners"

// 8. Текущее состояние хакатона (статус)
var eventInProgress: Boolean = true

// 9. Список спонсоров
var sponsorList: List<String> = listOf("sponsorOne", "sponsorTwo")

// 10. Бюджет мероприятия
private var eventBudget: String = "General event budget information"

// 11. Текущий уровень доступа к интернету
var currentInternetAvailability: Boolean = false

// 12. Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
private var logisticsInfo: String = "Info on logistics and coordination"

// 13. Количество команд
var teamNumber: Byte = 14

// 14. Перечень задач
private var taskList: List<String> = listOf("taskrOne", "taskTwo")

// 15. План эвакуации (зависит от места проведения мероприятия, которое может смениться)
var evacuationPlan: String = "Evacuation plan" +
        ""
// 16. Список доступного оборудования (всё, что выделено для использования на мероприятии)
private var availableEquipmentList: List<String> = listOf("equipmentOne", "equipmentTwo")

// 17. Список свободного оборудования (всё, что можно взять прямо сейчас и что не занято другими участниками)
private var freeEquipmentList: List<String> = listOf("equipmentOne", "equipmentTwo")

// 18. График питания участников (зависит от поставщика питания, определяемого за неделю до начала)
lateinit var mealSchedule: String

// 19. План мероприятий на случай сбоев
private var emergencyEventPlan: String = "Emergency event plan"

// 20. Список экспертов и жюри
var judgesList: List<String> = listOf("judgetOne", "judgeTwo")

// 21. Политика конфиденциальности
val confidentialityPolicy: String = "Confidentiality Policy"

// 22. Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
private var participantAudienceFeedback: String = "Feedback of the audience and the participants"

// 23. Текущая температура в помещении
private var currentVenueTempCelcius: Byte = 22

// 24. Данные мониторинга и анализ производительности сетевого оборудования и интернет-соединения для целей отладки своих приложений командами
private var networkPerformanceMetrics: String = "Network performance metrics"

// 25. Регулятор скорости интернета (понижающий коэффициент, например 0.5)
private var internetSpeedRugulator: Float = 0.5f

// 26. Уровень освещения
private var currentLightingLevel: String = "Strong"

// 27. Лог событий мероприятия
private var eventLog: String = "Event log"

// 28. Возможность получения медицинской помощи прямо на мероприятии (да/нет)
var medicalAidAvailability: Boolean = true

// 29. Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
var emergencyPlans: String = "Emergency plans"

// 30. Регистрационный номер мероприятия
private val eventRegistrationNumber: String = "#10124o1fo10f1"

// 31. Максимально допустимый уровень шума в помещении хакатона. (обосновано единым законодательством)
val allowedNoiseLevel: Float = 140.0f

// 32. Индикатор превышения уровня шума в помещениях (превышен или не превышен в данный момент)
var allowedNoiseLevelExceeded: Boolean = false

// 33. План взаимодействия с прессой
private var pressManagementPlan: String = "Press management plan"

// 34. Детальная публичная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.
lateinit var detailedTeamProjectInfo: String

// 35. Статус получения всех необходимых разрешений для проведения мероприятия
var eventPermissionStatus: Boolean = true

// 36. Индикатор доступности специализированного оборудования в данный момент (например, специальному оборудованию)
private var specialEquipmentAvailability: Boolean = true

// 37. Список партнеров мероприятия
var partnerList: List<String> = listOf("partnerOne", "partnerTwo")

// 38. Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
lateinit var eventReport: String

// 39. Внутренние правила распределения призов
private var awardRules: String = "Awsrd rules"

// 40. Список разыгрываемых призов
var awardList: List<String> = listOf("awardOne", "awardTwo")

// 41. Контактная информация экстренных служб, медицинского персонала и других важных служб, для внутреннего пользования.
private val emergencyContacts: String = "Emergency contacts"

// 42. Особые условия для участников с ограниченными возможностями
var disabledPartisipantsRules: String = "Disabled participants rules"

// 43. Общее настроение участников (определяется опросами)
private lateinit var moodFeedback: String

// 44. Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия, так как зависит от фактического состава команд и взятых в работу задач.
lateinit var evenDetailedPlan: String

// 45. Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия, но в момент инициализации неизвестно.
lateinit var celebrityName: String

// 46. Максимальное количество людей, которое может вместить место проведения. (зависит от места проведения, которое может меняться)
var maxVenueCapacity: Int = 2000

// 47. Количество часов, отведенное каждой команде для работы над проектом.
val competitionLengthHours: Byte = 32