package com.sargis.cmpmemecreator

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform