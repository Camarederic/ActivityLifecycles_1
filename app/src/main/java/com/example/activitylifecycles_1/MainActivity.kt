package com.example.activitylifecycles_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MyLogMainActivity", "onCreate1")
        Log.d("MyLogMainActivity", "onCreate2")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MyLogMainActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MyLogMainActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyLogMainActivity", "onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyLogMainActivity", "onDestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyLogMainActivity", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MyLogMainActivity", "onRestart")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("MyLogMainActivity", "onSaveInstanceState")
    }

}