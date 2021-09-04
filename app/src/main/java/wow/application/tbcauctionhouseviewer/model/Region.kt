package wow.application.tbcauctionhouseviewer.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Region(
    val key: Link,
    val name: String,
    val id: Int
)
