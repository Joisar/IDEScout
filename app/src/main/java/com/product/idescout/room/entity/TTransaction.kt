package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "t_transaction",
    primaryKeys = ["FacilityId", "TransactionId"],
    foreignKeys = [
        ForeignKey(
            entity = TSupplier::class,
            childColumns = arrayOf("SupplierId"),
            parentColumns = arrayOf("SupplierId")
        ),
        ForeignKey(
            entity = TIssuedto::class,
            childColumns = arrayOf("IssuedTo"),
            parentColumns = arrayOf("IssuedToId")
        ),
        ForeignKey(
            entity = TFacility::class,
            childColumns = arrayOf("ReceiveFrom"),
            parentColumns = arrayOf("FacilityId")
        ),
        ForeignKey(
            entity = TFacility::class,
            childColumns = arrayOf("IssuedToFacility"),
            parentColumns = arrayOf("FacilityId")
        ),
        ForeignKey(
            entity = TOrderbook::class,
            childColumns = arrayOf("OrderId"),
            parentColumns = arrayOf("OrderId")
        ),
        ForeignKey(
            entity = TStore::class,
            childColumns = arrayOf("StoreId"),
            parentColumns = arrayOf("StoreId")
        )],
    indices = [
        Index("SupplierId"),
        Index("IssuedTo"),
        Index("ReceiveFrom"),
        Index("IssuedToFacility"),
        Index("OrderId"),
        Index("StoreId")]
)
data class TTransaction(
    @ColumnInfo(name = "FacilityId") val facilityId: Long,
    @ColumnInfo(name = "TransactionId") val transactionId: Long,
    @ColumnInfo(name = "TransactionTypeId") val transactionTypeId: Long,
    @ColumnInfo(name = "TransactionNo") val transactionNo: String,
    @ColumnInfo(name = "TransactionDate") val transactionDate: String,
    @ColumnInfo(name = "SupplierId") val supplierId: Long?,
    @ColumnInfo(name = "SupplierInvNo") val supplierInvNo: String?,
    @ColumnInfo(name = "SupplierInvDate") val supplierInvDate: String?,
    @ColumnInfo(name = "bStockUpdated") val bStockUpdated: Long,
    @ColumnInfo(name = "UpdateBy") val updateBy: Long?,
    @ColumnInfo(name = "Remarks") val remarks: String?,
    @ColumnInfo(name = "IssuedTo") val issuedTo: Long?,
    @ColumnInfo(name = "ReceiveFrom") val receiveFrom: Long?,
    @ColumnInfo(name = "IssuedToFacility") val issuedToFacility: Long?,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?,
    @ColumnInfo(name = "OrderId") val orderId: Long?,
    @ColumnInfo(name = "PreparedBy") val preparedBy: Long?,
    @ColumnInfo(name = "ApprovedBy") val approvedBy: Long?,
    @ColumnInfo(name = "InvFrom") val invFrom: Long?,
    @ColumnInfo(name = "AdjTypeId") val adjTypeId: Long?,
    @ColumnInfo(name = "StoreId") val storeId: Long
)
