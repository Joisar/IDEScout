package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TCfmA7masterstockstatus

@Dao
interface TCfmA7masterstockstatusDao {
    @Query("SELECT * FROM t_cfm_a7masterstockstatus")
    fun getTCfmA7masterstockstatuses(): List<TCfmA7masterstockstatus>

    @Insert
    fun insertTCfmA7masterstockstatuses(vararg TCfmA7masterstockstatuses: TCfmA7masterstockstatus)

    @Update
    fun updateTCfmA7masterstockstatus(TCfmA7masterstockstatus: TCfmA7masterstockstatus)

    @Delete
    fun deleteTCfmA7masterstockstatus(TCfmA7masterstockstatus: TCfmA7masterstockstatus)
}