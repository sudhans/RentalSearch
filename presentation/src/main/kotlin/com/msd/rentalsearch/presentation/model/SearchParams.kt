package com.msd.rentalsearch.presentation.model

data class SearchParams(
    val region: String,
    val numberOfRooms: Int,
    val rentPerWeek: Pair<Int, Int>
)
