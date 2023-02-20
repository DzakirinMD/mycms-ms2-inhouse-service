package com.mycmsms2inhouseservice.repository

import com.mycmsms2inhouseservice.domain.InhouseTransfers
import org.springframework.data.repository.CrudRepository

interface InhouseTransfersRepository : CrudRepository<InhouseTransfers, Long> {
}