package com.example.myapplication.data

enum class answerMeaning(val number: Int) {
    CORRECT(0),
    VISUAL(1),
    TECHNIC(2),
    ENGLISH(3),
    MATH(4)

}

data class AstronautAnswer
    (
    val answer: String,
    val meaning: answerMeaning
    )