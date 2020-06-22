package com.delarosa.teamdetail.teamdetail

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.delarosa.domain.Event


@BindingAdapter("items")
fun RecyclerView.setEvents(events: List<Event>?) {
    (adapter as? EventsAdapter)?.let {
        it.list = events ?: emptyList()
    }
}

