package wow.application.tbcauctionhouseviewer.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RGBAColor(
    val r: Int = 0,
    val g: Int = 0,
    val b: Int = 0,
    val a: Int = 0
)