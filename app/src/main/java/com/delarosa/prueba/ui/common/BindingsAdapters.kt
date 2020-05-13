package com.delarosa.prueba.ui.common

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.delarosa.domain.Event
import com.delarosa.domain.League
import com.delarosa.domain.Team
import com.delarosa.prueba.ui.league.LeagueAdapter
import com.delarosa.prueba.ui.team.TeamAdapter
import com.delarosa.prueba.ui.teamdetail.EventsAdapter

@BindingAdapter("url")
fun ImageView.bindUrl(url: String?) {
    if (url != null) loadUrl(url)
}

@BindingAdapter("items")
fun RecyclerView.setEvents(events: List<Event>?) {
    (adapter as? EventsAdapter)?.let {
        it.list = events ?: emptyList()
    }
}

@BindingAdapter("items")
fun RecyclerView.setTeams(events: List<Team>?) {
    (adapter as? TeamAdapter)?.let {
        it.teamList = events ?: emptyList()
    }
}

@BindingAdapter("items")
fun RecyclerView.setLeagues(events: List<League>?) {
    (adapter as? LeagueAdapter)?.let {
        it.leagueList = events ?: emptyList()
    }
}

@BindingAdapter("visible")
fun View.setVisible(visible: Boolean?) {
    visibility = visible?.let {
        if (visible) View.VISIBLE else View.GONE
    } ?: View.GONE
}