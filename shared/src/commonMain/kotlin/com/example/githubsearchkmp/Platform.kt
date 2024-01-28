package com.example.githubsearchkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform