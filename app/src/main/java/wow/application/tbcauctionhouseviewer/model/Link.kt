package wow.application.tbcauctionhouseviewer.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Link(var href: String)
