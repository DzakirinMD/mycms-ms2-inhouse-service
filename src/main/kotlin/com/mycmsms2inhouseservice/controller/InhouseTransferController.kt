package com.mycmsms2inhouseservice.controller

import com.mycmsms2inhouseservice.service.InhouseTransferService
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/inhouse-transfer")
class InhouseTransferController(
    private val inhouseTransferService: InhouseTransferService
) {

    @CrossOrigin
    @GetMapping
    fun findAllTrx() = inhouseTransferService.findAllTrx()

    @GetMapping("/{inhouseTransferTrxId}")
    fun findSingleTrx(@PathVariable("inhouseTransferTrxId") inhouseTransferTrxId: String) = inhouseTransferService.findByTrxId(inhouseTransferTrxId)

}