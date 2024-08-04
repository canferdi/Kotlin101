package com.ferdican.superheroesapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.ferdican.superheroesapp.databinding.ActivityMainBinding // Import the binding class

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding // Use the correct binding class name
    private lateinit var superHeroesList : ArrayList<SuperHero>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // Inflate using binding
        setContentView(binding.root)

        // Use binding to access views
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val superman = SuperHero("Superman", "Journalist", R.drawable.superman)
        val batman = SuperHero("Batman", "Boss", R.drawable.batman)
        val ironman = SuperHero("Ironman", "Scientist", R.drawable.ironman)
        val spiderman = SuperHero("Spiderman", "Student", R.drawable.spiderman)

        superHeroesList = arrayListOf(superman, batman, ironman, spiderman)

        val adapter = SuperHeroAdapter(superHeroesList)
        binding.superHeroesRV.layoutManager = LinearLayoutManager(this)
        binding.superHeroesRV.adapter = adapter
    }
}