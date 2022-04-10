package com.msd.rentalsearch.presentation.viewmodel

import androidx.lifecycle.ViewModel
import org.slf4j.LoggerFactory

class SharedSearchViewModel : ViewModel() {
    private var counter = 0
    private val logger by lazy {
        LoggerFactory.getLogger(SharedSearchViewModel::class.java)
    }

    fun printHello() {
        counter++
        logger.info("Logging from Shared ViewModel  $counter")
    }
}