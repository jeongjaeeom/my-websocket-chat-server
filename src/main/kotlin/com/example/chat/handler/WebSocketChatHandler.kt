package com.example.chat.handler

import mu.KotlinLogging
import org.springframework.stereotype.Component
import org.springframework.web.socket.TextMessage
import org.springframework.web.socket.WebSocketSession
import org.springframework.web.socket.handler.TextWebSocketHandler

@Component
class WebSocketChatHandler: TextWebSocketHandler() {
    private val logger = KotlinLogging.logger {}

    override fun handleTextMessage(session: WebSocketSession, message: TextMessage) {
        val payload = message.payload
        logger.debug { "payload: $payload" }
        val textMessage = TextMessage("Welcome chatting server!")
        session.sendMessage(textMessage)
    }

}
