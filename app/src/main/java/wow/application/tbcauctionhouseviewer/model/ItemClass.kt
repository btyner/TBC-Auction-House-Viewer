package wow.application.tbcauctionhouseviewer.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemClass(
    @Json(name = "class_id") val classId: Int,
    val name: Localization,
    @Json(name = "item_subclasses") val itemSubclasses: List<KeyNameId>
)
