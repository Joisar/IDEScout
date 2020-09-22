package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TItemgroup

@Dao
interface TItemgroupDao {
    @Query("SELECT * FROM t_itemgroup")
    fun getTItemgroups(): List<TItemgroup>

    @Insert
    fun insertTItemgroups(vararg TItemgroups: TItemgroup)

    @Update
    fun updateTItemgroup(TItemgroup: TItemgroup)

    @Delete
    fun deleteTItemgroup(TItemgroup: TItemgroup)
}