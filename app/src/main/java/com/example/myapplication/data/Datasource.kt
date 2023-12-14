package com.example.myapplication.data

import com.example.myapplication.R

class Datasource {

    fun loadPlates(): MutableList<AstronautTest>{
        return mutableListOf<AstronautTest>(
            AstronautTest(1, R.drawable.plate1 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.CORRECT),
                AstronautAnswer("B",answerMeaning.TECHNIC),
                AstronautAnswer("C", answerMeaning.TECHNIC)
            )),
            AstronautTest(2, R.drawable.plate2 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.VISUAL),
                AstronautAnswer("B",answerMeaning.CORRECT),
                AstronautAnswer("C", answerMeaning.VISUAL)
            )),
            AstronautTest(3, R.drawable.plate3 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.CORRECT),
                AstronautAnswer("B",answerMeaning.VISUAL),
                AstronautAnswer("C", answerMeaning.VISUAL)
            )),
            AstronautTest(4, R.drawable.plate4 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.VISUAL),
                AstronautAnswer("B",answerMeaning.CORRECT),
                AstronautAnswer("C", answerMeaning.VISUAL)
            )),
            AstronautTest(5, R.drawable.plate5 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.VISUAL),
                AstronautAnswer("B",answerMeaning.VISUAL),
                AstronautAnswer("C", answerMeaning.CORRECT)
            )),
            AstronautTest(6, R.drawable.plate6 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.VISUAL),
                AstronautAnswer("B",answerMeaning.VISUAL),
                AstronautAnswer("C", answerMeaning.CORRECT)
            )),
            AstronautTest(7, R.drawable.plate7 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.VISUAL),
                AstronautAnswer("B",answerMeaning.CORRECT),
                AstronautAnswer("C", answerMeaning.VISUAL)
            )),
            AstronautTest(8, R.drawable.plate8 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.TECHNIC),
                AstronautAnswer("B",answerMeaning.CORRECT),
                AstronautAnswer("C", answerMeaning.TECHNIC)
            )),
            AstronautTest(9, R.drawable.plate9 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.TECHNIC),
                AstronautAnswer("B",answerMeaning.TECHNIC),
                AstronautAnswer("C", answerMeaning.CORRECT)
            )),
            AstronautTest(10, R.drawable.plate10, listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.TECHNIC),
                AstronautAnswer("B",answerMeaning.CORRECT),
                AstronautAnswer("C", answerMeaning.TECHNIC)
            )),
            AstronautTest(11, R.drawable.plate11 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.TECHNIC),
                AstronautAnswer("B",answerMeaning.CORRECT),
                AstronautAnswer("C", answerMeaning.TECHNIC)
            )),
            AstronautTest(12, R.drawable.plate12 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.CORRECT),
                AstronautAnswer("B",answerMeaning.TECHNIC),
                AstronautAnswer("C", answerMeaning.TECHNIC)
            )),
            AstronautTest(13, R.drawable.plate13 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.CORRECT),
                AstronautAnswer("B",answerMeaning.TECHNIC),
                AstronautAnswer("C", answerMeaning.TECHNIC)
            )),
            AstronautTest(14, R.drawable.plate14 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.CORRECT),
                AstronautAnswer("B",answerMeaning.TECHNIC),
                AstronautAnswer("C", answerMeaning.TECHNIC)
            )),
            AstronautTest(15, R.drawable.plate15 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.TECHNIC),
                AstronautAnswer("B",answerMeaning.CORRECT),
                AstronautAnswer("C", answerMeaning.TECHNIC)
            )),
            AstronautTest(16, R.drawable.plate16 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.CORRECT),
                AstronautAnswer("B",answerMeaning.TECHNIC),
                AstronautAnswer("C", answerMeaning.TECHNIC)
            )),
            AstronautTest(17, R.drawable.plate17 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.CORRECT),
                AstronautAnswer("B",answerMeaning.TECHNIC),
                AstronautAnswer("C", answerMeaning.TECHNIC)
            )),
            AstronautTest(18, R.drawable.plate18 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.CORRECT),
                AstronautAnswer("B",answerMeaning.TECHNIC),
                AstronautAnswer("C", answerMeaning.TECHNIC)
            )),
            AstronautTest(19, R.drawable.plate19 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.CORRECT),
                AstronautAnswer("B",answerMeaning.ENGLISH),
                AstronautAnswer("C", answerMeaning.ENGLISH)
            )),
            AstronautTest(20, R.drawable.plate20 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.ENGLISH),
                AstronautAnswer("B",answerMeaning.CORRECT),
                AstronautAnswer("C", answerMeaning.ENGLISH)
            )),
            AstronautTest(21, R.drawable.plate21 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.ENGLISH),
                AstronautAnswer("B",answerMeaning.ENGLISH),
                AstronautAnswer("C", answerMeaning.CORRECT)
            )),
            AstronautTest(22, R.drawable.plate22 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.CORRECT),
                AstronautAnswer("B",answerMeaning.ENGLISH),
                AstronautAnswer("C", answerMeaning.ENGLISH)
            )),
            AstronautTest(23, R.drawable.plate23 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.ENGLISH),
                AstronautAnswer("B",answerMeaning.CORRECT),
                AstronautAnswer("C", answerMeaning.ENGLISH)
            )),
            AstronautTest(24, R.drawable.plate24 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.CORRECT),
                AstronautAnswer("B",answerMeaning.ENGLISH),
                AstronautAnswer("C", answerMeaning.ENGLISH)
            )),
            AstronautTest(25, R.drawable.plate25 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.CORRECT),
                AstronautAnswer("B",answerMeaning.ENGLISH),
                AstronautAnswer("C", answerMeaning.ENGLISH)
            )),
            AstronautTest(26, R.drawable.plate26 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.ENGLISH),
                AstronautAnswer("B",answerMeaning.ENGLISH),
                AstronautAnswer("C", answerMeaning.CORRECT)
            )),
            AstronautTest(27, R.drawable.plate27 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.ENGLISH),
                AstronautAnswer("B",answerMeaning.ENGLISH),
                AstronautAnswer("C", answerMeaning.CORRECT)
            )),
            AstronautTest(28, R.drawable.plate28 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.ENGLISH),
                AstronautAnswer("B",answerMeaning.CORRECT),
                AstronautAnswer("C", answerMeaning.ENGLISH)
            )),
            AstronautTest(29, R.drawable.plate29 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.ENGLISH),
                AstronautAnswer("B",answerMeaning.CORRECT),
                AstronautAnswer("C", answerMeaning.ENGLISH)
            )),
            AstronautTest(30, R.drawable.plate30 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.CORRECT),
                AstronautAnswer("B",answerMeaning.ENGLISH),
                AstronautAnswer("C", answerMeaning.ENGLISH)
            )),
            AstronautTest(31, R.drawable.plate31 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.CORRECT),
                AstronautAnswer("B",answerMeaning.MATH),
                AstronautAnswer("C", answerMeaning.MATH)
            )),
            AstronautTest(32, R.drawable.plate32 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.MATH),
                AstronautAnswer("B",answerMeaning.CORRECT),
                AstronautAnswer("C", answerMeaning.MATH)
            )),
            AstronautTest(33, R.drawable.plate33 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.MATH),
                AstronautAnswer("B",answerMeaning.MATH),
                AstronautAnswer("C", answerMeaning.CORRECT)
            )),
            AstronautTest(34, R.drawable.plate34 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.MATH),
                AstronautAnswer("B",answerMeaning.MATH),
                AstronautAnswer("C", answerMeaning.CORRECT)
            )),
            AstronautTest(35, R.drawable.plate35 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.MATH),
                AstronautAnswer("B",answerMeaning.CORRECT),
                AstronautAnswer("C", answerMeaning.MATH)
            )),
            AstronautTest(36, R.drawable.plate36 , listOf<AstronautAnswer>(
                AstronautAnswer("A", answerMeaning.MATH),
                AstronautAnswer("B",answerMeaning.MATH),
                AstronautAnswer("C", answerMeaning.CORRECT)
            )),

    }
}