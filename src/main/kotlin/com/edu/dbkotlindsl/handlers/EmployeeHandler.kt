package com.edu.dbkotlindsl.handlers

import com.edu.dbkotlindsl.services.GetEmployeeByIdService
import com.edu.dbkotlindsl.services.ListEmployeesService
import org.springframework.web.servlet.function.ServerRequest
import org.springframework.web.servlet.function.ServerResponse

class EmployeeHandler(
    private val listEmployeeServiceImpl: ListEmployeesService,
    private val getEmployeeByIdServiceImpl: GetEmployeeByIdService,
) {
    fun listEmployees(serverRequest: ServerRequest): ServerResponse {

        return ServerResponse.ok().body(listEmployeeServiceImpl.listEmployees())
    }

    fun getEmployee(serverRequest: ServerRequest) =
        ServerResponse.ok().body(getEmployeeByIdServiceImpl.findById(serverRequest.pathVariable("employeeId")))

}