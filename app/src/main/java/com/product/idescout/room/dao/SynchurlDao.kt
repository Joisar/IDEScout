package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.Synchurl

@Dao
interface SynchurlDao {
    @Query("SELECT * FROM synchurl")
    fun getSynchurls(): List<Synchurl>

    @Insert
    fun insertSynchurls(vararg synchurls: Synchurl)

    @Update
    fun updateSynchurl(synchurl: Synchurl)

    @Delete
    fun deleteSynchurl(synchurl: Synchurl)
}