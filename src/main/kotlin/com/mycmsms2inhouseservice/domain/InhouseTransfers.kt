package com.mycmsms2inhouseservice.domain

import lombok.Data
import javax.persistence.*

@Data
@Entity
@Table(name = "inhouse_transfers")
class InhouseTransfers(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,
        var orderId: String ,
        var orderName: String,
        var orderEmailRecipient: String,
        var orderQty: Int,
        var orderPrice: Double
) {
        override fun toString(): String {
                return "InhouseTransfersDTO(orderId='$orderId', orderName='$orderName', orderEmailRecipient='$orderEmailRecipient', orderQty=$orderQty, orderPrice=$orderPrice)"
        }
}