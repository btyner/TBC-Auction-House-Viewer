package wow.application.tbcauctionhouseviewer.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Realm(
    val id: Int,
    @Json(name = "has_queue") val hasQueue: Boolean,
    val status: TypeName,
    val population: TypeName,
    val realms: List<RealmInfo>,
    val auctions: Link
)
