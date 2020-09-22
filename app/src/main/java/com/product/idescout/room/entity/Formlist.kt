package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(
    tableName = "formlist",
    primaryKeys = ["FormId"]
)
data class Formlist(
    @ColumnInfo(name = "FormId") val formId: String,
    @ColumnInfo(name = "FormTitle") val formTitle: String?,
    @ColumnInfo(name = "bVisible") val bVisible: Long?
)
