package wow.application.tbcauctionhouseviewer.model

import com.squareup.moshi.Json

open class DisplayString(
    @Json(name = "display_string") val displayString: String? = null
)