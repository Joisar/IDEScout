package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "t_orderbook",
    primaryKeys = ["OrderId"],
    foreignKeys = [
        ForeignKey(
            entity = TFacility::class,
            childColumns = arrayOf("FacilityId"),
            parentColumns = arrayOf("FacilityId")
        ),
        ForeignKey(
            entity = TFacility::class,
            childColumns = arrayOf("OrderingFrom"),
            parentColumns = arrayOf("FacilityId")
        ),
        ForeignKey(
            entity = TSupplier::class,
            childColumns = arrayOf("SupplierId"),
            parentColumns = arrayOf("SupplierId")
        )],
    indices = [
        Index("FacilityId"),
        Index("OrderingFrom"),
        Index("SupplierId")]
)
data class TOrderbook(
    @ColumnInfo(name = "OrderId") val orderId: Long,
    @ColumnInfo(name = "FacilityId") val facilityId: Long,
    @ColumnInfo(name = "OrderTypeId") val orderTypeId: Long,
    @ColumnInfo(name = "OrderDate") val orderDate: String,
    @ColumnInfo(name = "OrderNo") val orderNo: String,
    @ColumnInfo(name = "OrderBy") val orderBy: Long,
    @ColumnInfo(name = "ApprovedBy") val approvedBy: Long,
    @ColumnInfo(name = "bReceived") val bReceived: Long?,
    @ColumnInfo(name = "OrderingFrom") val orderingFrom: Long,
    @ColumnInfo(name = "SupplierId") val supplierId: Long?,
    @ColumnInfo(name = "bCompleted") val bCompleted: Long?,
    @ColumnInfo(name = "Remarks") val remarks: String,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?
)
