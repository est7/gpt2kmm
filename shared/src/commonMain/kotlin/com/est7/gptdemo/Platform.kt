package com.est7.gptdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform