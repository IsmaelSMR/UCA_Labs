package com.damo.ucalabs

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "PcEntity")
data class PcEntity(
    @PrimaryKey(autoGenerate = true)
    var idPc: Long = 0,
    var nombre: String = "",
    var descripcion: String = "",
    var marca: String = "",
    var modelo: String = "",
    var procesador: String = "",
    var ram: Int,
    var almacenamiento: Float,
    var service_tag: String = "",
    var no_inventario: String = "",
    var ubicacion: Int,
)
