package wow.application.tbcauctionhouseviewer.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SearchCriteria(
    @Json(name = "_tag") val tag: String?,
    @Json(name = "_page") val page: Int?,
    @Json(name = "_pageSize") val pageSize: Int?,
    @Json(name = "orderby") val orderBy: String?,
    val namespace: String?
)
