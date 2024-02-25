package com.edu.dbkotlindsl

import com.edu.dbkotlindsl.controllers.EmployeeHandler
import com.edu.dbkotlindsl.services.impl.ListEmployeesServiceImpl
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.support.beans

@SpringBootApplication
class DbKotlinDslApplication

fun main(args: Array<String>) {
    runApplication<DbKotlinDslApplication>(*args) {
        addInitializers(
            beans {
                bean<EmployeeHandler>()
                bean<ListEmployeesServiceImpl>()
                bean(::routers)
            }
        )
    }
}
