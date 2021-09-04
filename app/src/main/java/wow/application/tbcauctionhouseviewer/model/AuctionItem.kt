package wow.application.tbcauctionhouseviewer.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuctionItem(
    val id: Int,
    val item: ItemId,
    val bid: Int,
    val buyout: Int,
    val quantity: Int,
    @Json(name = "time_left") val timeLeft: String
)
