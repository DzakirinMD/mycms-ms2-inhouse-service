package com.mycmsms2inhouseservice.repository

import com.mycmsms2inhouseservice.domain.InhouseTransfer
import org.springframework.data.repository.CrudRepository

interface InhouseTransferRepository : CrudRepository<InhouseTransfer, Long> {
}