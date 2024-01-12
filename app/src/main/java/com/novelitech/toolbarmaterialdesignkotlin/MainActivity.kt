package com.novelitech.toolbarmaterialdesignkotlin

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.novelitech.toolbarmaterialdesignkotlin.databinding.MainActivityBinding
import com.novelitech.toolbarmaterialdesignkotlin.ui.theme.ToolbarMaterialDesignKotlinTheme

class MainActivity : ComponentActivity() {

    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = MainActivityBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnGoToExOne.setOnClickListener {
            Intent(this, ExampleStyleFromFileActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}
