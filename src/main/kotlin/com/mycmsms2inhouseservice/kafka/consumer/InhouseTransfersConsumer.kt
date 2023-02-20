package com.mycmsms2inhouseservice.kafka.consumer

import com.fasterxml.jackson.databind.ObjectMapper
import com.mycmsms2inhouseservice.service.InhouseTransfersService
import com.mycmsms2inhouseservice.service.dto.InhouseTransfersEventDTO
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class InhouseTransfersConsumer(
    private val inhouseTransfersService: InhouseTransfersService,
    private val objectMapper: ObjectMapper
) {
    private val LOGGER = LoggerFactory.getLogger(this.javaClass)


    @KafkaListener(
        topics = ["\${kafka.topic.name}"],
        groupId = "\${spring.kafka.consumer.group-id}"
    )
    fun consumeInhouseTransfer(message: String) {
        LOGGER.info("Message received: [$message]")

        val inhouseTransfersEventDTO = objectMapper.readValue(message, InhouseTransfersEventDTO::class.java)


        inhouseTransfersService.createInhouseTransfers(inhouseTransfersEventDTO)
    }
}