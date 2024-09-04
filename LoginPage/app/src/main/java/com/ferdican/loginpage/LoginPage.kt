package com.ferdican.loginpage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ferdican.loginpage.databinding.FragmentLoginPageBinding


class LoginPage : Fragment() {
    private lateinit var binding: FragmentLoginPageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginPageBinding.inflate(inflater, container, false)

        val username = "ferdican"
        val password = "1234"

        binding.buttonLogin.setOnClickListener {
            if (binding.editTextUsername.text.toString() == username && binding.editTextPassword.text.toString() == password)

                Navigation.findNavController(it).navigate(R.id.action_loginPage_to_secondPage)

        }

        return binding.root
    }

}