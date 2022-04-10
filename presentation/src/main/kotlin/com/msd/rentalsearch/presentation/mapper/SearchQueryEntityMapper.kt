package com.msd.rentalsearch.presentation.mapper

import com.msd.rentalsearch.domain.entities.SearchQueryEntity
import com.msd.rentalsearch.presentation.model.SearchParams

class SearchQueryEntityMapper: Mapper<SearchQueryEntity, SearchParams> {
    override fun from(e: SearchParams): SearchQueryEntity {
        return SearchQueryEntity(region = e.region, numberOfRooms = e.numberOfRooms, rentPerWeek = e.rentPerWeek)
    }

    override fun to(t: SearchQueryEntity): SearchParams {
        return SearchParams(region = t.region, numberOfRooms = t.numberOfRooms, rentPerWeek = t.rentPerWeek)
    }
}