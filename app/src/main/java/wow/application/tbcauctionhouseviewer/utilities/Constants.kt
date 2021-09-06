package wow.application.tbcauctionhouseviewer.utilities

object Constants {

    // Endpoints
    const val BASE_URL = "https://us.api.blizzard.com"
    const val TOKEN_URL = "https://us.battle.net/oauth/token"
    const val REALM_LIST_URL =
        "$BASE_URL/data/wow/search/connected-realm?namespace=dynamic-classic-us&status.type=UP&orderby=id&_page=1"
    const val REALM_URL = "$BASE_URL/data/wow/connected-realm/{connectedRealmId}?namespace=dynamic-classic-us"
    const val ITEM_CLASS_INDEX_URL = "$BASE_URL/data/wow/item-class/index?namespace=static-classic-us"
    const val ITEM_CLASS_URL = "$BASE_URL/data/wow/item-class/{itemClassId}?namespace=static-classic-us"
    const val ITEM_SUBCLASS_URL =
        "$BASE_URL/data/wow/item-class/{itemClassId}/item-subclass/{itemSubclassId}?namespace=static-classic-us"
    const val ITEM_URL = "$BASE_URL/data/wow/item/{itemId}?namespace=static-classic-us"
    const val ITEM_MEDIA_URL = "$BASE_URL/data/wow/media/item/{itemId}?namespace=static-classic-us"
    const val ITEM_SEARCH_URL = "$BASE_URL/data/wow/search/item?namespace=static-classic-us"
    const val AUCTIONS_URL =
        "$BASE_URL/data/wow/connected-realm/{connectedRealmId}/auctions/{auctionHouseId}?namespace=dynamic-classic-us"
    const val AUCTION_HOUSE_URL =
        "$BASE_URL/data/wow/connected-realm/{connectedRealmId}/auctions/index?namespace=dynamic-classic-us"

}