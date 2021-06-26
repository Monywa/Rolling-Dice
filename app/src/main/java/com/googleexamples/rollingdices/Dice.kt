package com.googleexamples.rollingdices

class Dice(val rollNum:Int) {
    fun roll():Int{
        return (1..rollNum).random()
    }
}