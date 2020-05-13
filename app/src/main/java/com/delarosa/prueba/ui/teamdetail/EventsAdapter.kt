package com.delarosa.prueba.ui.teamdetail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.delarosa.domain.Event
import com.delarosa.prueba.R
import com.delarosa.prueba.ui.common.loadUrl
import kotlinx.android.synthetic.main.event_item.view.*
import java.text.SimpleDateFormat
import java.util.*

class EventsAdapter :
    RecyclerView.Adapter<EventsAdapter.ViewHolder>() {

    private var list: MutableList<Event> = mutableListOf()

    fun appendItems(newItems: List<Event>) {
        list.clear()
        list.addAll(newItems)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.event_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val event = list[position]
        holder.bind(event)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(event: Event) {
            itemView.home.text = event.homeText
            itemView.away.text = event.awayText
            itemView.homeImage.loadUrl(event.homeImage)
            itemView.awayImage.loadUrl(event.awayImage)
            val simpleFormat = SimpleDateFormat("yyyy-MM-dd", Locale.US)
            val date = simpleFormat.parse(event.date)
            simpleFormat.applyPattern("dd MMMM yyyy")
            itemView.date.text = simpleFormat.format(date)
        }
    }
}