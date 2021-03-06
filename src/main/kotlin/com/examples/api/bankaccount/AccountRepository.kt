package com.examples.api.bankaccount

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*


interface AccountRepository : MongoRepository<Account, String> {

    fun findByDocument(document: String): Optional<Account>

}