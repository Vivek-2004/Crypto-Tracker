package com.vivek.cryptotracker.crypto.domain

import com.vivek.cryptotracker.core.domain.util.Result
import com.vivek.cryptotracker.core.domain.util.NetworkError
import java.time.ZonedDateTime

interface CoinDataSource {
    suspend fun getCoins(): Result<List<Coin>, NetworkError>
    suspend fun getCoinHistory(
        coinId: String,
        start: ZonedDateTime,
        end: ZonedDateTime
    ): Result<List<CoinPrice>, NetworkError>
}