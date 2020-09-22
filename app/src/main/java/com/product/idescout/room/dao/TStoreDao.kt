package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TStore

@Dao
interface TStoreDao {
    @Query("SELECT * FROM t_store")
    fun getTStores(): List<TStore>

    @Insert
    fun insertTStores(vararg TStores: TStore)

    @Update
    fun updateTStore(TStore: TStore)

    @Delete
    fun deleteTStore(TStore: TStore)
}