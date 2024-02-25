package com.edu.dbkotlindsl.model.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.time.ZonedDateTime
import java.util.*

@Entity
data class Employee(
    @Id
    val id: String? = UUID.randomUUID().toString(),
    val name: String,
    val role: String,
    val active: Boolean = true,
    @Column(name = "admission_date", nullable = false)
    val admissionDate: ZonedDateTime,
    @Column(name = "resignation_date")
    val resignationDate: ZonedDateTime?
)
