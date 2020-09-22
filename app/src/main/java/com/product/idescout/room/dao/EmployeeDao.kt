package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.Employee

@Dao
interface EmployeeDao {
    @Query("SELECT * FROM employee")
    fun getEmployees(): List<Employee>

    @Insert
    fun insertEmployees(vararg employees: Employee)

    @Update
    fun updateEmployee(employee: Employee)

    @Delete
    fun deleteEmployee(employee: Employee)
}