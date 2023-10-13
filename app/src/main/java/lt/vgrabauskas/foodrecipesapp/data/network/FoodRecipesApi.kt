package lt.vgrabauskas.foodrecipesapp.data.network

import lt.vgrabauskas.foodrecipesapp.models.FoodRecipe
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface FoodRecipesApi {

    @GET("/recipes/random")
    suspend fun getRecipes(
        @QueryMap queries:Map<String, String>
    ): Response<FoodRecipe>
}