package wow.application.tbcauctionhouseviewer.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Spell(
    val spell: KeyNameId,
    val description: String
)
