package com.edu.dbkotlindsl.services

import com.edu.dbkotlindsl.model.domain.Employee
import org.springframework.data.domain.Page

interface ListEmployeesService {
    fun listEmployees() : Page<Employee>
}