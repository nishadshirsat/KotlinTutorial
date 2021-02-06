package com.kotlintutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    var a:Int = 10;
    var b:Int = 30;

    lateinit var value: String

    var listArray: List<String> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var max = if (a > b) a else b

        print("Maximum number is $max")

//        TextDisplay.text = max.toString()

        when(max){
            10 ->  value = "max is value 10"
            30 ->  value = "max is value 30"
            else -> value = "max is neither 10 or 30"
        }


//        val person = Person("Nishad SHirsat",27)
        val person = Person("Nishad SHirsat",27,"This is test Message")
//        TextDisplay.text = "${person.message}  ${person.Name}  ${person.age}"


        //Destructuring of class declared as data class
        val student = Student("styletouchlife.com","Fashion")
        val (name,subject) = student
//        TextDisplay.text = "${name}  ${subject}"

        var dataClass =  DataClass()
        dataClass.FullName = "Nishad Shirsat"
        dataClass.Username = "nishadcool"
        dataClass.Password = "Nishad13"
        dataClass.Education = "MTECH"

        TextDisplay.text = "${dataClass.FullName}  ${dataClass.Education} "

    }

    fun doubleValue(value:Int): Int {
        return value * 2
    }

    fun breakContinue(){

        myLabel@ for (x in 1 .. 20){

            if (x == 5){TextDisplay.text = "I am inside the block";
                break@myLabel}
            else continue@myLabel


        }
    }
}
