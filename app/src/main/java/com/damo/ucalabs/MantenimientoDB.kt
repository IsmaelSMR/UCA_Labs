package com.damo.ucalabs

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(PcEntity::class), version = 1)
abstract class MantenimientoDB : RoomDatabase(){
    abstract fun pcDao() : PcDao
}