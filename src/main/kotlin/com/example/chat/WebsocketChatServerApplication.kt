package com.example.chat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebsocketChatServerApplication

fun main(args: Array<String>) {
    runApplication<WebsocketChatServerApplication>(*args)
}
