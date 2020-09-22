package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TInitialSetup

@Dao
interface TInitialSetupDao {
    @Query("SELECT * FROM t_InitialSetup")
    fun getTInitialSetups(): List<TInitialSetup>

    @Insert
    fun insertTInitialSetups(vararg TInitialSetups: TInitialSetup)

    @Update
    fun updateTInitialSetup(TInitialSetup: TInitialSetup)

    @Delete
    fun deleteTInitialSetup(TInitialSetup: TInitialSetup)
}