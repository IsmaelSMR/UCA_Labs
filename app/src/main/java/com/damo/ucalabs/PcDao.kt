package com.damo.ucalabs

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface PcDao {
    @Query("SELECT * FROM PcEntity")
    fun getAllPc() : MutableList<PcEntity>

    @Insert
    fun addPc(pcEntity : PcEntity) : Long

    @Update
    fun updatePc(pcEntity: PcEntity)

    @Delete
    fun deletePc(pcEntity: PcEntity)
}