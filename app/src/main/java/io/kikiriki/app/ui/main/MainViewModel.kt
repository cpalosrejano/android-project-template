package io.kikiriki.app.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.kikiriki.app.domain.note.GetNotesUseCase
import io.kikiriki.app.utils.ExceptionManager
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val getNotesUseCase: GetNotesUseCase
) : ViewModel() {

    private val _uiState: MutableLiveData<MainUIState> = MutableLiveData(MainUIState())
    val uiState: LiveData<MainUIState> = _uiState

    fun getNotes() = viewModelScope.launch {
        _uiState.value = MainUIState(isLoading = true)

        try {
            // get the result and send to the UI
            val result = getNotesUseCase().getOrThrow()
            _uiState.value = MainUIState(isLoading = false, error = null, items = result)

        } catch (e: Exception) {
            // get the exception and send to the UI
            val error = ExceptionManager.getMessage(e)
            _uiState.value = MainUIState(isLoading = false, error = error)

        }

    }

}