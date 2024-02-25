package com.edu.dbkotlindsl

import com.edu.dbkotlindsl.controllers.EmployeeHandler
import org.springframework.http.MediaType
import org.springframework.web.servlet.function.router

fun routers(
    employeeHandler: EmployeeHandler
) = router {
    accept(MediaType.APPLICATION_JSON).nest {
        "/employees".nest {
            GET("", employeeHandler::listEmployees)
        }
    }
}