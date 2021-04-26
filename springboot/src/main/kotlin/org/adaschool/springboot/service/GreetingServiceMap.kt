package org.adaschool.springboot.service

import org.adaschool.springboot.model.Greeting
import org.springframework.stereotype.Service

@Service
class GreetingServiceMap:GreetingService {

    private val greetingsMap = HashMap<String, Greeting>()


    override fun findByGreetingId(id: String): Greeting? {
        println("Find greeting id by Hash Map")

        return if (greetingsMap.containsKey(id))
            greetingsMap[id]
        else
            null

    }

    override fun save(greeting: Greeting): Greeting {
        println("Save greeting id by Hash Map")
        greetingsMap[greeting.id] = greeting
        return greeting

     }
}