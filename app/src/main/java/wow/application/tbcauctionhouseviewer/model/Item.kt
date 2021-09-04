package wow.application.tbcauctionhouseviewer.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Item(
    val id: String,
    val name: String,
    val quality: TypeName,
    val level: Int,
    @Json(name = "required_level") val requiredLevel: Int,
    val media: KeyNameId,
    @Json(name = "item_class") val itemClass: KeyNameId,
    @Json(name = "item_subclass") val itemSubClass: KeyNameId,
    @Json(name = "inventory_type") val inventoryType: TypeName,
    @Json(name = "purchase_price") val purchasePrice: Int,
    @Json(name = "sell_price") val sellPrice: Int,
    @Json(name = "max_count") val maxCount: Int,
    @Json(name = "is_equippable") val isEquippable: Boolean,
    @Json(name = "is_stackable") val isStackable: Boolean
)
