package com.example.todoapi.controller

import com.example.todoapi.TodoApiApplication
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext

@SpringBootTest(classes = [TodoApiApplication::class])
class HelloWorldControllerTest {

    private lateinit var mvc: MockMvc

    @Autowired
    private lateinit var context: WebApplicationContext

    @BeforeEach
    fun setup() {
        mvc = MockMvcBuilders.webAppContextSetup(context).build()
    }

    @Test
    fun test() {
        val response = mvc.perform(MockMvcRequestBuilders.get("/helloworld"))

        response.andExpect(status().isOk)
            .andExpect(content().json("{ \"message\": \"Hello World\" }"))
    }
}