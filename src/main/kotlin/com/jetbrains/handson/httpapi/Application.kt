package com.jetbrains.handson.httpapi

import com.jetbrains.handson.httpapi.routes.registerCustomRoutes
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.serialization.*


fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    install(ContentNegotiation) {
        json()
    }
    registerCustomRoutes()
}
