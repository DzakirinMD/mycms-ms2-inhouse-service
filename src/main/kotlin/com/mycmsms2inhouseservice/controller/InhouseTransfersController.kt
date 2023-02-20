package com.mycmsms2inhouseservice.controller

import com.mycmsms2inhouseservice.service.InhouseTransfersService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class InhouseTransfersController(
    private val inhouseTransfersService: InhouseTransfersService
) {

    @GetMapping("/inhouse-transfers")
    fun findAll() = inhouseTransfersService.findAll()
}