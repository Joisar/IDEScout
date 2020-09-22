package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "formaccess",
    primaryKeys = ["FormId", "EmpCode"],
    foreignKeys = [
        ForeignKey(
            entity = Formlist::class,
            childColumns = arrayOf("FormId"),
            parentColumns = arrayOf("FormId")
        ),
        ForeignKey(
            entity = Employee::class,
            childColumns = arrayOf("EmpCode"),
            parentColumns = arrayOf("EmpCode")
        )],
    indices = [
        Index("FormId"),
        Index("EmpCode")]
)
data class Formaccess(
    @ColumnInfo(name = "FormId") val formId: String,
    @ColumnInfo(name = "EmpCode") val empCode: Long,
    @ColumnInfo(name = "bAccess") val bAccess: Long?,
    @ColumnInfo(name = "FacilityId") val facilityId: Long?
)
