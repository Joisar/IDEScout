package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "t_orderbookitems",
    primaryKeys = ["OrderItemId", "OrderId"],
    foreignKeys = [
        ForeignKey(
            entity = TOrderbook::class,
            childColumns = arrayOf("OrderId"),
            parentColumns = arrayOf("OrderId")
        ),
        ForeignKey(
            entity = TItemlistMaster::class,
            childColumns = arrayOf("ItemNo"),
            parentColumns = arrayOf("ItemNo")
        )],
    indices = [
        Index("OrderId"),
        Index("ItemNo")]
)
data class TOrderbookitem(
    @ColumnInfo(name = "OrderItemId") val orderItemId: Long,
    @ColumnInfo(name = "OrderId") val orderId: Long,
    @ColumnInfo(name = "FacilityId") val facilityId: Long,
    @ColumnInfo(name = "ItemNo") val itemNo: Long,
    @ColumnInfo(name = "UnitPrice") val unitPrice: Long?,
    @ColumnInfo(name = "AMC") val AMC: Long?,
    @ColumnInfo(name = "MinQty") val minQty: Long?,
    @ColumnInfo(name = "MaxQty") val maxQty: Long?,
    @ColumnInfo(name = "StockOnHand") val stockOnHand: Long?,
    @ColumnInfo(name = "CalcOrderQty") val calcOrderQty: Long?,
    @ColumnInfo(name = "ActualOrderQty") val actualOrderQty: Long?,
    @ColumnInfo(name = "ActualReceived") val actualReceived: Long?,
    @ColumnInfo(name = "AMCMonthCount") val AMCMonthCount: Long?,
    @ColumnInfo(name = "IsZeroReceived") val isZeroReceived: Long?,
    @ColumnInfo(name = "Remark") val remark: String?,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?
)
