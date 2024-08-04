package com.ferdican.basiccalculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.set
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ferdican.basiccalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun addition(view: View) {
        val num1 : Double? = binding.txtNum1.text.toString().toDoubleOrNull()
        val num2 : Double? = binding.txtNum2.text.toString().toDoubleOrNull()
        if (num1 != null && num2 != null) {
            val result = num1 + num2
            binding.txtResult.text = "Result: ${result}"
        } else {
            Toast.makeText(this, "Lütfen geçerli bir sayı giriniz", Toast.LENGTH_LONG).show()
        }
    }

    fun substraction(view: View) {
        val num1 : Double? = binding.txtNum1.text.toString().toDoubleOrNull()
        val num2 : Double? = binding.txtNum2.text.toString().toDoubleOrNull()
        if (num1 != null && num2 != null) {
            val result = num1 - num2
            binding.txtResult.text = "Result: ${result}"
        } else {
            Toast.makeText(this, "Lütfen geçerli bir sayı giriniz", Toast.LENGTH_LONG).show()
        }
    }

    fun multiply(view: View) {
        val num1 : Double? = binding.txtNum1.text.toString().toDoubleOrNull()
        val num2 : Double? = binding.txtNum2.text.toString().toDoubleOrNull()
        if (num1 != null && num2 != null) {
            val result = num1 * num2
            binding.txtResult.text = "Result: ${result}"
        } else {
            Toast.makeText(this, "Lütfen geçerli bir sayı giriniz", Toast.LENGTH_LONG).show()
        }
    }

    fun division(view: View) {
        val num1 : Double? = binding.txtNum1.text.toString().toDoubleOrNull()
        val num2 : Double? = binding.txtNum2.text.toString().toDoubleOrNull()
        if (num1 != null && num2 != null) {
            val result = num1 / num2
            binding.txtResult.text = "Result: ${result}"
        } else {
            Toast.makeText(this, "Lütfen geçerli bir sayı giriniz", Toast.LENGTH_LONG).show()
        }
    }

}