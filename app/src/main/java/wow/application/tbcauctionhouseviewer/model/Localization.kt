package wow.application.tbcauctionhouseviewer.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Localization(
    @Json(name = "en_US") val enUS: String
)
