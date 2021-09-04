package wow.application.tbcauctionhouseviewer.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Damage(
    @Json(name = "min_value") val minValue: Int,
    @Json(name = "max_value") val maxValue: Int,
    @Json(name = "damage_class") val damageClass: TypeName
) : DisplayString()
