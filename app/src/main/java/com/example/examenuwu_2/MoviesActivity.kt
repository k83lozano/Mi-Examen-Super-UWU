package com.example.examenuwu_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MoviesActivity : AppCompatActivity(){override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_movies)

    val movies = ArrayList<MovieModel>()
    val titles: Array<String> = resources.getStringArray(R.array.title)
    val metascores: Array<String> = resources.getStringArray(R.array.metascore)
    val imdbRatings: Array<String> = resources.getStringArray(R.array.imdbRating)
    val imdbVotes: Array<String> = resources.getStringArray(R.array.imdbVotes)

    for((i, element) in titles.withIndex()){
        val movie = MovieModel()
        movie.title = element
        movie.metascore = metascores[i]
        movie.imdbRating = imdbRatings[i]
        movie.imdbVotes = imdbVotes[i]
        movies.add(movie)
    }

    var recyclerView = findViewById<RecyclerView>(R.id.keki)
    var adapter=RecyclerAdapter(movies)
    recyclerView.adapter =adapter
}
}









