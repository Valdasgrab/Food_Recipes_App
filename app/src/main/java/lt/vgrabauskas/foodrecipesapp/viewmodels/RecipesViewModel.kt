package lt.vgrabauskas.foodrecipesapp.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import lt.vgrabauskas.foodrecipesapp.util.Constants
import lt.vgrabauskas.foodrecipesapp.util.Constants.Companion.API_KEY
import lt.vgrabauskas.foodrecipesapp.util.Constants.Companion.QUERY_ADD_RECIPE_INFORMATION
import lt.vgrabauskas.foodrecipesapp.util.Constants.Companion.QUERY_API_KEY
import lt.vgrabauskas.foodrecipesapp.util.Constants.Companion.QUERY_DIET
import lt.vgrabauskas.foodrecipesapp.util.Constants.Companion.QUERY_FILL_INGREDIENTS
import lt.vgrabauskas.foodrecipesapp.util.Constants.Companion.QUERY_NUMBER
import lt.vgrabauskas.foodrecipesapp.util.Constants.Companion.QUERY_TYPE

class RecipesViewModel(application: Application) : AndroidViewModel(application) {

    fun applyQueries(): HashMap<String, String> {
        val queries: HashMap<String, String> = HashMap()

        queries[QUERY_NUMBER] = "50"
        queries[QUERY_API_KEY] = API_KEY
        queries[QUERY_TYPE] = "main course"
        queries[QUERY_DIET] = "primal"
        queries[QUERY_ADD_RECIPE_INFORMATION] = "true"
        queries[QUERY_FILL_INGREDIENTS] = "true"
        return queries
    }
}