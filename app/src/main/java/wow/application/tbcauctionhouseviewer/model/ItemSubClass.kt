package wow.application.tbcauctionhouseviewer.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemSubClass(
    @Json(name = "class_id") val classId: Int,
    @Json(name = "subclass_id") val subclassId: Int,
    @Json(name = "display_name") val displayName: String,
    @Json(name = "hide_subclass_in_tooltips") val hideSubclassInTooltips: Boolean
)
