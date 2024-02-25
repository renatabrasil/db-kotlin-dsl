package com.edu.dbkotlindsl.domain

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*

@Entity
data class Employee(
    @Id
    val id: String? = UUID.randomUUID().toString(),
    val name: String,
)
