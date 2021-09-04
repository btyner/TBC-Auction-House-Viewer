package wow.application.tbcauctionhouseviewer.utilities

object Constants {

    // Endpoints
    const val BASE_URL = "https://us.api.blizzard.com"
    const val TOKEN_URL = "https://us.battle.net/oauth/token"
    const val REALM_LIST_URL =
        "$BASE_URL/data/wow/search/connected-realm?namespace=dynamic-classic-us&status.type=UP&orderby=id&_page=1"
    const val REALM_URL = "$BASE_URL/data/wow/connected-realm/{connectedRealmId}"
    const val ITEM_CLASS_INDEX_URL = "$BASE_URL/data/wow/item-class/index"
    const val ITEM_CLASS_URL = "$BASE_URL/data/wow/item-class/{itemClassId}"
    const val ITEM_SUBCLASS_URL =
        "$BASE_URL/data/wow/item-class/{itemClassId}/item-subclass/{itemSubclassId}"
    const val ITEM_URL = "$BASE_URL/data/wow/item/{itemId}"
    const val ITEM_MEDIA_URL = "$BASE_URL/data/wow/media/item/{itemId}"
    const val ITEM_SEARCH_URL = "$BASE_URL/data/wow/search/item"
    const val AUCTIONS_URL =
        "$BASE_URL/data/wow/connected-realm/{connectedRealmId}/auctions/{auctionHouseId}"
    const val AUCTION_HOUSE_URL =
        "$BASE_URL/data/wow/connected-realm/{connectedRealmId}/auctions/index"

}