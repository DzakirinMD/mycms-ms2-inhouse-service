package com.mycmsms2inhouseservice.service.dto

class InhouseTransfersDTO(
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