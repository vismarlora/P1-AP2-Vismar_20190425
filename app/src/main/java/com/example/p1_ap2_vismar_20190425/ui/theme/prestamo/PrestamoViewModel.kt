package com.example.p1_ap2_vismar_20190425.ui.theme.prestamo

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.p1_ap2_vismar_20190425.data.repository.PrestamoRepository
import com.example.p1_ap2_vismar_20190425.model.Prestamo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel

class PrestamoViewModel @Inject constructor(
    val prestamoRepository: PrestamoRepository
): ViewModel() {
    var deudor by mutableStateOf("")
    var concepto by mutableStateOf("")
    var monto by mutableStateOf(0.00f)

    fun Guardar(){
        viewModelScope.launch {
            prestamoRepository.insertar(
                Prestamo(
                    deudor = deudor,
                    concepto = concepto,
                    monto = monto
                )
            )
        }
    }
}