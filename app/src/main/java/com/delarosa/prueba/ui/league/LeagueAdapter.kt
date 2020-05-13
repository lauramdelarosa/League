package com.delarosa.prueba.ui.league

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.delarosa.domain.League
import com.delarosa.prueba.R
import com.delarosa.prueba.ui.common.loadUrl
import kotlinx.android.synthetic.main.league_item.view.*

class LeagueAdapter(private val listener: (League) -> Unit) :
    RecyclerView.Adapter<LeagueAdapter.ViewHolder>() {

    private var leagueList: MutableList<League> = mutableListOf()

    fun appendItems(newItems: List<League>) {
        leagueList.clear()
        leagueList.addAll(newItems)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.league_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = leagueList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val league = leagueList[position]
        holder.bind(league)
        holder.itemView.setOnClickListener { listener(league) }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(league: League) {
            itemView.tittle.text = league.name
            itemView.image.loadUrl(league.image)
            itemView.country.text = league.country
        }
    }
}

