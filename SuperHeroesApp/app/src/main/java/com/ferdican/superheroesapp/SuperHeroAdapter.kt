package com.ferdican.superheroesapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.inputmethod.InputBinding
import androidx.recyclerview.widget.RecyclerView
import com.ferdican.superheroesapp.databinding.RecyclerRowBinding

class SuperHeroAdapter(val superHeroList: List<SuperHero>) :
    RecyclerView.Adapter<SuperHeroAdapter.SuperHeroViewHolder>() {


    class SuperHeroViewHolder(val binding: RecyclerRowBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SuperHeroViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return superHeroList.size
    }

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        holder.binding.textViewRecyclerView.text = superHeroList[position].name

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, PromotionActivity::class.java)
            intent.putExtra("chosenHero", superHeroList[position])
            holder.itemView.context.startActivity(intent)
        }
    }
}