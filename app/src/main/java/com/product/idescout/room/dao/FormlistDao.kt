package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.Formlist

@Dao
interface FormlistDao {
    @Query("SELECT * FROM formlist")
    fun getFormlists(): List<Formlist>

    @Insert
    fun insertFormlists(vararg formlists: Formlist)

    @Update
    fun updateFormlist(formlist: Formlist)

    @Delete
    fun deleteFormlist(formlist: Formlist)
}