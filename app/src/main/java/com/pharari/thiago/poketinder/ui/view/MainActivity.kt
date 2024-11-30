package com.pharari.thiago.poketinder.ui.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.pharari.thiago.poketinder.R
import com.pharari.thiago.poketinder.ui.viewmodel.HomeViewModel
import com.pharari.thiago.poketinder.data.model.PokemonResponse
import com.pharari.thiago.poketinder.databinding.ActivityMainBinding
import com.pharari.thiago.poketinder.ui.adapter.PokemonAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = findNavController(R.id.nav_host_fragment)
        binding.navView.setupWithNavController(navController)
    }

}
