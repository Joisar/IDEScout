package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TProductgroupMapping

@Dao
interface TProductgroupMappingDao {
    @Query("SELECT * FROM t_productgroup_mapping")
    fun getTProductgroupMappings(): List<TProductgroupMapping>

    @Insert
    fun insertTProductgroupMappings(vararg TProductgroupMappings: TProductgroupMapping)

    @Update
    fun updateTProductgroupMapping(TProductgroupMapping: TProductgroupMapping)

    @Delete
    fun deleteTProductgroupMapping(TProductgroupMapping: TProductgroupMapping)
}