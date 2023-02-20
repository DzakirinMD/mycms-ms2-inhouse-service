package com.mycmsms2inhouseservice.service.dto


class InhouseTransferEventDTO(
    var message: String,
    var status: String,
    var inhouseTransferDTO: InhouseTransferDTO?
) {
    override fun toString(): String {
        return "InhouseTransfersEventDTO(message='$message', status='$status', InhouseTransferDTO=$inhouseTransferDTO)"
    }
}