package io.kikiriki.app.data.model.local

import io.kikiriki.app.data.model.domain.Note
import io.kikiriki.app.utils.DateFormat
import io.kikiriki.app.utils.extension.orNow
import io.kikiriki.app.utils.extension.toDate

data class NoteLocal(
    val id: Long?,
    val text: String?,
    val createdAt: String?,
    val updatedAt: String?
)

fun NoteLocal.toDomain() : Note {
    return Note(
        id = this.id,
        text = this.text,
        createdAt = this.createdAt.toDate(DateFormat.FULL_DATE).orNow(),
        updatedAt = this.updatedAt.toDate(DateFormat.FULL_DATE)
    )
}

fun List<NoteLocal>.toDomain() : List<Note> {
    return this.map { it.toDomain() }
}