package com.bell.login

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bell.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var usernameInput: EditText
    lateinit var toastBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        usernameInput = findViewById(R.id.username_input)
        toastBtn = findViewById(R.id.btn_toast)

        toastBtn.setOnClickListener {
            val username = usernameInput.text.toString()
            Toast.makeText(this, username, Toast.LENGTH_SHORT).show()
        }
    }
}
