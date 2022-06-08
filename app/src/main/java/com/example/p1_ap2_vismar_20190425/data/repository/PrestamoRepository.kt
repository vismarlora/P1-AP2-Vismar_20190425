package com.example.p1_ap2_vismar_20190425.data.repository

import com.example.p1_ap2_vismar_20190425.data.PrestamoDao
import com.example.p1_ap2_vismar_20190425.model.Prestamo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PrestamoRepository @Inject constructor(
    val prestamoDao: PrestamoDao
){
    suspend fun insertar(prestamo: Prestamo){
        prestamoDao.insertar(prestamo)
    }

    suspend fun eliminar(prestamo: Prestamo){
        prestamoDao.eliminar(prestamo)
    }

    fun buscar(prestamoId: Int): Flow<Prestamo> {
        return prestamoDao.buscar(prestamoId)
    }

    fun getList(): Flow<List<Prestamo>> {
        return prestamoDao.getList()
    }
}