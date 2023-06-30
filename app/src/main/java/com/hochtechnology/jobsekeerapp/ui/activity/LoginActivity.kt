package com.hochtechnology.jobsekeerapp.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.hochtechnology.jobsekeerapp.R
import com.hochtechnology.jobsekeerapp.databinding.ActivityChooseRoleBinding
import com.hochtechnology.jobsekeerapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)

        binding.btnSendCode.setOnClickListener {
            val intent = Intent(this, OTPActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.llGoogleLogin.setOnClickListener {
            val intent = Intent(this, OTPActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}