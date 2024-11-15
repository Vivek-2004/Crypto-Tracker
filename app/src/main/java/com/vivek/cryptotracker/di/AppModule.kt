package com.vivek.cryptotracker.di

import com.vivek.cryptotracker.core.data.networking.HttpClientFactory
import com.vivek.cryptotracker.crypto.data.networking.RemoteCoinDataSource
import com.vivek.cryptotracker.crypto.domain.CoinDataSource
import io.ktor.client.engine.cio.CIO
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module
import com.vivek.cryptotracker.crypto.presentation.coin_list.CoinListViewModel

val appModule = module {
    single { HttpClientFactory.create(CIO.create()) }
    singleOf(::RemoteCoinDataSource).bind<CoinDataSource>()

    viewModelOf(::CoinListViewModel)
}