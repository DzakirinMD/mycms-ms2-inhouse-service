package com.mycmsms2inhouseservice.service.dto

data class InhouseTransferDTO(
        val id: Long,
        var inhouseTransferTrxId: String,
        var inhouseTransferTrxName: String,
        var inhouseTransferTrxEmailRecipient: String,
        var inhouseTransferTrxQty: Int,
        var inhouseTransferTrxAmount: Double
)