package com.vk.directop.daggerhiltexample.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}