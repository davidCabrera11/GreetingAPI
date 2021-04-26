package org.adaschool.springboot.service

import org.adaschool.springboot.model.Greeting
import org.springframework.stereotype.Service

class GreetingServiceArrayList:GreetingService {

    private val greetingsList = ArrayList<Greeting>()


    override fun findByGreetingId(id: String): Greeting? {

        println("Find greeting by id Array List")
        return greetingsList.find {it.id == id}

    }

    override fun save(greeting: Greeting): Greeting {
        greetingsList.add(greeting)
        println("Save greeting by id Array List")
        return greeting

    }
}