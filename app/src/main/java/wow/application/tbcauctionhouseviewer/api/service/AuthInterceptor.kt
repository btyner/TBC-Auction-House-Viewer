package wow.application.tbcauctionhouseviewer.api.service

import android.content.Context
import okhttp3.Interceptor
import okhttp3.Response
import wow.application.tbcauctionhouseviewer.utilities.Constants
import wow.application.tbcauctionhouseviewer.utilities.SessionManager

class AuthInterceptor(context: Context): Interceptor {
    private val sessionManager = SessionManager(context)

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        if (request.url().encodedPath().equals(Constants.TOKEN_URL, ignoreCase = true)) {
            return chain.proceed(request)
        }

        val requestBuilder = chain.request().newBuilder()

        // If token has been saved, add it to the request
        sessionManager.fetchAuthToken()?.let {
            requestBuilder.addHeader("Authorization", "Bearer $it")
        }

        return chain.proceed(requestBuilder.build())
    }
}