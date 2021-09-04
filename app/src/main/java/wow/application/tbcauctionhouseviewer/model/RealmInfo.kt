package wow.application.tbcauctionhouseviewer.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealmInfo(
    val id: Int,
    val region: Region,
    @Json(name = "connected_realm") val connectedRealm: Link,
    val name: String,
    val category: String,
    val locale: String,
    val timezone: String,
    val type: TypeName,
    @Json(name = "is_tournament") val isTournament: Boolean,
    val slug: String
)
