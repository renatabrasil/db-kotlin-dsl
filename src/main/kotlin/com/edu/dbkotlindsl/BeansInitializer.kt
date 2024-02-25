package com.edu.dbkotlindsl

import com.edu.dbkotlindsl.controllers.EmployeeHandler
import com.edu.dbkotlindsl.services.impl.ListEmployeesServiceImpl
import org.springframework.context.ApplicationContextInitializer
import org.springframework.context.support.GenericApplicationContext
import org.springframework.context.support.beans

val beans = beans {
    bean<EmployeeHandler>()
    bean<ListEmployeesServiceImpl>()
    bean(::routers)
}

class BeansInitializer : ApplicationContextInitializer<GenericApplicationContext> {

    override fun initialize(context: GenericApplicationContext) =
        beans.initialize(context)

}
