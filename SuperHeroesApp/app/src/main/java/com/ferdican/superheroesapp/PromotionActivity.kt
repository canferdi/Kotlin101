package com.ferdican.superheroesapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ferdican.superheroesapp.databinding.ActivityPromotionBinding

class PromotionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPromotionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPromotionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val intentFromAdapter = intent

        //intentFromAdapter.getSerializableExtra("chosenHero", SuperHero::class.java)
        val chosenHero = intentFromAdapter.getSerializableExtra("chosenHero") as SuperHero

        binding.imageView.setImageResource(chosenHero.image)
        binding.textViewName.text = chosenHero.name
        binding.textViewJob.text = chosenHero.job


    }
}