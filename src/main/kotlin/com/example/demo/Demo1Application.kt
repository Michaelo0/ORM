package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class Demo1Application

fun main(args: Array<String>) {
    runApplication<Demo1Application>(*args)
}
