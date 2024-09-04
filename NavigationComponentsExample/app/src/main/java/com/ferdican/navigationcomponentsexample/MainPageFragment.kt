package com.ferdican.navigationcomponentsexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ferdican.navigationcomponentsexample.databinding.FragmentMainPageBinding


class MainPageFragment : Fragment() {
    private lateinit var binding: FragmentMainPageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainPageBinding.inflate(inflater, container, false)

        binding.buttonNext.setOnClickListener {
            val name = binding.editTextName.text.toString()
            val surname = binding.editTextSurname.text.toString()
            val age = binding.editTextAge.text.toString().toInt()
            val person = Person(name, surname, age)

            Navigation.findNavController(it)
                .navigate(MainPageFragmentDirections.toSecondPage(person))
        }

        return binding.root
    }


}