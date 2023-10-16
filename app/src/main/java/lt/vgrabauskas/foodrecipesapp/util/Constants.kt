package lt.vgrabauskas.foodrecipesapp.util

class Constants {

    companion object {

        const val BASE_URL ="https://api.spoonacular.com"
        const val API_KEY = "446752a4dbd64f568a9646857227ded1"

        const val QUERY_NUMBER = "number"
        const val QUERY_API_KEY = "apiKey"
        const val QUERY_TYPE = "type"
        const val QUERY_DIET = "vegan"
        const val QUERY_ADD_RECIPE_INFORMATION = "addRecipeInformation"
        const val QUERY_FILL_INGREDIENTS = "fillIngredients"

        //Room database
        const val DATABASE_NAME = "recipes_database"
        const val RECIPES_TABLE = "recipes_table"
    }
}