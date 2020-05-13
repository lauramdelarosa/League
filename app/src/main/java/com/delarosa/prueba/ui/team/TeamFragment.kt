package com.delarosa.prueba.ui.team

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.delarosa.prueba.R
import com.delarosa.prueba.ui.team.TeamViewModel.Companion.LEAGUE_CODE
import com.delarosa.prueba.ui.team.TeamViewModel.UiModel
import com.delarosa.prueba.ui.teamdetail.TeamDetailViewModel.Companion.DETAIL_CODE
import kotlinx.android.synthetic.main.fragment_team.*
import org.koin.android.scope.currentScope
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class TeamFragment : Fragment() {

    private lateinit var adapter: TeamAdapter
    private val viewModel: TeamViewModel by currentScope.viewModel(this) {
        parametersOf(arguments?.getString(LEAGUE_CODE))
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_team, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = TeamAdapter(viewModel::onItemClicked)
        recycler?.adapter = adapter
        viewModel.model.observe(this, Observer(::updateUi))
        viewModel.navigation.observe(this, Observer { event ->
            event.getContentIfNotHandled()?.let {
                val bundle = Bundle().apply { putString(DETAIL_CODE, it) }
                findNavController().navigate(
                    R.id.action_team_to_detail,
                    bundle
                )
            }
        })
    }

    private fun updateUi(model: UiModel) {
        progress?.visibility = if (model is UiModel.Loading) View.VISIBLE else View.GONE
        when (model) {
            is UiModel.Content -> adapter.teamList = model.teams
        }
    }


}