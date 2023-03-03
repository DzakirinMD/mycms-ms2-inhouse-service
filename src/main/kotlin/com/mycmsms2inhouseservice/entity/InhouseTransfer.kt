package com.mycmsms2inhouseservice.entity

import lombok.Data
import javax.persistence.*

@Data
@Entity
@Table(name = "inhouse_transfers")
class InhouseTransfer(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long,
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