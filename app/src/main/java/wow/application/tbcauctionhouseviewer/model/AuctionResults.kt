package wow.application.tbcauctionhouseviewer.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AuctionResults(
    val auctions: List<AuctionItem>
)
