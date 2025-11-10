package com.hninhninwai.xyz.hiltapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

// AndroidEntryPoint
// Mark android components (Activities, Fragments,..) as injection targets
// It allows Hilt to provide dependencies directly into these components
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    // Inject Repository
    @Inject
    lateinit var greetingRepository: GreetingRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find the text view
        val greetingText : TextView = findViewById(R.id.greetingText)
        greetingText.text = greetingRepository.sayHello()
    }
}