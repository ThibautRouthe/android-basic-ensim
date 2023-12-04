package fr.ensim.android.coursrecyclerview.ui

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import fr.ensim.android.coursrecyclerview.App
import fr.ensim.android.coursrecyclerview.R
import fr.ensim.android.coursrecyclerview.data.Town
import fr.ensim.android.coursrecyclerview.databinding.RecyclerviewItemBinding

class RecyclerTownAdapter(private val towns: List<Town>) :
    RecyclerView.Adapter<RecyclerTownAdapter.TownViewHolder>() {
    companion object {
        private const val TAG = "RecyclerTownAdapter"
    }

    init {
        Log.d(TAG, "RecyclerTownAdapter listTown : ${towns.size}")
    }

    inner class TownViewHolder(val binding: RecyclerviewItemBinding) :
        RecyclerView.ViewHolder(binding.root)


    override fun getItemCount(): Int = towns.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TownViewHolder {
        Log.d(TAG, "onCreateViewHolder")

        val binding = RecyclerviewItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return TownViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TownViewHolder, position: Int) {
        Log.d(TAG, "onBindViewHolder position=${position}")

        val town: Town = towns[position]
        Log.d(TAG, " town ${town.img}")

        try {
            val resID = App.applicationContext.resources.getIdentifier(
                town.img,
                "drawable",
                App.applicationContext.packageName
            )

            Glide.with(App.applicationContext)
                .load(resID)
                .into(holder.binding.imageViewTown)
        } catch (e: Throwable) {
            e.printStackTrace()
            Log.e(TAG, "Glide", e)
        }
        holder.binding.textViewTown1.text = town.name
        holder.binding.textViewTown2.text =
            "" + town.population + " " + App.applicationContext.getString(R.string.population)
    }

}