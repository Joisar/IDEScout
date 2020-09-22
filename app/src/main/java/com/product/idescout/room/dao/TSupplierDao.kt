package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TSupplier

@Dao
interface TSupplierDao {
    @Query("SELECT * FROM t_supplier")
    fun getTSuppliers(): List<TSupplier>

    @Insert
    fun insertTSuppliers(vararg TSuppliers: TSupplier)

    @Update
    fun updateTSupplier(TSupplier: TSupplier)

    @Delete
    fun deleteTSupplier(TSupplier: TSupplier)
}