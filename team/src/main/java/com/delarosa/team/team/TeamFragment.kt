package com.delarosa.team.team

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.delarosa.common.common.utils.navigateUriWithDefaultOptions
import com.delarosa.team.R
import com.delarosa.team.databinding.FragmentTeamBinding
import com.delarosa.team.team.TeamViewModel.Companion.LEAGUE_CODE
import kotlinx.android.synthetic.main.fragment_team.*
import org.koin.android.scope.currentScope
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class TeamFragment : Fragment() {

    private lateinit var adapter: TeamAdapter
    private lateinit var dataBindingView: FragmentTeamBinding
    private val viewModelTeam: TeamViewModel by currentScope.viewModel(this) {
        parametersOf(arguments?.getString(LEAGUE_CODE))
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        dataBindingView = FragmentTeamBinding.inflate(inflater, container, false).apply {
            viewModel = viewModelTeam
        }
        return dataBindingView.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        dataBindingView.lifecycleOwner = this.viewLifecycleOwner
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = TeamAdapter(viewModelTeam::onItemClicked)
        recycler?.adapter = adapter

        viewModelTeam.navigation.observe(this, Observer { event ->
            event.getContentIfNotHandled()?.let {
                findNavController().navigateUriWithDefaultOptions(
                    Uri.parse("delarosa://teamdetail/${it}")
                )
            }
        })
    }


}