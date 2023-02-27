package com.septemblue

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.septemblue.plugins.*
import org.ktorm.database.Database

fun main(args: Array<String>) {
    EngineMain.main(args)
}

fun Application.module() {
    val databasePassword = environment.config.propertyOrNull("ktorm.database.password")?.getString() ?: "root"
    val database = Database.connect(
        //databse in mysql workbench (yang gw notes), setiap database beda url sama driver nya, jadi cari di google
        url = "jdbc:mysql://localhost:3306/notes",
        //driver nya
        driver = "com.mysql.cj.jdbc.Driver",
        user = "root",
        password = databasePassword
    )
    configureRouting()
}