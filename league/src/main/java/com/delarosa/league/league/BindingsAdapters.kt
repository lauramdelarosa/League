package com.delarosa.league.league

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.delarosa.domain.League


@BindingAdapter("items")
fun RecyclerView.setLeagues(events: List<League>?) {
    (adapter as? LeagueAdapter)?.let {
        it.leagueList = events ?: emptyList()
    }
}