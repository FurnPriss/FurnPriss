package com.dicoding.picodiploma.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.picodiploma.loginregister.databinding.ActivityForgotPasswordBinding

class ForgotPasswordActivity : AppCompatActivity() {
    private lateinit var binding: ActivityForgotPasswordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.forgotBtn.setOnClickListener{
            val email = binding.forgotEmail.text.toString()
            val password = binding.forgotNewSandi.text.toString()
            val repassword = binding.forgotSandiLagi.text.toString()

            when {
                email.isEmpty() -> {
                    binding.forgotEmail.error = "Email Required"
                    binding.forgotEmail.requestFocus()
                    return@setOnClickListener
                }
                password.isEmpty() -> {
                    binding.forgotNewSandi.error = "Password Required"
                    binding.forgotNewSandi.requestFocus()
                    return@setOnClickListener
                }
                repassword.isEmpty() ->{
                    binding.forgotSandiLagi.error = " Password Required"
                    binding.forgotSandiLagi.requestFocus()
                    return@setOnClickListener
                }
                else -> forgot(email, password, repassword)
            }
            binding.forgotBtn.setOnClickListener{
                startActivity(Intent(this, MainActivity::class.java))
            }
        }
    }

    private fun forgot(email: String, password: String, repassword: String) {
        TODO("Not yet implemented")
    }
}