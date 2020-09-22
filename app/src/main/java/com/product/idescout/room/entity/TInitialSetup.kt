package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(
    tableName = "t_InitialSetup",
    primaryKeys = ["Id"]
)
data class TInitialSetup(
    @ColumnInfo(name = "Id") val id: Long,
    @ColumnInfo(name = "Title") val title: String?,
    @ColumnInfo(name = "SubTitle") val subTitle: String?,
    @ColumnInfo(name = "bCompleted") val bCompleted: Long?,
    @ColumnInfo(name = "PercentProgress") val percentProgress: Long?,
    @ColumnInfo(name = "BtnText") val btnText: String
)
