package wow.application.tbcauctionhouseviewer.api.service

import android.content.Context
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.*
import wow.application.tbcauctionhouseviewer.MainApplication
import wow.application.tbcauctionhouseviewer.api.model.TokenResponse
import wow.application.tbcauctionhouseviewer.model.*
import wow.application.tbcauctionhouseviewer.utilities.Constants

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(Constants.BASE_URL)
    .client(okhttpClient(MainApplication.applicationContext()))
    .build()

/**
 * Initialize OkhttpClient with our interceptor
 */
private fun okhttpClient(context: Context): OkHttpClient {
    return OkHttpClient.Builder()
        .addInterceptor(AuthInterceptor(context))
        .build()
}

interface BNetApiService {

    @POST(Constants.TOKEN_URL)
    @FormUrlEncoded
    suspend fun getToken(
        @Header("Authorization") token: String,
        @Field("grant_type") grantType: String
    ): TokenResponse

    @GET(Constants.ITEM_CLASS_INDEX_URL)
    suspend fun getItemClassList(): List<KeyNameId>

    @GET(Constants.ITEM_CLASS_URL)
    suspend fun getItemClass(@Path("itemClassId") itemClassId: Int): ItemClass

    @GET(Constants.ITEM_SUBCLASS_URL)
    suspend fun getItemSubClass(
        @Path("itemClassId") itemClassId: Int,
        @Path("itemSubclassId") itemSubclassId: Int
    ): ItemSubClass

    @GET(Constants.ITEM_URL)
    suspend fun getItem(@Path("itemId") itemId: Int): Item

    @GET(Constants.ITEM_MEDIA_URL)
    suspend fun getItemMedia(@Path("itemId") itemId: Int): Item

    @GET(Constants.ITEM_SEARCH_URL)
    suspend fun searchItems(): SearchResults<Item>

    @GET(Constants.REALM_LIST_URL)
    suspend fun getRealmList(): SearchResults<Realm>

    @GET(Constants.REALM_URL)
    suspend fun getRealm(@Path("connectedRealmId") connectedRealmId: Int): Realm

    @GET(Constants.AUCTION_HOUSE_URL)
    suspend fun getAuctionHouseList(
        @Path("connectedRealmId") connectedRealmId: Int
    ): AuctionHouseResults

    @GET(Constants.AUCTIONS_URL)
    suspend fun getAuctions(
        @Path("connectedRealmId") connectedRealmId: Int,
        @Path("auctionHouseId") auctionHouseId: Int
    ): AuctionResults
}

object BNetApi {
    val retrofitService: BNetApiService by lazy {
        retrofit.create(BNetApiService::class.java)
    }
}