package com.dicoding.picodiploma.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.picodiploma.loginregister.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener{
            val email = binding.loginEmail.text.toString()
            val password = binding.loginPassword.text.toString()

            when {
                email.isEmpty() -> {
                    binding.loginEmail.error = "Email Required"
                    binding.loginEmail.requestFocus()
                    return@setOnClickListener
                }
                password.isEmpty() -> {
                    binding.loginPassword.error = "Password Required"
                    binding.loginPassword.requestFocus()
                    return@setOnClickListener
                }
                else -> login(email, password)
            }
        }

        binding.goToRegisterBtn.setOnClickListener{
            startActivity(Intent(this, RegisterActivity::class.java))
        }
        binding.goToForgotBtn.setOnClickListener{
            startActivity(Intent(this, ForgotPasswordActivity::class.java))
        }

        }
    }

    private fun login(email: String, password: String) {

    }


