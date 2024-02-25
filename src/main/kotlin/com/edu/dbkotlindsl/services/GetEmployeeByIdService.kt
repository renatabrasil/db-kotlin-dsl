package com.edu.dbkotlindsl.services

import com.edu.dbkotlindsl.model.domain.Employee
import java.util.Optional

interface GetEmployeeByIdService {
    fun findById(employeeId: String): Optional<Employee>
}