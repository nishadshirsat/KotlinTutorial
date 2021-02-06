package com.kotlintutorial

class Person(val Name:String, var age: Int) {


    val message:String  = "Hey!!!"

    constructor( Name:String, age: Int, message: String):this(Name,age){

    }

}