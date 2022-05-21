package com.msd.rentalsearch.domain.usecases

import com.msd.rentalsearch.domain.entities.RegionEntity

class GetRegionsTask {

    fun getRegions(): List<RegionEntity> {
        return listOf(RegionEntity("Chennai"), RegionEntity("Delhi"))
    }
}