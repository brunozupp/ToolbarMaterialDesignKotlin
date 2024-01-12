package com.novelitech.toolbarmaterialdesignkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.novelitech.toolbarmaterialdesignkotlin.databinding.ActivityExampleStyleFromFileBinding

class ExampleStyleFromFileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExampleStyleFromFileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExampleStyleFromFileBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val toolbar = binding.toolbar

        setActionBar(toolbar)

        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setDisplayShowHomeEnabled(true)

        toolbar.setNavigationOnClickListener {
            finish()
        }
    }
}