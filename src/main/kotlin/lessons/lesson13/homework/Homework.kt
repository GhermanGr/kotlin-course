package org.example.lessons.lesson13.homework

fun main() {
    // Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах. Определите среднее время выполнения теста.
    val testExecutionTimes = mapOf(
        "loginTest" to 3.5,
        "searchTest" to 6.2,
        "paymentTest" to 8.1
    )
    var testsExecutionTimeAverage = testExecutionTimes.values.average()
    println(testsExecutionTimeAverage)

// Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов а значения - строка с метаданными. Выведите список всех тестовых методов.
    val testMetadata = mapOf(
        "authTest" to "low",
        "filterTest" to "medium",
        "checkoutTest" to "high"
    )
    val testMethods = testMetadata.keys.toList()
    println(testMethods)

// В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    val testResults = mutableMapOf(
        "loginTest" to "passed",
        "searchTest" to "failed",
        "profileTest" to "passed"
    )
    testResults.put("settingsTest", "skipped")
    println(testResults)

// Посчитайте количество успешных тестов в словаре с результатами (ключ - название, значение - результат из passed, failed, skipped).
    val testStatusMap = mapOf(
        "authTest" to "passed",
        "cartTest" to "passed",
        "apiTest" to "failed",
        "paymentTest" to "skipped"
    )
    val passedCount = testStatusMap.values.count { it == "passed" } // Fixed syntax error from original
    println(passedCount)

// Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен.
    val bugTracking = mutableMapOf(
        "bugLogin" to "fixed",
        "bugSearch" to "open",
        "bugProfile" to "inProgress"
    )
    bugTracking.remove("bugLogin")
    println(bugTracking)

// Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа), выведите сообщение о странице и статусе её проверки.
    val pageStatus = mapOf(
        "/home" to "200 OK",
        "/shop" to "404 Not Found",
        "/profile" to "500 Error"
    )
    for ((url, status) in pageStatus) {
        println("Page $url has status: $status")
    }

// Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
    val serviceResponseTimes = mapOf(
        "apiLogin" to 2.8,
        "apiSearch" to 7.4,
        "apiProfile" to 4.3
    )
    val threshold = 5.0
    val slowServices = serviceResponseTimes.filter { it.value > threshold }
    println(slowServices)

// В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в виде строки). Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    val apiResponseStatus = mapOf(
        "/api/login" to "200 OK",
        "/api/search" to "400 Bad Request",
        "/api/profile" to "503 Service Unavailable"
    )
    val endpoint = "/api/cart"
    val status = apiResponseStatus[endpoint] ?: "Not tested"
    println("Endpoint $endpoint: $status")

// Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации, значение - сама конфигурация), получите значение для "browserType". Ответ не может be null.
    val testConfig = mapOf(
        "browserType" to "Firefox",
        "timeout" to "20",
        "headless" to "false"
    )
    val browserType = testConfig["browserType"] // Known to exist, so no null check needed
    println(browserType)

// Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
    val softwareVersions = mapOf(
        "version1.0" to "stable",
        "version1.1" to "beta",
        "version1.2" to "alpha"
    )
    val updatedVersions = softwareVersions + mapOf("version1.3" to "experimental")
    println(updatedVersions)

// Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства, значение - строка с настройками), получите настройки для конкретной модели или верните настройки по умолчанию.
    val deviceSettings = mapOf(
        "iPhone12" to "retina,1080p",
        "SamsungS20" to "amoled,720p",
        "Pixel5" to "oled,1080p"
    )
    val model = "iPhone13"
    val settings = deviceSettings[model] ?: "default,1080p"
    println("Settings for $model: $settings")

// Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки, значение - описание ошибки) определенный код ошибки.
    val errorCodes = mapOf(
        "ERR001" to "Syntax Error",
        "ERR002" to "Null Reference",
        "ERR003" to "Timeout"
    )
    val errorCode = "ERR002"
    val hasError = errorCodes.containsKey(errorCode)
    println("Error code $errorCode exists: $hasError")

// Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version", а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped"). Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов.
    val testScenarios = mapOf(
        "TestID_V1.0" to "Passed",
        "TestID_V1.1" to "Failed",
        "TestID_V2.0" to "Skipped"
    )
    val version = "V1"
    val filteredScenarios = testScenarios.filter { it.key.contains(version) }
    println(filteredScenarios)

