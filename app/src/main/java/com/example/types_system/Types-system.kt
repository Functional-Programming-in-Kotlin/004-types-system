package com.example.types_system

sealed class Weather(emoji: String) {
    val label = "Weather is $emoji"
}

class  Rainy : Weather("🌧")

class  Windy : Weather("💨")

class  Sunny : Weather("☀️")

class  Snowy : Weather("🌨️")

fun navigateToNextScreen(weather: Weather) =
    when(weather) {
        is Rainy -> println("go to buy an umbrella")
        is Windy -> println("go to buy a coffe")
        is Sunny -> println("go to buy an ice cream")
        is Snowy -> println("go to buy a snowboard")
    }

fun main(args: Array<String>) {
//    print(Rainy().label)
    navigateToNextScreen(Rainy())
}