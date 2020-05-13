package com.delarosa.prueba.ui.league

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import co.avista.libranza.ui.common.Event
import com.delarosa.data.ResultData
import com.delarosa.domain.League
import com.delarosa.prueba.ui.common.ScopedViewModel
import com.delarosa.usecases.GetLeagues
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.launch

class LeagueViewModel(
    private val getLeagues: GetLeagues,
    override val uiDispatcher: CoroutineDispatcher
) : ScopedViewModel(uiDispatcher) {

    private val _model = MutableLiveData<UiModel>()
    val model: LiveData<UiModel> = _model

    private val _navigation = MutableLiveData<Event<String>>()
    val navigation: LiveData<Event<String>> = _navigation

    init {
        initScope()
        initServiceCall()
    }

    private fun initServiceCall() {
        launch {

            when (val result =  getLeagues.invoke()) {
                is ResultData.Success -> {
                    _model.value = UiModel.Content(result.data)
                }
                is ResultData.Error -> {
                    result.exception.toString()
                }
            }
        }
    }

    fun onItemClicked(league: League) {
        _navigation.value = Event(league.code)
    }

    override fun onCleared() {
        destroyScope()
        super.onCleared()
    }

    sealed class UiModel {
        object Loading : UiModel()
        class Content(val leagueList: List<League>) : UiModel()
    }
}