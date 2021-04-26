package org.adaschool.springboot.service

import org.adaschool.springboot.model.Greeting

interface GreetingService {


    fun findByGreetingId(id: String): Greeting?

    fun save(greeting: Greeting): Greeting




}