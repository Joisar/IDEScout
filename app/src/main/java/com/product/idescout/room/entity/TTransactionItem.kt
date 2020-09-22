package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "t_transaction_items",
    primaryKeys = ["FacilityId", "TransactionId", "TransactionItemId"],
    foreignKeys = [
        ForeignKey(
            entity = TFacilityProductLot::class,
            childColumns = arrayOf("FacilityId", "ProductStockId", "LotId"),
            parentColumns = arrayOf("FacilityId", "ProductStockId", "LotId")
        ),
        ForeignKey(
            entity = TTransaction::class,
            childColumns = arrayOf("FacilityId", "TransactionId"),
            parentColumns = arrayOf("FacilityId", "TransactionId")
        ),
        ForeignKey(
            entity = TItemlistMaster::class,
            childColumns = arrayOf("ItemNo"),
            parentColumns = arrayOf("ItemNo")
        ),
        ForeignKey(
            entity = TOrderbookitem::class,
            childColumns = arrayOf("OrderId", "OrderItemId"),
            parentColumns = arrayOf("OrderId", "OrderItemId")
        )],
    indices = [
        Index("FacilityId", "ProductStockId", "LotId"),
        Index("FacilityId", "TransactionId"),
        Index("ItemNo"),
        Index("OrderId", "OrderItemId")]
)
data class TTransactionItem(
    @ColumnInfo(name = "FacilityId") val facilityId: Long,
    @ColumnInfo(name = "TransactionId") val transactionId: Long,
    @ColumnInfo(name = "TransactionItemId") val transactionItemId: Long,
    @ColumnInfo(name = "ProductStockId") val productStockId: Long,
    @ColumnInfo(name = "ItemNo") val itemNo: Long,
    @ColumnInfo(name = "LotId") val lotId: Long?,
    @ColumnInfo(name = "BatchNo") val batchNo: String?,
    @ColumnInfo(name = "ExpiryDate") val expiryDate: String?,
    @ColumnInfo(name = "BarCode") val barCode: String?,
    @ColumnInfo(name = "AdjTypeId") val adjTypeId: Long?,
    @ColumnInfo(name = "AdjDetails") val adjDetails: String?,
    @ColumnInfo(name = "AdjCurrentBalance") val adjCurrentBalance: Long?,
    @ColumnInfo(name = "Quantity") val quantity: Long?,
    @ColumnInfo(name = "PurchasePrice") val purchasePrice: Long?,
    @ColumnInfo(name = "UnitPrice") val unitPrice: Long?,
    @ColumnInfo(name = "VatPerc") val vatPerc: Long?,
    @ColumnInfo(name = "LineTotalPrice") val lineTotalPrice: Long?,
    @ColumnInfo(name = "UpdateBy") val updateBy: Long?,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?,
    @ColumnInfo(name = "OrderId") val orderId: Long?,
    @ColumnInfo(name = "OrderItemId") val orderItemId: Long?,
    @ColumnInfo(name = "IsPositive") val isPositive: Long?,
    @ColumnInfo(name = "OrderedQuantity") val orderedQuantity: Long?,
    @ColumnInfo(name = "OrderRemainingQty") val orderRemainingQty: Long?
)
