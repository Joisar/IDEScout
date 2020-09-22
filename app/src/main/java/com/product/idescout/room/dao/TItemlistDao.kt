package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TItemlist

@Dao
interface TItemlistDao {
    @Query("SELECT * FROM t_itemlist")
    fun getTItemlists(): List<TItemlist>

    @Insert
    fun insertTItemlists(vararg TItemlists: TItemlist)

    @Update
    fun updateTItemlist(TItemlist: TItemlist)

    @Delete
    fun deleteTItemlist(TItemlist: TItemlist)
}