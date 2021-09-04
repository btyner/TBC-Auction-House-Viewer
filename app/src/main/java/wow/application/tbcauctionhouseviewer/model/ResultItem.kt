package wow.application.tbcauctionhouseviewer.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ResultItem<T>(val t: T) {
    lateinit var key: Link
    var data: T = t
}
