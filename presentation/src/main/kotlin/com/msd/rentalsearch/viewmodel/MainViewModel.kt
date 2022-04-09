package com.msd.rentalsearch.viewmodel

import androidx.lifecycle.ViewModel
import org.slf4j.LoggerFactory

class MainViewModel : ViewModel() {
    private val logger by lazy {
        LoggerFactory.getLogger(MainViewModel::class.java)
    }

    fun printHello() {
        logger.info("Logging from Main ViewModel")
    }
}