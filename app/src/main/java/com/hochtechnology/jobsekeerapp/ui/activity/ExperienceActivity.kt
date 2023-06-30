package com.hochtechnology.jobsekeerapp.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.hochtechnology.jobsekeerapp.R
import com.hochtechnology.jobsekeerapp.databinding.ActivityExperienceBinding
import com.hochtechnology.jobsekeerapp.databinding.BottomSheetExperienceBinding


class ExperienceActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExperienceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_experience)

        initToolbar()
        binding.tvWorkExp.setOnClickListener { showBottomSheetDialog() }

        binding.btnNext.setOnClickListener {
            val intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }
    }

    private fun initToolbar() {
        setSupportActionBar(binding.tbView.toolbar);
        supportActionBar?.setDisplayShowTitleEnabled(false);
        binding.tbView.tvTitle.text=resources.getString(R.string.activity_title_work_experience)
    }

    private fun showBottomSheetDialog() {
        val bottomSheetDialog = BottomSheetDialog(this)
        val bindingSheet = DataBindingUtil.inflate<BottomSheetExperienceBinding>(
            layoutInflater,
            R.layout.bottom_sheet_experience,
            null,
            false
        )
        bottomSheetDialog.setContentView(bindingSheet.root)
        bindingSheet.ivClose.setOnClickListener { bottomSheetDialog.dismiss() }
        bottomSheetDialog.show()
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