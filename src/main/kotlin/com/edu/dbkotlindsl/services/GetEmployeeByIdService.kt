package com.edu.dbkotlindsl.services

import com.edu.dbkotlindsl.domain.Employee
import java.util.Optional

interface GetEmployeeByIdService {
    fun findById(employeeId: String): Optional<Employee>
}