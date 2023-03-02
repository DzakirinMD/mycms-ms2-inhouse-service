package com.mycmsms2inhouseservice.controller

import com.mycmsms2inhouseservice.service.InhouseTransferService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class InhouseTransferController(
    private val inhouseTransferService: InhouseTransferService
) {

    @GetMapping("/inhouse-transfer")
    fun findAll() = inhouseTransferService.findAll()
}