// У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.
    val moduleTestResults = mapOf(
        "loginModule" to "passed",
        "paymentModule" to "failed",
        "searchModule" to "passed"
    )
    val hasFailed = moduleTestResults.values.any { it == "failed" }
    println("Has failed modules: $hasFailed")

// Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    val testEnvironment = mutableMapOf(
        "env" to "staging",
        "logLevel" to "info"
    )
    val additionalSettings = mapOf(
        "timeout" to "50",
        "retryCount" to "2"
    )
    testEnvironment.putAll(additionalSettings)
    println(testEnvironment)

// Объедините два неизменяемых словаря с данными о багах.
    val bugReport1 = mapOf(
        "bug001" to "open",
        "bug002" to "fixed"
    )
    val bugReport2 = mapOf(
        "bug003" to "inProgress",
        "bug004" to "open"
    )
    val combinedBugs = bugReport1 + bugReport2
    println(combinedBugs)

// Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    val testRunData = mutableMapOf(
        "run001" to "completed",
        "run002" to "aborted",
        "run003" to "running"
    )
    testRunData.clear()
    println(testRunData)

// Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”).
    val testReport = mapOf(
        "loginTest" to "passed",
        "searchTest" to "skipped",
        "paymentTest" to "failed"
    )
    val filteredReport = testReport.filter { it.value != "skipped" }
    println(filteredReport)

// Создайте копию словаря с конфигурациями тестирования, удалив из него несколько конфигураций.
    val testConfigurations = mapOf(
        "theme" to "light",
        "timeout" to "30",
        "mode" to "normal"
    )
    val reducedConfigurations = testConfigurations - listOf("theme", "mode")
    println(reducedConfigurations)

// Создайте отчет о тестировании, преобразовав словарь с результатами тестирования (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
    val testResultsReport = mapOf(
        "test001" to "passed",
        "test002" to "failed",
        "test003" to "skipped"
    )
    val reportLines = testResultsReport.map { "Test ${it.key}: ${it.value}" }
    println(reportLines)

// Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
    val testArchive = mutableMapOf(
        "archiveTest1" to "passed",
        "archiveTest2" to "failed"
    )
    val immutableArchive = testArchive.toMap()
    println(immutableArchive)

// Преобразуйте словарь, содержащий числовой ID теста и данные о времени выполнения тестов, заменив идентификаторы тестов на их строковый аналог.
    val testIdTimes = mapOf(
        1001 to 5.0,
        1002 to 7.8,
        1003 to 4.2
    )
    val stringIdTimes = testIdTimes.mapKeys { it.key.toString() }
    println(stringIdTimes)

// Для словаря с оценками производительности различных версий приложения (ключи - строковая версия, значения - дробное число времени ответа сервера) увеличьте каждую оценку на 10%.
    val appPerformance = mapOf(
        "version1.0" to 2.5,
        "version2.0" to 4.8,
        "version3.0" to 3.3
    )
    val adjustedPerformance = appPerformance.mapValues { it.value * 1.1 }
    println(adjustedPerformance)

// Проверьте, пуст ли словарь с ошибками компиляции тестов.
    val compileErrors = mapOf(
        "ERR101" to "Syntax Error",
        "ERR102" to "Linker Error"
    )
    val isEmpty = compileErrors.isEmpty()
    println("Compile errors empty: $isEmpty")

// Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
    val loadTestResults = mapOf(
        "loadTest1" to "stable",
        "loadTest2" to "unstable"
    )
    val isNotEmpty = loadTestResults.isNotEmpty()
    println("Load test results not empty: $isNotEmpty")

// Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
    val automatedTestResults = mapOf(
        "autoTest1" to "passed",
        "autoTest2" to "passed",
        "autoTest3" to "failed"
    )
    val allPassed = automatedTestResults.values.all { it == "passed" }
    println("All tests passed: $allPassed")

// Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
    val testOutcomeMap = mapOf(
        "testLogin" to "passed",
        "testSearch" to "failed",
        "testProfile" to "skipped"
    )
    val hasError1 = testOutcomeMap.values.any { it == "failed" }
    println("Has failed tests: $hasError1")

// Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно и содержат в названии “optional”.
    val testFilterMap = mapOf(
        "optionalLoginTest" to "failed",
        "coreFeatureTest" to "passed",
        "optionalSearchTest" to "failed"
    )
    val failedOptionalTests = testFilterMap.filter { it.key.contains("optional") && it.value != "passed" }
    println(failedOptionalTests)
}