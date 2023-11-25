package com.vk.directop.daggerhiltexample

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.vk.directop.daggerhiltexample.domain.repository.MyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MyService: Service() {

    @Inject
    lateinit var repository: MyRepository

    override fun onCreate(){
        super.onCreate()
        // here can use repository
    }
    override fun onBind(p0: Intent?): IBinder? {
        return null
    }
}