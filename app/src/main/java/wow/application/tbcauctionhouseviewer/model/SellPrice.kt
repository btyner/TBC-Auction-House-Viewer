package wow.application.tbcauctionhouseviewer.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SellPrice(
    val value: Int,
    @Json(name = "display_strings") val displayStrings: Price
) {
}