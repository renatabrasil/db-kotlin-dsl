package com.edu.dbkotlindsl.repository

import com.edu.dbkotlindsl.domain.Employee
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.PagingAndSortingRepository

interface EmployeeRepository : PagingAndSortingRepository<Employee, String>, CrudRepository<Employee, String> {
}