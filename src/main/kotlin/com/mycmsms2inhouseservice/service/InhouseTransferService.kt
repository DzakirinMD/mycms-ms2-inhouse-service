package com.mycmsms2inhouseservice.service

import com.mycmsms2inhouseservice.entity.InhouseTransfer
import com.mycmsms2inhouseservice.repository.InhouseTransferRepository
import com.mycmsms2inhouseservice.service.dto.InhouseTransferDTO
import com.mycmsms2inhouseservice.service.dto.InhouseTransferEventDTO
import com.mycmsms2inhouseservice.utils.convertToDTO
import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class InhouseTransferService(private val inhouseTransferRepository: InhouseTransferRepository) {

    private val LOGGER = LoggerFactory.getLogger(this.javaClass)

    fun findAllTrx() = inhouseTransferRepository.findAll()

    fun createInhouseTransfers(inhouseTransferEventDTO: InhouseTransferEventDTO) {
        LOGGER.info("Creating new InhouseTransfer trx")
        inhouseTransferRepository.save(
            InhouseTransfer(
                id = inhouseTransferEventDTO.inhouseTransferDTO?.id ?: 1L,
                inhouseTransferTrxId = inhouseTransferEventDTO.inhouseTransferDTO?.inhouseTransferTrxId ?: "",
                inhouseTransferTrxName = inhouseTransferEventDTO.inhouseTransferDTO?.inhouseTransferTrxName ?: "",
                inhouseTransferTrxEmailRecipient = inhouseTransferEventDTO.inhouseTransferDTO?.inhouseTransferTrxEmailRecipient ?: "",
                inhouseTransferTrxQty = inhouseTransferEventDTO.inhouseTransferDTO?.inhouseTransferTrxQty ?: 0,
                inhouseTransferTrxAmount = inhouseTransferEventDTO.inhouseTransferDTO?.inhouseTransferTrxAmount ?: 0.0,
            )
        )
    }

    fun findByTrxId(inhouseTransferTrxId: String): ResponseEntity<InhouseTransferDTO> {
        try {
            val inhouseTransfer = inhouseTransferRepository.findByTrxId(inhouseTransferTrxId)
            return ResponseEntity.ok(convertToDTO(inhouseTransfer))
        } catch (ex: Exception) {
            throw ex
        }
    }
}