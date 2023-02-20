package com.mycmsms2inhouseservice.service

import com.mycmsms2inhouseservice.domain.InhouseTransfers
import com.mycmsms2inhouseservice.repository.InhouseTransfersRepository
import com.mycmsms2inhouseservice.service.dto.InhouseTransfersEventDTO
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class InhouseTransfersService(private val inhouseTransfersRepository: InhouseTransfersRepository) {

    private val LOGGER = LoggerFactory.getLogger(this.javaClass)

    fun findAll() = inhouseTransfersRepository.findAll()

    fun createInhouseTransfers(inhouseTransfersEventDTO: InhouseTransfersEventDTO) {
        LOGGER.info("Creating new InhouseTransfer trx")
        inhouseTransfersRepository.save(
            InhouseTransfers(
                orderId = inhouseTransfersEventDTO.inhouseTransfer?.orderId ?: "",
                orderName = inhouseTransfersEventDTO.inhouseTransfer?.orderName ?: "",
                orderEmailRecipient = inhouseTransfersEventDTO.inhouseTransfer?.orderEmailRecipient ?: "",
                orderQty = inhouseTransfersEventDTO.inhouseTransfer?.orderQty ?: 0,
                orderPrice = inhouseTransfersEventDTO.inhouseTransfer?.orderPrice ?: 0.0,
            )
        )
    }
}