package lt.vgrabauskas.foodrecipesapp.data

import lt.vgrabauskas.foodrecipesapp.data.network.FoodRecipesApi
import lt.vgrabauskas.foodrecipesapp.models.FoodJoke
import lt.vgrabauskas.foodrecipesapp.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {

    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.getRecipes(queries)
    }

    suspend fun searchRecipes(searchQuery: Map<String, String>): Response<FoodRecipe> {
        return foodRecipesApi.searchRecipes(searchQuery)
    }

    suspend fun getFoodJoke(apiKey:String): Response<FoodJoke> {
        return foodRecipesApi.getFoodJoke(apiKey)
    }
}