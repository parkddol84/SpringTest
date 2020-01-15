package com.example.web_test_kotlin2

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping
    fun helloWorld() = "Hello world SeungJe"

}