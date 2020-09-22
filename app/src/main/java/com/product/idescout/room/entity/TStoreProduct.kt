package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "t_store_product",
    primaryKeys = ["StoreId", "ItemNo"],
    foreignKeys = [
        ForeignKey(
            entity = TStore::class,
            childColumns = arrayOf("StoreId"),
            parentColumns = arrayOf("StoreId")
        ),
        ForeignKey(
            entity = TItemlist::class,
            childColumns = arrayOf("ItemNo"),
            parentColumns = arrayOf("ItemNo")
        )],
    indices = [
        Index("StoreId"),
        Index("ItemNo")]
)
data class TStoreProduct(
    @ColumnInfo(name = "StoreId") val storeId: Long,
    @ColumnInfo(name = "ItemNo") val itemNo: Long,
    @ColumnInfo(name = "bFree") val bFree: Long,
    @ColumnInfo(name = "UpdateTs") val updateTs: String,
    @ColumnInfo(name = "CreateTs") val createTs: String
)
