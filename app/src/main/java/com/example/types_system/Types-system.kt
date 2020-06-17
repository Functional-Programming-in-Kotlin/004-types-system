package com.example.types_system
open class Weather(emoji: String) {
    val label = "Weather is $emoji"
}

class Rainy: Weather("🌧")

class Windy: Weather("💨")

class Sunny: Weather("☀️")

class MyEvilWeather: Weather("😈")

fun navigateToNextScreen(weather: Weather) {

    if (weather is Rainy) {
        println("go to buy an umbrella")
    }
    if (weather is Windy) {
        println("go to buy a coffe")
    }
    if (weather is Sunny) {
        println("go to buy an ice cream")
    }
}

fun main(args: Array<String>) {
//    print(Rainy().label)
    navigateToNextScreen(Rainy())
}