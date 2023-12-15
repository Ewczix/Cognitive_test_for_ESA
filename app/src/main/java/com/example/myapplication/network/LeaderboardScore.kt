package com.example.myapplication.network

data class LeaderboardScore(val id: Int, val name: String, val score: Float) {
    var scoreString : String = score.toString()
}