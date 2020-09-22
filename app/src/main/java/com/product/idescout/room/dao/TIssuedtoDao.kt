package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TIssuedto

@Dao
interface TIssuedtoDao {
    @Query("SELECT * FROM t_issuedto")
    fun getTIssuedtos(): List<TIssuedto>

    @Insert
    fun insertTIssuedtos(vararg TIssuedtos: TIssuedto)

    @Update
    fun updateTIssuedto(TIssuedto: TIssuedto)

    @Delete
    fun deleteTIssuedto(TIssuedto: TIssuedto)
}