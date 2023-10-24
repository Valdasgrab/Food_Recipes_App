package lt.vgrabauskas.foodrecipesapp.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import lt.vgrabauskas.foodrecipesapp.models.Result
import lt.vgrabauskas.foodrecipesapp.util.Constants.Companion.FAVORITE_RECIPES_TABLE

@Entity(tableName = FAVORITE_RECIPES_TABLE)
class FavoritesEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var result: Result
)