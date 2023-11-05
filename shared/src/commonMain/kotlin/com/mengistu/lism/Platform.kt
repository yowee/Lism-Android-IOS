package com.mengistu.lism

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform