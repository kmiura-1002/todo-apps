package com.example.todoapi.controller

import com.example.todoapi.controller.dto.HelloWorldDto
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping("/helloworld")
    fun sayHello(): ResponseEntity<HelloWorldDto> {
        return ResponseEntity.ok(
            HelloWorldDto(message = "Hello World")
        )
    }
}