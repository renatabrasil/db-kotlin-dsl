package com.edu.dbkotlindsl.services.impl

import com.edu.dbkotlindsl.domain.Employee
import com.edu.dbkotlindsl.repository.EmployeeRepository
import com.edu.dbkotlindsl.services.GetEmployeeByIdService
import java.util.*

class GetEmployeeByIdServiceImpl(
    private val employeeRepository: EmployeeRepository
): GetEmployeeByIdService {
    override fun findById(employeeId: String): Optional<Employee> {
        return employeeRepository.findById(employeeId)
    }
}