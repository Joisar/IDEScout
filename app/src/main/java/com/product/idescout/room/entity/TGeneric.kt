package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(
    tableName = "t_generics",
    primaryKeys = ["GenericId"]
)
data class TGeneric(
    @ColumnInfo(name = "GenericId") val genericId: String,
    @ColumnInfo(name = "GenericName") val genericName: String,
    @ColumnInfo(name = "GenericFullName") val genericFullName: String,
    @ColumnInfo(name = "Strength") val strength: String,
    @ColumnInfo(name = "DosageFormId") val dosageFormId: Long?,
    @ColumnInfo(name = "RouteId") val routeId: Long?,
    @ColumnInfo(name = "ATCCode") val ATCCode: String?,
    @ColumnInfo(name = "WHOStatus") val WHOStatus: String?,
    @ColumnInfo(name = "IsActive") val isActive: Long?,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?
)
