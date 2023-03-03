package com.mycmsms2inhouseservice.configuration

import com.mycmsms2inhouseservice.entity.InhouseTransfer
import com.mycmsms2inhouseservice.repository.InhouseTransferRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class InhouseTransferConfiguration {

    @Bean
    fun inhouseTransfersInit(inhouseTransferRepository: InhouseTransferRepository) = ApplicationRunner {

        inhouseTransferRepository.save(
            InhouseTransfer(
                id = 1L,
                inhouseTransferTrxId = "init-inhouseTransferTrxId",
                inhouseTransferTrxName = "init-inhouseTransferTrxName",
                inhouseTransferTrxEmailRecipient = "init-inhouseTransferTrxEmailRecipient",
                inhouseTransferTrxQty = 10,
                inhouseTransferTrxAmount = 10.15
        )
        )
    }
}