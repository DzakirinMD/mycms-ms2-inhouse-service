package com.mycmsms2inhouseservice.service.dto

class InhouseTransferDTO(
        var inhouseTransferTrxId: String,
        var inhouseTransferTrxName: String,
        var inhouseTransferTrxEmailRecipient: String,
        var inhouseTransferTrxQty: Int,
        var inhouseTransferTrxAmount: Double
) {
        override fun toString(): String {
                return "InhouseTransferDTO(inhouseTransferTrxId='$inhouseTransferTrxId', inhouseTransferTrxName='$inhouseTransferTrxName', inhouseTransferTrxEmailRecipient='$inhouseTransferTrxEmailRecipient', inhouseTransferTrxQty=$inhouseTransferTrxQty, inhouseTransferTrxAmount=$inhouseTransferTrxAmount)"
        }
}