package com.delarosa.league.league

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.delarosa.common.common.utils.navigateUriWithDefaultOptions
import com.delarosa.league.R
import com.delarosa.league.databinding.FragmentLeagueBinding
import kotlinx.android.synthetic.main.fragment_league.*
import org.koin.android.scope.currentScope
import org.koin.android.viewmodel.ext.android.viewModel

class LeagueFragment : Fragment() {

    private lateinit var adapter: LeagueAdapter
    private lateinit var dataBindingView: FragmentLeagueBinding
    private val viewModelLeague: LeagueViewModel by currentScope.viewModel(this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        dataBindingView = FragmentLeagueBinding.inflate(inflater, container, false).apply {
            viewModel = viewModelLeague
        }
        return dataBindingView.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        dataBindingView.lifecycleOwner = this.viewLifecycleOwner
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = LeagueAdapter(viewModelLeague::onItemClicked)
        recycler?.adapter = adapter
        viewModelLeague.navigation.observe(this, Observer { event ->
            event.getContentIfNotHandled()?.let {
                findNavController().navigateUriWithDefaultOptions(
                    Uri.parse("delarosa://team/${it}")
                )
            }
        })
    }


}