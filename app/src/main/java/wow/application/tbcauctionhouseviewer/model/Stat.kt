package wow.application.tbcauctionhouseviewer.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Stat(
    val type: TypeName,
    val value: Int,
    val display: ColorDisplay
)
