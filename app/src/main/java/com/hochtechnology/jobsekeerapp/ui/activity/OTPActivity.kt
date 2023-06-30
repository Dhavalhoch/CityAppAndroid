package com.hochtechnology.jobsekeerapp.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.hochtechnology.jobsekeerapp.R
import com.hochtechnology.jobsekeerapp.databinding.ActivityChooseRoleBinding
import com.hochtechnology.jobsekeerapp.databinding.ActivityLoginBinding
import com.hochtechnology.jobsekeerapp.databinding.ActivityOtpBinding
import com.hochtechnology.jobsekeerapp.databinding.ActivitySplashBinding

class OTPActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOtpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_otp)

        binding.btnNext.setOnClickListener {
            val intent = Intent(this, SetupProfileActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}