package com.example.examenuwu_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class RecyclerAdapter(private val feedEntries: List<MovieModel>) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtTitle: TextView = view.findViewById(R.id.Title)
        val txtMetascore: TextView = view.findViewById(R.id.Score)
        val txtImbdRating: TextView = view.findViewById(R.id.Rating)
        val txtImdbVotes: TextView = view.findViewById(R.id.Votes)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.activity_cartita, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentEntry: MovieModel = feedEntries[position]
        holder.txtTitle.text = currentEntry.title
        holder.txtMetascore.text = currentEntry.metascore
        holder.txtImbdRating.text = currentEntry.imdbRating
        holder.txtImdbVotes.text= currentEntry.imdbVotes
    }

    override fun getItemCount() = feedEntries.size
}