package com.ferdican.navigationcomponentsexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.ferdican.navigationcomponentsexample.databinding.FragmentSecondPageBinding


class SecondPageFragment : Fragment() {
    private lateinit var binding: FragmentSecondPageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondPageBinding.inflate(inflater, container, false)
        val bundle: SecondPageFragmentArgs by navArgs()

        val person = bundle.person
        val name = person.name
        val surname = person.surname
        val age = person.age

        binding.textView2.text = "Welcome $name $surname"

        binding.buttonNext2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.toThirdPage)
        }

        binding.buttonBack2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.secondToMain)
        }

        return binding.root
    }


}