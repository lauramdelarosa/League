package com.delarosa.prueba.ui.teamdetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.delarosa.data.ResultData
import com.delarosa.domain.Event
import com.delarosa.domain.Team
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

    private val _model = MutableLiveData<String>()
    val model: LiveData<String> = _model

    val nameText: MutableLiveData<String> = MutableLiveData()
    val descriptionText: MutableLiveData<String> = MutableLiveData()
    val foundationYearText: MutableLiveData<String> = MutableLiveData()
    val teamBadgeText: MutableLiveData<String> = MutableLiveData()
    val teamJerseyText: MutableLiveData<String> = MutableLiveData()
    val list: MutableLiveData<List<Event>> = MutableLiveData()
    var youtubeLink = "youtube"
    var instagramLink = "instagram"
    var facebookLink = "facebook"
    var twitterLink = "twitter"
    var webpageLink = "webpage"

    init {
        initServiceCall()
    }

    private fun initServiceCall() {
        launch {
            printInfo(getTeam.invoke(teamCode))
            when (val result = getEvents.invoke(teamCode)) {
                is ResultData.Success -> {
                    list.value = result.data
                }
                is ResultData.Error -> {
                    result.exception.toString()
                }
            }
        }
    }

    private fun printInfo(team: Team) = with(team) {
        nameText.value = name
        descriptionText.value = description
        foundationYearText.value = foundationYear
        teamBadgeText.value = teamBadge
        teamJerseyText.value = teamJersey
        youtubeLink = youtube
        twitterLink = twitter
        facebookLink = facebook
        instagramLink = instagram
        webpageLink = website
    }

    fun redirectSocialMedia(id: String) {
        _model.value = id
    }

    companion object {
        val DETAIL_CODE = "detail_code"
    }

}