package fr.ensim.android.courskotlinactivity2

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.android.material.snackbar.Snackbar

import fr.ensim.android.courskotlinactivity2.databinding.ActivityMainBinding

const val EXTRA_NB_CLICK = "MainActivity.NB_CLICK"

class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG = "App.MainActivity"
        const val KEY_CLICK = "click"
    }

    private var nbClickSaveInstance = 0;
    private var nbClickSharePrefs = 0;

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate")

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.button2.setOnClickListener {
            nbClickSaveInstance++;
            nbClickSharePrefs++;
            binding.textViewSaveInstance.text = Integer.toString(nbClickSaveInstance)
            binding.textViewSharePrefs.text = Integer.toString(nbClickSharePrefs)

            Log.d(TAG, "onClickButton1")
            Snackbar.make(it, "onClickButton1", Snackbar.LENGTH_SHORT).show()
        }
        binding.button3.setOnClickListener {
            val intent = Intent(this, Activity2::class.java).apply {
                putExtra(EXTRA_NB_CLICK, nbClickSaveInstance)
            }
            startActivity(intent)
        }

        if (savedInstanceState != null) {
            nbClickSaveInstance = savedInstanceState.getInt(KEY_CLICK, 0)
            binding.textViewSaveInstance.text = Integer.toString(nbClickSaveInstance)
        }
        val sharedPref = getPreferences(Context.MODE_PRIVATE) ?: return
        nbClickSharePrefs = sharedPref.getInt(KEY_CLICK,0);
        binding.textViewSharePrefs.text = Integer.toString(nbClickSharePrefs)
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(TAG, "onSaveInstanceState: ${nbClickSaveInstance}")
        outState.putInt(KEY_CLICK, nbClickSaveInstance)
        super.onSaveInstanceState(outState)
        saveSharePrefs();
    }

    fun onClickButton1(view: View) {
        val url = "http://www.google.fr"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }

    private fun saveSharePrefs() {
        val sharedPref = getPreferences(Context.MODE_PRIVATE) ?: return
        with(sharedPref.edit()) {
            putInt(KEY_CLICK, nbClickSharePrefs)
            apply()
        }
    }


}