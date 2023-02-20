package com.mycmsms2inhouseservice.service.dto


class InhouseTransfersEventDTO(
    var message: String,
    var status: String,
    var inhouseTransfer: InhouseTransfersDTO?
) {
    override fun toString(): String {
        return "InhouseTransfersEventDTO(message='$message', status='$status', InhouseTransfersDTO=$inhouseTransfer)"
    }
}