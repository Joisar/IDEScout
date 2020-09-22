package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TServiceArea

@Dao
interface TServiceAreaDao {
    @Query("SELECT * FROM t_service_area")
    fun getTServiceAreas(): List<TServiceArea>

    @Insert
    fun insertTServiceAreas(vararg TServiceAreas: TServiceArea)

    @Update
    fun updateTServiceArea(TServiceArea: TServiceArea)

    @Delete
    fun deleteTServiceArea(TServiceArea: TServiceArea)
}