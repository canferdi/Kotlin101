package com.ferdican.navigationcomponentsexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ferdican.navigationcomponentsexample.databinding.FragmentThirdPageBinding

class ThirdPageScreen : Fragment() {
    private lateinit var binding: FragmentThirdPageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdPageBinding.inflate(inflater, container, false)

        binding.buttonBack3.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.thirdToSecond)
        }

        return binding.root
    }


}