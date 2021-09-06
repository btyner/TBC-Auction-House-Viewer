package wow.application.tbcauctionhouseviewer.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import wow.application.tbcauctionhouseviewer.api.service.BNetApi
import wow.application.tbcauctionhouseviewer.api.service.BNetApiService
import wow.application.tbcauctionhouseviewer.model.Realm
import wow.application.tbcauctionhouseviewer.model.ResultItem
import wow.application.tbcauctionhouseviewer.model.SearchResults

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    private val _realms = MutableLiveData<List<ResultItem<Realm>>>().apply {
        value = emptyList()
    }
    val realms: MutableLiveData<List<ResultItem<Realm>>> = _realms

    init {
        getRealmList()
    }

    private fun getRealmList() {
        viewModelScope.launch {
            try {
                val listResult: SearchResults<Realm> = BNetApi.retrofitService.getRealmList()
                _realms.value = listResult.results
                _text.value = "Total Realms: ${listResult.results.size}"
            } catch (e: Exception) {
                _text.value = "Failure: ${e.message}"
            }
        }
    }
}