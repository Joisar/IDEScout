package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TCfmA7stockstatus

@Dao
interface TCfmA7stockstatusDao {
    @Query("SELECT * FROM t_cfm_a7stockstatus")
    fun getTCfmA7stockstatuses(): List<TCfmA7stockstatus>

    @Insert
    fun insertTCfmA7stockstatuses(vararg TCfmA7stockstatuses: TCfmA7stockstatus)

    @Update
    fun updateTCfmA7stockstatus(TCfmA7stockstatus: TCfmA7stockstatus)

    @Delete
    fun deleteTCfmA7stockstatus(TCfmA7stockstatus: TCfmA7stockstatus)
}