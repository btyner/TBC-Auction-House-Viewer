package wow.application.tbcauctionhouseviewer.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PreviewItem(
    val item: KeyNameId,
    val quality: TypeName,
    val name: String,
    val media: KeyNameId,
    @Json(name = "item_class") val itemClass: KeyNameId,
    @Json(name = "item_subclass") val itemSubclass: KeyNameId,
    @Json(name = "inventory_type") val inventoryType: TypeName,
    val binding: TypeName,
    @Json(name = "unique_equipped") val uniqueEquipped: String,
    val weapon: Weapon,
    val stats: List<Stat>,
    val spells: List<Spell>,
    @Json(name = "sell_price") val sellPrice: PriceDisplay,
    val requirements: Requirement,
    val durability: ValueDisplay
)