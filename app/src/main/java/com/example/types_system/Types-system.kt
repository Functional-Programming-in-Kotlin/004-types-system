package com.example.types_system

enum class Weather {
    rainy,
    windy,
    sunny
}

fun navigateToNextScreen(weather: Weather) {

    when(weather) {
        is Rainy -> println("go to buy an umbrella")
        is Windy -> println("go to buy a coffe")
        is Sunny -> println("go to buy an ice cream")
        // This is de problem, we need add this
        else -> println("don't know where to go")
    }
}

fun main(args: Array<String>) {
//    print(Rainy().label)
    navigateToNextScreen(Rainy())
}