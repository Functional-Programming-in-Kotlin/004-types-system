package com.example.types_system

enum class Weather {
    rainy,
    windy,
    sunny,
    snowy
}

fun navigateToNextScreen(weather: Weather) {

    when(weather) {
        Weather.rainy -> println("go to buy an umbrella")
        Weather.windy -> println("go to buy a coffe")
        Weather.sunny -> println("go to buy an ice cream")
    }
}

fun main(args: Array<String>) {
//    print(Rainy().label)
    navigateToNextScreen(Weather.windy)
}