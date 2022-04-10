package com.msd.rentalsearch.domain.entities

data class SearchQueryEntity(
    val region: String,
    val numberOfRooms: Int,
    val rentPerWeek: Pair<Int,Int>
)
