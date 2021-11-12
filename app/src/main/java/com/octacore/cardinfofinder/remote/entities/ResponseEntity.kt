package com.octacore.cardinfofinder.remote.entities

data class ResponseEntity(
    val number: NumberEntity?,
    val scheme: String?,
    val type: String?,
    val brand: String?,
    val prepaid: Boolean?,
    val country: CountryEntity?,
    val bank: BankEntity?
)