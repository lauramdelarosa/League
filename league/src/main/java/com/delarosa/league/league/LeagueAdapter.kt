package com.delarosa.league.league

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.delarosa.common.common.basicDiffUtil
import com.delarosa.common.common.inflate
import com.delarosa.common.common.loadUrl
import com.delarosa.domain.League
import com.delarosa.league.R

import kotlinx.android.synthetic.main.league_item.view.*

class LeagueAdapter(private val listener: (League) -> Unit) :
    RecyclerView.Adapter<LeagueAdapter.ViewHolder>() {

    var leagueList: List<League> by basicDiffUtil(
        emptyList(),
        areItemsTheSame = { old, new -> old.code == new.code }
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = parent.inflate(R.layout.league_item, false)
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

