package com.edu.dbkotlindsl.services.impl

import com.edu.dbkotlindsl.model.domain.Employee
import com.edu.dbkotlindsl.model.repositories.EmployeeRepository
import com.edu.dbkotlindsl.services.ListEmployeesService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable

class ListEmployeesServiceImpl(
    private val employeeRepository: EmployeeRepository
): ListEmployeesService
{
    override fun listEmployees(): Page<Employee> {
        return employeeRepository.findAll(Pageable.unpaged())
    }

}