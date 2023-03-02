package com.mycmsms2inhouseservice.kafka.consumer

import com.fasterxml.jackson.databind.ObjectMapper
import com.mycmsms2inhouseservice.service.InhouseTransferService
import com.mycmsms2inhouseservice.service.dto.InhouseTransferEventDTO
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class InhouseTransferConsumer(
    private val inhouseTransferService: InhouseTransferService,
    private val objectMapper: ObjectMapper
) {
    private val LOGGER = LoggerFactory.getLogger(this.javaClass)


    @KafkaListener(
        topics = ["\${kafka.topic.name}"],
        groupId = "\${spring.kafka.consumer.group-id}"
    )
    fun consumeInhouseTransfer(message: String) {
        LOGGER.info("Message received: [$message]")

        val inhouseTransferEventDTO = objectMapper.readValue(message, InhouseTransferEventDTO::class.java)

        inhouseTransferService.createInhouseTransfers(inhouseTransferEventDTO)
    }
}