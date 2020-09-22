package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "t_stocktakemaster",
    primaryKeys = ["StockTakeId"],
    foreignKeys = [
        ForeignKey(
            entity = TFacility::class,
            childColumns = arrayOf("FacilityId"),
            parentColumns = arrayOf("FacilityId")
        ),
        ForeignKey(
            entity = TStore::class,
            childColumns = arrayOf("StoreId"),
            parentColumns = arrayOf("StoreId")
        )],
    indices = [
        Index("FacilityId"),
        Index("StoreId")]
)
data class TStocktakemaster(
    @ColumnInfo(name = "StockTakeId") val stockTakeId: Long,
    @ColumnInfo(name = "StockTakeDate") val stockTakeDate: String,
    @ColumnInfo(name = "CompleteDate") val completeDate: String?,
    @ColumnInfo(name = "IsCompleted") val isCompleted: Long,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?,
    @ColumnInfo(name = "FacilityId") val facilityId: Long,
    @ColumnInfo(name = "PreparedBy") val preparedBy: Long?,
    @ColumnInfo(name = "ApprovedBy") val approvedBy: Long?,
    @ColumnInfo(name = "StoreId") val storeId: Long
)
