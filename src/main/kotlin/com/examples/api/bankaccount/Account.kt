package com.examples.api.bankaccount

data class Account( // data classes fazem magica com spring
    val id: String? = null,
    val name: String,
    val document: String,
    val balance: Long? = 0
) {

}