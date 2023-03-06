package com.mycmsms2inhouseservice.utils

import com.mycmsms2inhouseservice.entity.InhouseTransfer
import com.mycmsms2inhouseservice.service.dto.InhouseTransferDTO

fun convertToDTO(inhouseTransfer: InhouseTransfer): InhouseTransferDTO {
    return InhouseTransferDTO(
        id = inhouseTransfer.id,
        inhouseTransferTrxId = inhouseTransfer.inhouseTransferTrxId,
        inhouseTransferTrxName = inhouseTransfer.inhouseTransferTrxName,
        inhouseTransferTrxEmailRecipient = inhouseTransfer.inhouseTransferTrxEmailRecipient,
        inhouseTransferTrxQty = inhouseTransfer.inhouseTransferTrxQty,
        inhouseTransferTrxAmount = inhouseTransfer.inhouseTransferTrxAmount
    )
}

fun InhouseTransfer.toResponse() = InhouseTransferDTO(
    id = id,
    inhouseTransferTrxId = inhouseTransferTrxId,
    inhouseTransferTrxName = inhouseTransferTrxName,
    inhouseTransferTrxEmailRecipient = inhouseTransferTrxEmailRecipient,
    inhouseTransferTrxQty = inhouseTransferTrxQty,
    inhouseTransferTrxAmount = inhouseTransferTrxAmount
)
