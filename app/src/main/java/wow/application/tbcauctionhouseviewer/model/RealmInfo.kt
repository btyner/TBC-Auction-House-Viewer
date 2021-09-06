package wow.application.tbcauctionhouseviewer.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealmInfo(
    val id: Int,
    val region: KeyNameId,
    @Json(name = "connected_realm") val connectedRealm: Link?,
    val name: Localization,
    val category: Localization,
    val locale: String,
    val timezone: String,
    val type: TypeName,
    @Json(name = "is_tournament") val isTournament: Boolean,
    val slug: String
)
