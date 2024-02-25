package com.edu.dbkotlindsl.controllers

import com.edu.dbkotlindsl.services.ListEmployeesService
import org.springframework.web.servlet.function.ServerRequest
import org.springframework.web.servlet.function.ServerResponse

class EmployeeHandler (
    private val listEmployeeServiceImpl: ListEmployeesService
){
    fun listEmployees(serverRequest: ServerRequest) : ServerResponse {

        return ServerResponse.ok().body(listEmployeeServiceImpl.listEmployees())
    }

}