package lt.vgrabauskas.foodrecipesapp.models


import com.google.gson.annotations.SerializedName

data class FoodRecipe(
    @SerializedName("recipes")
    val results: List<Result>
)