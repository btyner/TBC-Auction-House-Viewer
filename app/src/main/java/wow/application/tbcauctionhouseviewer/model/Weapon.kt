package wow.application.tbcauctionhouseviewer.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Weapon(
    val damage: Damage,
    @Json(name = "attack_speed") val attackSpeed: ValueDisplay,
    val dps: ValueDisplay,
    @Json(name = "additional_damage") val additionalDamage: List<Damage>
)
