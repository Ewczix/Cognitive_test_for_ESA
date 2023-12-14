package com.example.myapplication

import com.example.myapplication.network.LeaderboardScore

class MockupData {
    fun loadMockup(): List<LeaderboardScore>{
        return listOf(
            LeaderboardScore(1,"sffaf", 100.0F),
            LeaderboardScore(2,"sgrdfaf", 100.0F),
            LeaderboardScore(3,"sfjdjaf", 100.0F),
            LeaderboardScore(4,"sfshthaf", 100.0F),
            LeaderboardScore(5,"shsfaf", 100.0F),
            LeaderboardScore(6,"sfthsf", 100.0F),
            LeaderboardScore(7,"sataf", 100.0F),
            LeaderboardScore(8,"smchf", 100.0F),
            LeaderboardScore(9,"xmgmxaf", 100.0F),
            LeaderboardScore(10,"xftmfaf", 100.0F),
        )
    }
}