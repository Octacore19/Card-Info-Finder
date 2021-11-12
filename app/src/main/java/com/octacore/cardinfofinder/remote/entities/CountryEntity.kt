package com.octacore.cardinfofinder.remote.entities

data class CountryEntity(
    val numeric: String?,
    val alpha: String?,
    val name: String?,
    val emoji: String?,
    val currency: String?,
    val latitude: Double?,
    val longitude: Double?
)