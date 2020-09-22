package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TRegion

@Dao
interface TRegionDao {
    @Query("SELECT * FROM t_region")
    fun getTRegions(): List<TRegion>

    @Insert
    fun insertTRegions(vararg TRegions: TRegion)

    @Update
    fun updateTRegion(TRegion: TRegion)

    @Delete
    fun deleteTRegion(TRegion: TRegion)
}