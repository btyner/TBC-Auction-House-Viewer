package wow.application.tbcauctionhouseviewer.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TypeName(
    val type: String,
    val name: String
)