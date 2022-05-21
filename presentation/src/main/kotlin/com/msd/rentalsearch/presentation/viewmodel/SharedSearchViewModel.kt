package com.msd.rentalsearch.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.msd.rentalsearch.domain.usecases.GetRegionsTask
import com.msd.rentalsearch.presentation.mapper.RegionEntityMapper
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

    // TODO:: This could be LiveData
    fun getRegions(): List<String> {
       return GetRegionsTask().getRegions()
           .map {  RegionEntityMapper().to(it)  }
           .map { it -> it.regionName}
    }
}