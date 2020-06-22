package com.delarosa.league.league

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.delarosa.common.common.Event
import com.delarosa.common.common.ScopedViewModel
import com.delarosa.data.ResultData
import com.delarosa.domain.League
import com.delarosa.usecases.GetLeagues
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.launch

class LeagueViewModel(
    private val getLeagues: GetLeagues,
    override val uiDispatcher: CoroutineDispatcher
) : ScopedViewModel(uiDispatcher) {

    private val _navigation = MutableLiveData<Event<String>>()
    val navigation: LiveData<Event<String>> = _navigation

    val list: MutableLiveData<List<League>> = MutableLiveData()
    val loadingProgressBar: MutableLiveData<Boolean> = MutableLiveData()


    init {
        initScope()
        initServiceCall()
    }

    private fun initServiceCall() {
        launch {
            loadingProgressBar.value = true
            when (val result = getLeagues.invoke()) {
                is ResultData.Success -> {
                    list.value = result.data
                }
                is ResultData.Error -> {
                    result.exception.toString()
                }
            }
            loadingProgressBar.value = false
        }
    }

    fun onItemClicked(league: League) {
        _navigation.value = Event(league.code)
    }

    override fun onCleared() {
        destroyScope()
        super.onCleared()
    }
}