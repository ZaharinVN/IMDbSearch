package com.example.imdbsearch

class MoviesResponse(val searchType: String,
                     val expression: String,
                     val results: List<Movie>)