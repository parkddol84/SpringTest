package com.example.web_test_kotlin2

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong


@RestController
class GreetingController {
    val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value="name", defaultValue = "World") name: String): Greeting {
        println("hello world")

        return Greeting(counter.incrementAndGet(), "Hello, $name")
    }

}