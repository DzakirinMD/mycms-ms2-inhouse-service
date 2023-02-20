package com.mycmsms2inhouseservice.service

import com.mycmsms2inhouseservice.domain.InhouseTransfer
import com.mycmsms2inhouseservice.repository.InhouseTransferRepository
import com.mycmsms2inhouseservice.service.dto.InhouseTransferEventDTO
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class InhouseTransferService(private val inhouseTransferRepository: InhouseTransferRepository) {

    private val LOGGER = LoggerFactory.getLogger(this.javaClass)

    fun findAll() = inhouseTransferRepository.findAll()

    fun createInhouseTransfers(inhouseTransferEventDTO: InhouseTransferEventDTO) {
        LOGGER.info("Creating new InhouseTransfer trx")
        inhouseTransferRepository.save(
            InhouseTransfer(
                inhouseTransferTrxId = inhouseTransferEventDTO.inhouseTransferDTO?.inhouseTransferTrxId ?: "",
                inhouseTransferTrxName = inhouseTransferEventDTO.inhouseTransferDTO?.inhouseTransferTrxName ?: "",
                inhouseTransferTrxEmailRecipient = inhouseTransferEventDTO.inhouseTransferDTO?.inhouseTransferTrxEmailRecipient ?: "",
                inhouseTransferTrxQty = inhouseTransferEventDTO.inhouseTransferDTO?.inhouseTransferTrxQty ?: 0,
                inhouseTransferTrxAmount = inhouseTransferEventDTO.inhouseTransferDTO?.inhouseTransferTrxAmount ?: 0.0,
            )
        )
    }
}