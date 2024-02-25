package com.edu.dbkotlindsl.model.repositories

import com.edu.dbkotlindsl.model.domain.Employee
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.PagingAndSortingRepository

interface EmployeeRepository : PagingAndSortingRepository<Employee, String>, CrudRepository<Employee, String> {
}