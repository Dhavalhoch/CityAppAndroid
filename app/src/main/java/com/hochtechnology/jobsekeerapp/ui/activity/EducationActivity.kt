package com.hochtechnology.jobsekeerapp.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.hochtechnology.jobsekeerapp.R
import com.hochtechnology.jobsekeerapp.databinding.ActivityEducationBinding
import com.hochtechnology.jobsekeerapp.databinding.BottomSheetCertificateBinding
import com.hochtechnology.jobsekeerapp.databinding.BottomSheetEducationBinding


class EducationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEducationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_education)

        initToolbar()
        binding.tvEducation.setOnClickListener { showBottomSheetEducationDialog() }
        binding.tvCertification.setOnClickListener { showBottomSheetCertificateDialog() }

        binding.btnNext.setOnClickListener {
            val intent = Intent(this, JobPreferenceActivity::class.java)
            startActivity(intent)
        }
    }

    private fun initToolbar() {
        setSupportActionBar(binding.tbView.toolbar);
        supportActionBar?.setDisplayShowTitleEnabled(false);
        binding.tbView.tvTitle.text=resources.getString(R.string.activity_title_your_education)
    }

    private fun showBottomSheetEducationDialog() {
        val bottomSheetDialog = BottomSheetDialog(this)
        val bindingSheet = DataBindingUtil.inflate<BottomSheetEducationBinding>(
            layoutInflater,
            R.layout.bottom_sheet_education,
            null,
            false
        )
        bottomSheetDialog.setContentView(bindingSheet.root)
        bindingSheet.ivClose.setOnClickListener { bottomSheetDialog.dismiss() }
        bottomSheetDialog.show()
    }

    private fun showBottomSheetCertificateDialog() {
        val bottomSheetDialog = BottomSheetDialog(this)
        val bindingSheet = DataBindingUtil.inflate<BottomSheetCertificateBinding>(
            layoutInflater,
            R.layout.bottom_sheet_certificate,
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