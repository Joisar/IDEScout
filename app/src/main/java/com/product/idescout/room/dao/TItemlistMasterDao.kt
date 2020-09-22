package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TItemlistMaster

@Dao
interface TItemlistMasterDao {
    @Query("SELECT * FROM t_itemlist_master")
    fun getTItemlistMasters(): List<TItemlistMaster>

    @Insert
    fun insertTItemlistMasters(vararg TItemlistMasters: TItemlistMaster)

    @Update
    fun updateTItemlistMaster(TItemlistMaster: TItemlistMaster)

    @Delete
    fun deleteTItemlistMaster(TItemlistMaster: TItemlistMaster)
}