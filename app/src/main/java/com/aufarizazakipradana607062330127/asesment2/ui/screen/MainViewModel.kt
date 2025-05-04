package com.aufarizazakipradana607062330127.asesment2.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aufarizazakipradana607062330127.asesment2.database.KelolaProdukDao
import com.aufarizazakipradana607062330127.asesment2.model.KelolaProduk
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn

class MainViewModel(dao: KelolaProdukDao) : ViewModel() {

    val data: StateFlow<List<KelolaProduk>> = dao.getProduk().stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(),
        initialValue = emptyList()
    )
}