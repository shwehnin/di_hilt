package com.hninhninwai.xyz.hiltapp

import javax.inject.Inject

// Handle providing a greeting message
class GreetingRepository @Inject constructor(){
    fun sayHello() : String{
        return "Hello from Hilt"
    }
}