package wow.application.tbcauctionhouseviewer.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class Price(
    val header: String,
    val gold: String,
    val silver: String,
    val copper: String
)