package fr.ensim.android.courskotlinactivity2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import fr.ensim.android.courskotlinactivity2.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {
    companion object {
        const val TAG = "App.Activity2"
    }

    private lateinit var binding: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")

        binding = Activity2Binding.inflate(layoutInflater)

        // Get the Intent that started this activity and extract the string
        val nbClick = intent.getIntExtra(EXTRA_NB_CLICK, 0)
        Log.d(TAG, "nbClick ${nbClick}")

        // Capture the layout's TextView and set the string as its text
        binding.textViewSaveInstance.text = Integer.toString(nbClick);
        Log.d(TAG, "text ${binding.textViewSaveInstance.text}")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")

    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}