package wow.application.tbcauctionhouseviewer.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ResultItem<out T>(
    val key: Link,
    val data: T
)
