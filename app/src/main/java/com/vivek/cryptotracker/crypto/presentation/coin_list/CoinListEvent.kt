package com.vivek.cryptotracker.crypto.presentation.coin_list

import com.vivek.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {
    data class Error(val error: NetworkError): CoinListEvent
}