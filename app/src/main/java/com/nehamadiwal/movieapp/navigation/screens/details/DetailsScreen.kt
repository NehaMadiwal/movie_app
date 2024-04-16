package com.nehamadiwal.movieapp.navigation.screens.details

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun DetailsScreen(navController: NavController, movieData: String?) {
    Text(text = movieData.toString())
}