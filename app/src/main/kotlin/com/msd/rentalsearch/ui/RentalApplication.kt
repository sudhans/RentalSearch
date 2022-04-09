package com.msd.rentalsearch.ui

import android.app.Application
import org.slf4j.LoggerFactory
import java.time.LocalDateTime

class RentalApplication : Application() {
    private val log by lazy {
        LoggerFactory.getLogger(RentalApplication::class.java)
    }

    override fun onCreate() {
        super.onCreate()
        log.info("*".repeat(80))
        log.info("Rental Application started at ${LocalDateTime.now()}")
        log.info("*".repeat(80))
    }
}