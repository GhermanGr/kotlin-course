package org.example.lessons.lesson05.homework

fun main() {
    // task 1
    val startingSoundIntensity: Double = 10.0
    val attenuationCoefficient: Double? = 0.9
    val baseCoefficient = 0.5
    val resultSoundIntensity = startingSoundIntensity * (attenuationCoefficient ?: baseCoefficient)

    // task 2
    val deliveryCost: Double = 14.21
    val productCostForInsurance: Double? = 120.75
    val productInsuranceCoefficient = 0.005
    val productInsuranceCost = productInsuranceCoefficient * (productCostForInsurance ?: 50.0)
    val totalDeliveryCost = deliveryCost + productInsuranceCost

    // task 3
    val atmosphericPressure: String? = "101,325"
    val atmosphericPressureNullMessage = "The data was atmospheric pressure was lost"
    val atmosphericPressureReport = atmosphericPressure ?: atmosphericPressureNullMessage
}