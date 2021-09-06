package wow.application.tbcauctionhouseviewer.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Localization(
    @Json(name = "ru_RU") val ruRU: String,
    @Json(name = "en_GB") val enGB: String,
    @Json(name = "zh_TW") val zhTW: String,
    @Json(name = "ko_KR") val koKR: String,
    @Json(name = "en_US") val enUS: String,
    @Json(name = "es_MX") val esMX: String,
    @Json(name = "pt_BR") val ptBR: String,
    @Json(name = "es_ES") val esES: String,
    @Json(name = "zh_CN") val zhCN: String,
    @Json(name = "fr_FR") val frFR: String,
    @Json(name = "de_DE") val deDE: String
)
