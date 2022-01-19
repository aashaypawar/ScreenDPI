package org.geeksforgeeks.screendpi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declaring and Initializing the TextView from the layout file
        val mTextView = findViewById<TextView>(R.id.text_view_1)

        // Fetching the screen DPI value
        val mScreenDPI = resources.displayMetrics.density

        mTextView.text = mScreenDPI.toString()

    }
}