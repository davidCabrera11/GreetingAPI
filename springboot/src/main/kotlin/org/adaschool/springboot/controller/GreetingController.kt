package org.adaschool.springboot.controller

import org.adaschool.springboot.model.Greeting
import org.adaschool.springboot.service.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.concurrent.atomic.AtomicLong


@RestController
@RequestMapping("/greeting")
class GreetingController(@Autowired val greetingService: GreetingService) {


    @GetMapping("/{id}")
    fun findGreetingById(@PathVariable id:String):Greeting?{
        println("Find Greeting with Id: $id")

        return greetingService.findByGreetingId(id)

    }

    @PostMapping
    fun saveGreeting(@RequestBody greeting: Greeting):Greeting?{
        println("Post saveGreeting function called")
        return greetingService.save(greeting)

    }



}