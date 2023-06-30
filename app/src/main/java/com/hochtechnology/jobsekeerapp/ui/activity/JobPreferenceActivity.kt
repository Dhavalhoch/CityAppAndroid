package com.hochtechnology.jobsekeerapp.ui.activity

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.hochtechnology.jobsekeerapp.R
import com.hochtechnology.jobsekeerapp.databinding.ActivityJobPreferenceBinding

class JobPreferenceActivity : AppCompatActivity() {

    private lateinit var binding: ActivityJobPreferenceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_job_preference)

        initToolbar()

        binding.btnNext.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }

    private fun initToolbar() {
        setSupportActionBar(binding.tbView.toolbar);
        supportActionBar?.setDisplayShowTitleEnabled(false);
        binding.tbView.tvTitle.text=resources.getString(R.string.activity_title_job_preferences)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressedDispatcher.onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}