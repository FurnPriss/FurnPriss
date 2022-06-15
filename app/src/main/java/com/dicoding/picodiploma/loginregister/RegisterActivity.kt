package com.dicoding.picodiploma.loginregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.picodiploma.loginregister.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.registerBtn.setOnClickListener{
            val username = binding.registerUsername.text.toString()
            val email = binding.registerEmail.text.toString()
            val password = binding.registerPassword.text.toString()


            if (username.isEmpty()){
                binding.registerUsername.error = "Username Required"
                binding.registerUsername.requestFocus()
                return@setOnClickListener
            }
            if (email.isEmpty()){
                binding.registerEmail.error = "Email Required"
                binding.registerEmail.requestFocus()
                return@setOnClickListener
            }
            if (password.isEmpty()){
                binding.registerPassword.error = "Password Required"
                binding.registerPassword.requestFocus()
                return@setOnClickListener
            }
            registerUser(username, email, password)
            binding.registerBtn.setOnClickListener{
                startActivity(Intent(this, MainActivity::class.java))
            }

        }
    }

    private fun registerUser( username: String, email: String, password: String) {

    }
}

