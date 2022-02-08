package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("result",":---->"+sum(10,50));
        var number = 36
        // here Math.sqrt is predefined function
        var result = Math.sqrt(number.toDouble())
        Log.e("result",":---->"+result);

    }
/*User defined function   */
//function will always created by fun keyword
    fun sum(number1: Int, number2:Int): Int{
        val add = number1+number2
        return add
    }
}