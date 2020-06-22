package com.delarosa.teamdetail.teamdetail


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.delarosa.common.common.startLink
import com.delarosa.teamdetail.databinding.FragmentTeamDetailBinding
import com.delarosa.teamdetail.teamdetail.TeamDetailViewModel.Companion.DETAIL_CODE
import kotlinx.android.synthetic.main.fragment_team_detail.*

import org.koin.android.scope.currentScope
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class TeamDetailFragment : Fragment() {

    private lateinit var adapter: EventsAdapter
    private val viewModelDetail: TeamDetailViewModel by currentScope.viewModel(this) {
        parametersOf(arguments?.getString(DETAIL_CODE))
    }
    private lateinit var dataBindingView: FragmentTeamDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        dataBindingView = FragmentTeamDetailBinding.inflate(inflater, container, false).apply {
            viewModel = viewModelDetail
        }
        return dataBindingView.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        dataBindingView.lifecycleOwner = this.viewLifecycleOwner
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = EventsAdapter()
        recycler?.adapter = adapter
        viewModelDetail.model.observe(this, Observer(::updateUi))
    }

    private fun updateUi(link: String) {
        activity?.let { it.startLink(link) }
    }


}