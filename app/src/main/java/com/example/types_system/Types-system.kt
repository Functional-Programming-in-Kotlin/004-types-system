package com.example.types_system
open class Weather(emoji: String) {
    val label = "Weather is $emoji"
}

class Rainy: Weather("🌧")

class Windy: Weather("💨")

class Sunny: Weather("☀️")

fun main(args: Array<String>) {
    print(Rainy().label)
}