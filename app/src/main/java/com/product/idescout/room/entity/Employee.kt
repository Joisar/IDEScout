package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "employee",
    primaryKeys = ["EmpCode"],
    foreignKeys = [
        ForeignKey(
            entity = TFacility::class,
            childColumns = arrayOf("FacilityId"),
            parentColumns = arrayOf("FacilityId")
        )],
    indices = arrayOf(Index(value = ["UserId", "FacilityId"], unique = true))
)
data class Employee(
    @ColumnInfo(name = "EmpCode") val empCode: Long,
    @ColumnInfo(name = "EmpName") val empName: String,
    @ColumnInfo(name = "DesigCode") val desigCode: Long?,
    @ColumnInfo(name = "UserId") val userId: String,
    @ColumnInfo(name = "UserPwd") val userPwd: String,
    @ColumnInfo(name = "bActive") val bActive: Long,
    @ColumnInfo(name = "MobileNo") val mobileNo: String,
    @ColumnInfo(name = "Email") val email: String,
    @ColumnInfo(name = "DefaultLanguage") val defaultLanguage: String,
    @ColumnInfo(name = "FacilityId") val facilityId: Long?,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?
)
