package com.delarosa.prueba.ui.teamdetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.delarosa.data.ResultData
import com.delarosa.domain.Event
import com.delarosa.prueba.ui.common.ScopedViewModel
import com.delarosa.usecases.GetEvents
import com.delarosa.usecases.GetTeam
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.launch

class TeamDetailViewModel(
    private val teamCode: String,
    val getTeam: GetTeam,
    val getEvents: GetEvents,
    override val uiDispatcher: CoroutineDispatcher
) : ScopedViewModel(uiDispatcher) {

    private val _model = MutableLiveData<UiModel>()
    val model: LiveData<UiModel> = _model

    val nameText: MutableLiveData<String> = MutableLiveData()
    val descriptionText: MutableLiveData<String> = MutableLiveData()
    val foundationYearText: MutableLiveData<String> = MutableLiveData()
    val teamBadgeText: MutableLiveData<String> = MutableLiveData()
    val teamJerseyText: MutableLiveData<String> = MutableLiveData()

    init {
        initServiceCall()
    }

    private fun initServiceCall() {
        launch {
            printInfo()
            when (val result = getEvents.invoke(teamCode)) {
                is ResultData.Success -> {
                    _model.value = UiModel.Content(result.data)
                }
                is ResultData.Error -> {
                    result.exception.toString()
                }
            }
        }
    }

    private fun printInfo() = launch {
        with(getTeam.invoke(teamCode)) {
            /*nameText.value = name
            descriptionText.value = description
            foundationYearText.value = foundationYear
            teamBadgeText.value = teamBadge
            teamJerseyText.value = teamJersey*/
        }
    }

    sealed class UiModel {
        class Content(val event: List<Event>) : UiModel()

    }

    companion object {
        val DETAIL_CODE = "detail_code"
    }
}