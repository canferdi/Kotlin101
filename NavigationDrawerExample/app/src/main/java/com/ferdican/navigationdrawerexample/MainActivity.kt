package com.ferdican.navigationdrawerexample

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.ferdican.navigationdrawerexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView2) as NavHostFragment
        NavigationUI.setupWithNavController(binding.navigationView, navHostFragment.navController)

        binding.toolbar.title = "Title"

        val toggle = ActionBarDrawerToggle(this, binding.main, binding.toolbar, 0, 0)
        binding.main.addDrawerListener(toggle)
        toggle.syncState()

        val title = binding.navigationView.inflateHeaderView(R.layout.navigation_title)
        val textViewTitle = title.findViewById(R.id.textViewTitle) as TextView
        textViewTitle.text = "Hello"
    }

    override fun onBackPressed() {
        if (binding.main.isDrawerOpen(GravityCompat.START)) {
            binding.main.closeDrawer(GravityCompat.START)
        } else {
            onBackPressedDispatcher.onBackPressed()
            super.onBackPressed()
        }

    }


}