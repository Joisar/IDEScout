package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TZone

@Dao
interface TZoneDao {
    @Query("SELECT * FROM t_zone")
    fun getTZones(): List<TZone>

    @Insert
    fun insertTZones(vararg TZones: TZone)

    @Update
    fun updateTZone(TZone: TZone)

    @Delete
    fun deleteTZone(TZone: TZone)
}