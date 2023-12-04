package fr.ensim.android.coursui

import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import fr.ensim.android.coursui.databinding.FragmentLayout1Binding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class Layout1Fragment : Fragment() {

    private var _binding: FragmentLayout1Binding? = null
    companion object {
        const val TAG = "Layout1Fragment"
    }
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentLayout1Binding.inflate(inflater, container, false)
        try {
//            Glide.with(this)
//                .load(R.drawable.ensim)
//                .into(binding.imageView)

            binding.imageView.setImageResource(R.drawable.ensim)
            Log.d(TAG, "Glide")

        } catch (e: Throwable) {
            Log.e(TAG, "Glide", e)
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}