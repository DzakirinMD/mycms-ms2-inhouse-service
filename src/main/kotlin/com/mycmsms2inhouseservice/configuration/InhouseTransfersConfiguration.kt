package com.mycmsms2inhouseservice.configuration

import com.mycmsms2inhouseservice.domain.InhouseTransfers
import com.mycmsms2inhouseservice.repository.InhouseTransfersRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class InhouseTransfersConfiguration {

    @Bean
    fun InhouseTransfersInit(inhouseTransfersRepository: InhouseTransfersRepository) = ApplicationRunner {

        inhouseTransfersRepository.save(
            InhouseTransfers(
                id = 1L,
                orderId = "hanya order",
                orderName = "init orderName",
                orderEmailRecipient = "init orderEmailRecipient",
                orderQty = 10,
                orderPrice = 10.15
        )
        )
    }
}