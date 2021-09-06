package wow.application.tbcauctionhouseviewer

import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import okhttp3.Credentials
import wow.application.tbcauctionhouseviewer.api.model.TokenResponse
import wow.application.tbcauctionhouseviewer.api.service.BNetApi
import wow.application.tbcauctionhouseviewer.databinding.ActivityMainBinding
import wow.application.tbcauctionhouseviewer.utilities.SessionManager
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var sessionManager: SessionManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sessionManager = SessionManager(MainApplication.applicationContext())

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        // Initiate Token Request below
        initiateTokenRequest()
    }

    private fun initiateTokenRequest() = runBlocking {
        launch {
            try {
                val credentials = Credentials.basic(
                    getString(R.string.bnet_client_id),
                    getString(R.string.bnet_client_secret)
                )
                val response: TokenResponse =
                    BNetApi.retrofitService.getToken(credentials, "client_credentials")
                sessionManager.saveAuthToken(response.accessToken)
            } catch (e: Exception) {
                Log.d("tbc:login", "Token Request Error", e)
            }
        }
    }
}