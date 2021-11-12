package com.octacore.cardinfofinder.remote

import com.octacore.cardinfofinder.remote.entities.ResponseEntity
import kotlinx.coroutines.flow.Flow

interface IBinService {
    suspend fun fetchCardDetails(cardNumber: String): Flow<ResponseEntity>
}