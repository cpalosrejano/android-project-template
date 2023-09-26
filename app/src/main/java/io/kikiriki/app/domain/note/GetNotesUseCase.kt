package io.kikiriki.app.domain.note

import io.kikiriki.app.data.model.domain.Note
import io.kikiriki.app.data.repository.note.NoteRepository
import javax.inject.Inject

class GetNotesUseCase @Inject constructor(
    private val noteRepository: NoteRepository
) {

    suspend operator fun invoke () : Result<List<Note>> {
        return noteRepository.getAll()
    }

}