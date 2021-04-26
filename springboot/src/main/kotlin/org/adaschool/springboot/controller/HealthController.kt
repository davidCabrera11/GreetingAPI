package org.adaschool.springboot.controller

import org.adaschool.springboot.service.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping("/health")
class HealthController(@Autowired val greetingService: GreetingService) {


    @GetMapping()
    fun greet(): String{
        return "Server is running ok"
    }




}