package com.delarosa.prueba.ui.team

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import co.avista.libranza.ui.common.Event
import com.delarosa.data.ResultData
import com.delarosa.domain.Team
import com.delarosa.prueba.ui.common.ScopedViewModel
import com.delarosa.usecases.GetTeams
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.launch

class TeamViewModel(
    private val leagueCode: String,
   private val getTeams: GetTeams,
    override val uiDispatcher: CoroutineDispatcher
) : ScopedViewModel(uiDispatcher) {

    private val _model = MutableLiveData<UiModel>()
    val model: LiveData<UiModel> = _model

    private val _navigation = MutableLiveData<Event<String>>()
    val navigation: LiveData<Event<String>> = _navigation

    init {
        initServiceCall()
    }

    private fun initServiceCall() {
        launch {
            when (val result = getTeams.invoke(leagueCode)) {
                is ResultData.Success -> {
                    _model.value = UiModel.Content(result.data)
                }
                is ResultData.Error -> {
                    result.exception.toString()
                }
            }
        }
    }

    fun onItemClicked(team: Team) {
        _navigation.value = Event(team.code)
    }

    sealed class UiModel {
        object Loading : UiModel()
        class Content(val teams: List<Team>) : UiModel()
    }

    companion object {
        val LEAGUE_CODE = "league_code"
    }
}