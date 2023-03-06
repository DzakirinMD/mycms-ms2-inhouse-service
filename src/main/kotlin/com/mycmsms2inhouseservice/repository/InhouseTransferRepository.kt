package com.mycmsms2inhouseservice.repository

import com.mycmsms2inhouseservice.entity.InhouseTransfer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.*

interface InhouseTransferRepository : JpaRepository<InhouseTransfer, Long> {

    @Query("SELECT s FROM InhouseTransfer s WHERE s.inhouseTransferTrxId = ?1")
    fun findByTrxId(inhouseTransferTrxId: String): InhouseTransfer
}