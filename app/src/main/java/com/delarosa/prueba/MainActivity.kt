package com.delarosa.prueba

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        NavHostFragment.findNavController(navHostFragment).navigate(R.id.splashFragment)
    }

    override fun onBackPressed() {
        when (NavHostFragment.findNavController(navHostFragment).currentDestination?.id) {
            R.id.leagueFragment -> finish()
            else -> super.onBackPressed()
        }
    }
}

