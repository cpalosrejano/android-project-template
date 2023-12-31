package io.kikiriki.app.data.model.domain

import io.kikiriki.app.data.model.local.NoteLocal
import io.kikiriki.app.data.model.remote.NoteRemote
import io.kikiriki.app.utils.DateFormat
import io.kikiriki.app.utils.extension.format
import java.util.Date

data class Note(
    val id: Long?,
    val text: String?,
    val createdAt: Date?,
    val updatedAt: Date?
)

fun Note.toRemote(): NoteRemote {
    return NoteRemote(
        id = this.id,
        text = this.text,
        createdAt = this.createdAt.format(DateFormat.FULL_DATE),
        updatedAt = this.updatedAt?.format(DateFormat.FULL_DATE)
    )
}

fun Note.toLocal(): NoteLocal {
    return NoteLocal(
        id = this.id,
        text = this.text,
        createdAt = this.createdAt.format(DateFormat.FULL_DATE),
        updatedAt = this.updatedAt?.format(DateFormat.FULL_DATE)
    )
}

