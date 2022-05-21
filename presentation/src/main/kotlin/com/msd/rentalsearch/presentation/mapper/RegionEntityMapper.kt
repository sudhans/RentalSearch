package com.msd.rentalsearch.presentation.mapper

import com.msd.rentalsearch.domain.entities.RegionEntity
import com.msd.rentalsearch.presentation.model.Region

class RegionEntityMapper: Mapper<RegionEntity, Region> {
    override fun from(e: Region): RegionEntity {
        return RegionEntity(e.regionName)
    }

    override fun to(t: RegionEntity): Region {
        return Region(t.regionName)
    }
}