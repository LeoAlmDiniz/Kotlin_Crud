package com.examples.api.bankaccount

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration
import org.springframework.boot.runApplication


@SpringBootApplication()
class BankaccountApplication

fun main(args: Array<String>) {
	runApplication<BankaccountApplication>(*args)
}
