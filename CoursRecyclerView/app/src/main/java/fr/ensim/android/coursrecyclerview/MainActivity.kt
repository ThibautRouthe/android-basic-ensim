package fr.ensim.android.coursrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import fr.ensim.android.coursrecyclerview.databinding.ActivityMainBinding
import fr.ensim.android.coursrecyclerview.service.ServiceTown
import fr.ensim.android.coursrecyclerview.ui.RecyclerTownAdapter

class MainActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "MainActivity"
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(TAG, "onCreate")
        binding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.recyclerview.layoutManager = LinearLayoutManager(this)
        binding.recyclerview.adapter = RecyclerTownAdapter(ServiceTown.towns)
    }
}