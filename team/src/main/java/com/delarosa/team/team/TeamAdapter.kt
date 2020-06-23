package com.delarosa.team.team

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.delarosa.common.utils.basicDiffUtil
import com.delarosa.common.utils.inflate
import com.delarosa.common.utils.loadUrl
import com.delarosa.domain.Team
import com.delarosa.team.R
import kotlinx.android.synthetic.main.team_item.view.*

class TeamAdapter(private val listener: (Team) -> Unit) :
    RecyclerView.Adapter<TeamAdapter.ViewHolder>() {

    var teamList: List<Team> by basicDiffUtil(
        emptyList(),
        areItemsTheSame = { old, new -> old.code == new.code }
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = parent.inflate(R.layout.team_item, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = teamList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val team = teamList[position]
        holder.bind(team)
        holder.itemView.setOnClickListener { listener(team) }
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(team: Team) {
            itemView.tittle.text = team.name
            itemView.image.loadUrl(team.teamBadge)
            itemView.stadium.text = team.stadium
        }
    }
}