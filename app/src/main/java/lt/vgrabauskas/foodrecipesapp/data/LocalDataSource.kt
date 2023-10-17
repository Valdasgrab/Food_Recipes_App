package lt.vgrabauskas.foodrecipesapp.data

import kotlinx.coroutines.flow.Flow
import lt.vgrabauskas.foodrecipesapp.data.database.RecipesDao
import lt.vgrabauskas.foodrecipesapp.data.database.RecipesEntity
import javax.inject.Inject

class LocalDataSource @Inject constructor(
    private val recipesDao: RecipesDao
) {
    fun readDatabase(): Flow<List<RecipesEntity>> {
        return recipesDao.readRecipes()
    }

    suspend fun insertRecipes(recipesEntity: RecipesEntity) {
        recipesDao.insertRecipes(recipesEntity)
    }

}