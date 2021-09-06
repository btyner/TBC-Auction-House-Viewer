package wow.application.tbcauctionhouseviewer.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import wow.application.tbcauctionhouseviewer.api.service.BNetApi
import wow.application.tbcauctionhouseviewer.api.service.BNetApiService
import wow.application.tbcauctionhouseviewer.model.Realm
import wow.application.tbcauctionhouseviewer.model.SearchResults

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    init {
        getRealmList()
    }

    private fun getRealmList() {
        viewModelScope.launch {
            try {
                val listResult: SearchResults<Realm> = BNetApi.retrofitService.getRealmList()
                _text.value = "Total Realms: ${listResult.results.size}"
            } catch (e: Exception) {
                _text.value = "Failure: ${e.message}"
            }
        }
    }
}