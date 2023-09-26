package io.kikiriki.app.ui.main

import io.kikiriki.app.data.model.domain.Note

data class MainUIState(
    val isLoading: Boolean = false,
    val items: List<Note> = listOf(),
    val error: Int? = null
)